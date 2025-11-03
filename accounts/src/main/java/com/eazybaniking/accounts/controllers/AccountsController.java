package com.eazybaniking.accounts.controllers;

import com.eazybaniking.accounts.DTO.CustomerDTO;
import com.eazybaniking.accounts.DTO.ResponseDTO;
import com.eazybaniking.accounts.services.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.eazybaniking.accounts.constants.AccountsConstants.*;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/api", produces = {APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

    private IAccountsService iAccountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {
        iAccountsService.createAccount(customerDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO(STATUS_201, MESSAGE_200));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDTO> fetchAccountDetails(@RequestParam String mobileNumber){
        CustomerDTO customerDTO =  iAccountsService.fetchAccount(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(customerDTO);

    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAccountDetails(@RequestBody CustomerDTO customerDTO) {
        boolean isUpdated = iAccountsService.updateAccount(customerDTO);

        if(isUpdated) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDTO(STATUS_200, MESSAGE_200));
        }else {
            return ResponseEntity
                    .status(INTERNAL_SERVER_ERROR)
                    .body(new ResponseDTO(STATUS_500, MESSAGE_500));
        }
    }

}
