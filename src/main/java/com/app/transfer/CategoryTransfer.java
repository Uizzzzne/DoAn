package com.app.transfer;

import com.app.dto.CategoryDto;
import com.app.dto.ProductDto;
import com.app.entity.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryTransfer implements BaseTransfer<Category, CategoryDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductTransfer productTransfer;

    @Override
    public Category toEntity(CategoryDto categoryDto) {
        return modelMapper.map(categoryDto, Category.class);
    }

    @Override
    public CategoryDto toDto(Category category) {

        if (category == null)
            return null;

        CategoryDto categoryDto = modelMapper.map(category, CategoryDto.class);

        if (category.getProducts() != null) {
            categoryDto.setProductDtos(
                    category.getProducts()
                            .stream()
                            .map(product -> productTransfer.toDto(product))
                            .collect(Collectors.toList())
            );
        }

        return categoryDto;
    }
}
