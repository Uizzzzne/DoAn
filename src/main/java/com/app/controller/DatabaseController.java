package com.app.controller;

import com.app.entity.Brand;
import com.app.entity.Category;
import com.app.entity.Image;
import com.app.entity.Product;
import com.app.repository.BrandRepository;
import com.app.repository.CategoryRepository;
import com.app.repository.ImageRepository;
import com.app.repository.ProductRepository;
import com.app.util.Common;
import com.app.util.DataValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("database")
public class DatabaseController {
	
	@Autowired
	private Common common;
	
	@Autowired
	private Random random;
	
	@Value("${domain}")
	private String domain;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ImageRepository imageRepository;
	
	/**
	 * API tạo data mẫu
	 */
	@GetMapping("")
	public ResponseEntity<String> init() {
		try {
			initCategory();
			initBrand();
			initProduct();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	private void initCategory() {
		
		String[] categoryName = DataValue.CATEGORY_NAME;
		
		for (String s : categoryName) {
			if (s != null) {
				Category category = new Category()
						.setName(s)
						.setDescription(common.randString(DataValue.DESCRIPTION));
				categoryRepository.save(category);
			}
		}
	}
	
	private void initBrand() {
		String[] brandName = DataValue.BRAND_NAME;
		
		for (String s : brandName) {
			Brand brand = new Brand()
					.setName(s)
					.setDescription(common.randString(DataValue.DESCRIPTION));
			brandRepository.save(brand);
		}
	}
	
	public void initProduct() {
		List<Category> categories = categoryRepository.findAll();
		List<Brand> brands = brandRepository.findAll();
		
		List<String> imageNames = new ArrayList<>();
		for (var i = 0; i < 50; i++) {
			String name = domain + "assets/images/products/" + (i + 1) + ".png";
			imageNames.add(name);
		}
		
		for (Category category : categories) {
			for (var i = 0; i < random.nextInt(30); i++) {
				Product product = new Product()
						.setName(category.getName() + " PN " + i)
						.setDescription(common.randString(DataValue.DESCRIPTION))
						.setQuantity(random.nextInt(100))
						.setPrice((double) (random.nextInt(100) * 1000))
						.setCategory(category)
						.setBrand(brands.get(random.nextInt(brands.size())));
				
				productRepository.save(product);
				
				for (var j = 0; j < 3; j++) {
					Image image = new Image()
							.setProduct(product)
							.setUrl(imageNames.get(random.nextInt(imageNames.size())));
					imageRepository.save(image);
				}
			}
		}
	}
	
	
}
