package com.app.service;

import com.app.dto.AccountDto;

public interface AccountService extends BaseService<AccountDto, Integer> {
    AccountDto findByEmail(String username);
}
