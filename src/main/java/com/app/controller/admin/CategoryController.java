package com.app.controller.admin;

import com.app.dto.BrandDto;
import com.app.dto.CategoryDto;
import com.app.service.CategoryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/admin/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("findAll")
    public ResponseEntity<String> findAll() {
        try {
            List<CategoryDto> categories = categoryService.findAll();
            return new ResponseEntity<>(objectMapper.writeValueAsString(categories), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("deleteById")
    public ResponseEntity<String> deleteById(@RequestParam Integer id) {
        try {
            if (categoryService.deleteById(id)) {
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
            CategoryDto categoryDto = objectMapper.readValue(json, CategoryDto.class);
            categoryDto = categoryService.insert(categoryDto);
            if (categoryDto != null) {
                return new ResponseEntity<>(objectMapper.writeValueAsString(categoryDto), HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }



}
