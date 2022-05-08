package com.app.transfer;

import com.app.dto.BrandDto;
import com.app.entity.Brand;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class BrandTransfer implements BaseTransfer<Brand, BrandDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductTransfer productTransfer;

    @Override
    public Brand toEntity(BrandDto brandDto) {
        return null;
    }

    @Override
    public BrandDto toDto(Brand brand) {

        if(brand == null)
            return null;

        BrandDto brandDto = modelMapper.map(brand, BrandDto.class);

        if (brand.getProducts() != null) {

            brandDto.setProductDtos(brand.getProducts()
                    .stream()
                    .map(product -> productTransfer.toDto(product))
                    .collect(Collectors.toList()));
        }

            return brandDto;
        }

}
