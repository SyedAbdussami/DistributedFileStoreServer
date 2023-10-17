package com.Amelius.DistFileStoreSever.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomExceptionResponse {
    String message;
    String nextSteps;
    HttpStatus httpStatus;
    Date date;
}
