package com.eazybaniking.accounts.services;

import com.eazybaniking.accounts.DTO.CustomerDTO;

public interface IAccountsService {

    /**
     *
     * @param customerDTO - CustomerDTO Object
     */
    void createAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Account Details based on a given mobile number
     */
    CustomerDTO fetchAccount(String mobileNumber);

}
