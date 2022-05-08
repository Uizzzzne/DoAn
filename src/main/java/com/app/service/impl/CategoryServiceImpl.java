package com.app.service.impl;

import com.app.dto.CategoryDto;
import com.app.entity.Category;
import com.app.repository.CategoryRepository;
import com.app.service.CategoryService;
import com.app.transfer.CategoryTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryTransfer categoryTransfer;

    @Override
    public List<CategoryDto> findAll() {
        List<Category> categories = categoryRepository.findAllByOrderByIdDesc();
        return categories.stream()
                .map(category -> categoryTransfer.toDto(category))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto findById(Integer id) {
        return null;
    }

    @Override
    public CategoryDto insert(CategoryDto categoryDto) {
        Category category = categoryTransfer.toEntity(categoryDto);
        categoryRepository.save(category);
        return categoryTransfer.toDto(category);
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        Category category = categoryRepository.findById(id).orElse(null);
        if (category != null) {
            categoryRepository.delete(category);
            return true;
        }
        return false;
    }
}
