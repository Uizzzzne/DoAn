package com.app.transfer;

import com.app.dto.AccountDto;
import com.app.dto.OrderDto;
import com.app.entity.Account;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class AccountTransfer implements BaseTransfer<Account, AccountDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private OrderTransfer orderTransfer;

    @Override
    public Account toEntity(AccountDto accountDto) {
        return null;
    }

    @Override
    public AccountDto toDto(Account account) {

        if (account == null)
            return null;

        AccountDto accountDto = modelMapper.map(account, AccountDto.class);

        accountDto.setRoleId(account.getRole().getId())
                .setRoleName(account.getRole().getName());

        if (account.getOrders() != null) {
            accountDto.setOrderDtos(account.getOrders()
                    .stream()
                    .map(order -> orderTransfer.toDto(order))
                    .collect(Collectors.toList()));
        }

        return accountDto;
    }
}
