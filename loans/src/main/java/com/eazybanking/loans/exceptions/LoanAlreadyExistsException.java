package com.eazybanking.loans.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(value = BAD_REQUEST)
public class LoanAlreadyExistsException extends RuntimeException {
    public LoanAlreadyExistsException(String message){
        super(message);
    }
}
