package com.app.service.impl;

import com.app.dto.AccountDto;
import com.app.entity.Account;
import com.app.repository.AccountRepository;
import com.app.service.AccountService;
import com.app.transfer.AccountTransfer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountTransfer accountTransfer;

    @Override
    public List<AccountDto> findAll() {
        return null;
    }

    @Override
    public AccountDto findById(Integer id) {
        return null;
    }

    @Override
    public AccountDto insert(AccountDto accountDto) {
        return null;
    }

    @Override
    public AccountDto update(AccountDto accountDto) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }


    @Override
    public AccountDto findByEmail(String email) {
        Account account  = accountRepository.findByEmail(email);
        return accountTransfer.toDto(account);
    }
}
