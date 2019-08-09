package com.stackroute.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * @ControllerAdvice annotation provided by Spring allows you to write global
 * code that can be applied to a wide range of controllers
 */
@ControllerAdvice
public class GlobalExceptions extends ResponseEntityExceptionHandler {

    /**Handles exception thrown ny service class*/
    @ExceptionHandler(value = TrackNotFoundExceptions.class)
    public ResponseEntity<Object> notFoundException(TrackNotFoundExceptions exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = TrackAlreadyExistExceptions.class)
    public ResponseEntity<Object> alreadyExistsException(TrackAlreadyExistExceptions exception) {
        return new ResponseEntity<>("Track already exists", HttpStatus.CONFLICT);
    }

}
