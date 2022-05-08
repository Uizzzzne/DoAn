package com.app.controller.admin;

import com.app.dto.CategoryDto;
import com.app.dto.ProductDto;
import com.app.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/admin/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("findAll")
    public ResponseEntity<String> findAll() {
        try {
            List<ProductDto> products = productService.findAll();
            return new ResponseEntity<>(objectMapper.writeValueAsString(products), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("deleteById")
    public ResponseEntity<String> deleteById(@RequestParam Integer id) {
        try {
            if (productService.deleteById(id)) {
                return new ResponseEntity<>(HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody String json) {
        try
        {
            ProductDto productDto = objectMapper.readValue(json, ProductDto.class);
            productDto = productService.insert(productDto);
            if (productDto != null) {
                return new ResponseEntity<>(objectMapper.writeValueAsString(productDto), HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }





    
}
