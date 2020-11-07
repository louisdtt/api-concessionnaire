package com.api.concessionnaire.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class AlreadyExistingException extends Exception {

    public AlreadyExistingException() {
        super();
    }

    public AlreadyExistingException(String message) {
        super(message);
    }
}
