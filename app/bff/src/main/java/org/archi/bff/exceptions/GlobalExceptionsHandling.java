package org.archi.bff.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.archi.bff.response.ExceptionResponse;
import org.springframework.core.NestedRuntimeException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice(annotations = RestController.class)
@Order(1)
public class GlobalExceptionsHandling {
  @ExceptionHandler({NestedRuntimeException.class})
  public ResponseEntity<ExceptionResponse> handleNestedRuntimeException(NestedRuntimeException exception) {
    return ResponseEntity.ok().body(new ExceptionResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),  "Invalid input params", null));
  }


  @ExceptionHandler({RuntimeException.class})
  public ResponseEntity<ExceptionResponse> handleRuntimeException(RuntimeException exception) {
    return ResponseEntity.ok().body(new ExceptionResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),  exception.getMessage(),null));
  }
}
