package com.Amelius.DistFileStoreSever.Controllers;


import com.Amelius.DistFileStoreSever.Exception.CustomException;
import com.Amelius.DistFileStoreSever.Exception.CustomExceptionResponse;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ExceptionController {
    ModelMapper mapper=new ModelMapper();

    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<?> handleCustomConflict(CustomException ex){
        CustomExceptionResponse cus=mapper.map(ex,CustomExceptionResponse.class);
        cus.setDate(new Date(System.currentTimeMillis()));
        return new ResponseEntity<>(cus, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<?> handleAnyException(Exception ex){
        CustomExceptionResponse customExceptionResponse=mapper.map(ex,CustomExceptionResponse.class);
        System.out.println(ex.getMessage());
        System.out.println(customExceptionResponse.getMessage());
        customExceptionResponse.setDate(new Date(System.currentTimeMillis()));
        return new ResponseEntity<>(customExceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
