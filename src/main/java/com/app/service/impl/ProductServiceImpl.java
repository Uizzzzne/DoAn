package com.app.service.impl;

import com.app.dto.ProductDto;
import com.app.entity.Product;
import com.app.repository.ProductRepository;
import com.app.service.ProductService;
import com.app.transfer.ProductTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductTransfer productTransfer;

    @Override
    public List<ProductDto> findAll() {
        List<Product> products = productRepository.findAllByOrderByIdDesc();
        return products.stream()
                .map(product -> productTransfer.toDto(product))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto findById(Integer id) {
        return null;
    }

    @Override
    public ProductDto insert(ProductDto productDto) {
        Product product = productTransfer.toEntity(productDto);
        productRepository.save(product);
        return productTransfer.toDto(product);
    }

    @Override
    public ProductDto update(ProductDto productDto) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
            productRepository.delete(product);
            return true;
        }
        return false;
    }
}
