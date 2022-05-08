package com.app.dto;

import com.app.entity.Order;
import com.app.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDto {

    private Integer id;

    private Double price;

    private Integer quantity;

    private Integer orderId;

    private Integer productId;

    private String productName;

    private Double lineTotal = (quantity * price);


}
