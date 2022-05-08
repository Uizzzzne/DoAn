package com.app.transfer;

import com.app.dto.RoleDto;
import com.app.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RoleTransfer implements BaseTransfer<Role, RoleDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AccountTransfer accountTransfer;

    @Override
    public Role toEntity(RoleDto roleDto) {
        return null;
    }

    @Override
    public RoleDto toDto(Role role) {

        if(role == null)
            return null;

        RoleDto roleDto = modelMapper.map(role, RoleDto.class);

        if (role.getAccounts() != null) {

            roleDto.setAccountDtos(role.getAccounts()
                    .stream()
                    .map(account -> accountTransfer.toDto(account))
                    .collect(Collectors.toList()));
        }
        return roleDto;
    }
}
