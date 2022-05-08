package com.app.dto;

import com.app.entity.Product;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CategoryDto {

    private Integer id;

    private String name;

    private String description;

    private List<ProductDto> productDtos;
}
