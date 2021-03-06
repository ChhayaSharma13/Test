package com.urlshortner.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UrlException extends RuntimeException{

    public UrlException(String msg) {
        super(msg);
    }
}
