package com.app.transfer;

import com.app.dto.OrderDetailDto;
import com.app.dto.OrderDto;
import com.app.entity.Order;
import com.app.entity.OrderDetail;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class OrderTransfer implements BaseTransfer<Order, OrderDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private OrderDetailTransfer orderDetailTransfer;

    @Override
    public Order toEntity(OrderDto orderDto) {
        return null;
    }

    @Override
    public OrderDto toDto(Order order) {

        if (order == null)
            return null;

        OrderDto orderDto = modelMapper.map(order, OrderDto.class);

        if (order.getAccount() != null) {

            orderDto.setAccountId(order.getAccount().getId())
                    .setAccountEmail(order.getAccount().getEmail())
                    .setAccountName(order.getAccount().getName());
        }
        if (order.getOrderDetails() != null) {

            orderDto.setOrderDetailDtos(order.getOrderDetails()
                    .stream()
                    .map(orderDetail -> orderDetailTransfer.toDto(orderDetail))
                    .collect(Collectors.toList()));
        }
        return orderDto;
    }
}
