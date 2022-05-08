package com.app.dto;

import com.app.entity.Account;
import com.app.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private Integer id;

    private LocalDateTime orderDate;

    private String orderDateFormat;

    private Integer accountId;

    private String accountEmail;

    private String accountName;

    private List<OrderDetailDto> orderDetailDtos;

    private Double subTotal;


}
