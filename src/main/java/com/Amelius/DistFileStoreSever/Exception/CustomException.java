package com.Amelius.DistFileStoreSever.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CustomException extends RuntimeException{

    String message;
    String nextSteps;
    HttpStatus httpStatus;

}
