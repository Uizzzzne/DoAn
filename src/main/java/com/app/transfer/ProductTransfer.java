package com.app.transfer;

import com.app.dto.ProductDto;
import com.app.entity.Product;
import com.app.util.Common;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProductTransfer implements BaseTransfer<Product, ProductDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ImageTransfer imageTransfer;

    @Autowired
    private Common common;

    @Override
    public Product toEntity(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto toDto(Product product) {

        if (product == null)
            return null;

        ProductDto productDto = modelMapper.map(product, ProductDto.class);

        if (product.getCategory() != null) {
            productDto.setCategoryId(product.getCategory().getId())
                    .setCategoryName(product.getCategory().getName())
                    .setBrandId(product.getBrand().getId())
                    .setBrandName(product.getBrand().getName());
        }
        if (product.getImages() != null) {
            productDto.setImageDtos(
                product.getImages()
                    .stream()
                    .map(image -> imageTransfer.toDto(image))
                    .collect(Collectors.toList())
            );

            productDto.setFirstImageUrl(productDto.getImageDtos().get(0).getUrl());
        }

        productDto.setPriceFormat(
            common.formatPrice(productDto.getPrice())
        );

        return productDto;
    }
}
