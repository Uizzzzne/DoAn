package com.app.dto;

import com.app.entity.Brand;
import com.app.entity.Category;
import com.app.entity.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Integer id;

    private String name;

    private String description;

    private Integer quantity;

    private Double price;

    private String priceFormat;

    private Integer categoryId;

    private String categoryName;

    private Integer brandId;

    private String brandName;

    private List<ImageDto> imageDtos;

    private String firstImageUrl;

}
