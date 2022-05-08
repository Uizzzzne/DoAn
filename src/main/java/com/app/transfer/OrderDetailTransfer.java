package com.app.transfer;

import com.app.dto.OrderDetailDto;
import com.app.entity.OrderDetail;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailTransfer implements BaseTransfer<OrderDetail, OrderDetailDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OrderDetail toEntity(OrderDetailDto orderDetailDto) {
        return null;
    }

    @Override
    public OrderDetailDto toDto(OrderDetail orderDetail) {

       if (orderDetail == null)
           return null;

        OrderDetailDto orderDetailDto = modelMapper.map(orderDetail, OrderDetailDto.class);

        if (orderDetail.getOrder() != null) {
            orderDetailDto.setOrderId(orderDetail.getOrder().getId())
                    .setProductId(orderDetail.getProduct().getId())
                    .setProductName(orderDetail.getProduct().getName())
                    .setLineTotal(orderDetail.getPrice()* orderDetail.getQuantity());
        }
        return orderDetailDto;
    }
}
