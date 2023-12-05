package com.bobr.springSecurityApp.exceptions.registration;

import org.springframework.http.HttpStatus;
import java.time.ZonedDateTime;


public record RegisterExceptionBody
        (
                String message,
                HttpStatus httpStatus,
                ZonedDateTime timestamp
        ) {}
