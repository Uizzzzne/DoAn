package com.app.dto;

import com.app.entity.Order;
import com.app.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AccountDto {

    private Integer id;

    private String name;

    private String phoneNumber;

    private String address;

    private String email;

    private String password;

    private Integer roleId;

    private String roleName;

    private List<OrderDto> orderDtos;
}
