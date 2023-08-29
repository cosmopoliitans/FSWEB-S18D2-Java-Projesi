package com.workintech.fruitvegetable.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandlerV {
    @ExceptionHandler
    public ResponseEntity<VegetableResponse> handleException(VegetableException vegetableException){
        VegetableResponse response = new VegetableResponse(vegetableException.getStatus().value(),
                vegetableException.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, vegetableException.getStatus());
    }
    @ExceptionHandler
    public ResponseEntity<VegetableResponse> handleException(Exception exception){
        VegetableResponse response = new VegetableResponse(HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
