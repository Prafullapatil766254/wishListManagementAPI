package com.example.Service;

import com.example.CustomeExceptions.UserNotFoundException;
import com.example.Model.RequestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {


       @ExceptionHandler(UserNotFoundException.class)
       public ResponseEntity<RequestResponse> handleUserNotFoundException(UserNotFoundException e){
             RequestResponse response = new RequestResponse(HttpStatus.NOT_FOUND.value() , e.getMessage());
             return new ResponseEntity<>(response , HttpStatus.NOT_FOUND);
       }
}
