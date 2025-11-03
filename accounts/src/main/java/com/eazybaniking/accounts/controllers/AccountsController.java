package com.eazybaniking.accounts.controllers;

import com.eazybaniking.accounts.DTO.CustomerDTO;
import com.eazybaniking.accounts.DTO.ResponseDTO;
import com.eazybaniking.accounts.services.IAccountsService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.eazybaniking.accounts.constants.AccountsConstants.MESSAGE_200;
import static com.eazybaniking.accounts.constants.AccountsConstants.STATUS_201;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/api", produces = {APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

    private IAccountsService iaccountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {
        iaccountsService.createAccount(customerDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO(STATUS_201, MESSAGE_200));
    }



}
