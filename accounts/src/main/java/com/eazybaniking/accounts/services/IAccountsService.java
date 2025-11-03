package com.eazybaniking.accounts.services;

import com.eazybaniking.accounts.DTO.CustomerDTO;

public interface IAccountsService {

    /**
     *
     * @param customerDTO - CustomerDTO Object
     */
    void createAccount(CustomerDTO customerDTO);
}
