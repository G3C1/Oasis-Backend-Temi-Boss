package com.g3c1.temiboss.global.exception.handler;

import com.g3c1.temiboss.domain.category.exception.CategoryNotFoundException;
import com.g3c1.temiboss.domain.seat.exception.SeatNotAbleException;
import com.g3c1.temiboss.domain.seat.exception.SeatNotFoundException;
import com.g3c1.temiboss.domain.seat.exception.SeatNumberAlreadyExistException;
import com.g3c1.temiboss.global.exception.ErrorResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {
    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleCategoryNotFoundException(CategoryNotFoundException exception) {
        ErrorResponse errorResponse= new ErrorResponse(exception.getErrorCode().getMessage(),exception.getErrorCode().getStatus());
        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(exception.getErrorCode().getStatus()));
    }
    @ExceptionHandler(SeatNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleSeatNotFoundException(SeatNotFoundException exception) {
        ErrorResponse errorResponse= new ErrorResponse(exception.getErrorCode().getMessage(),exception.getErrorCode().getStatus());
        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(exception.getErrorCode().getStatus()));
    }
    @ExceptionHandler(SeatNotAbleException.class)
    public ResponseEntity<ErrorResponse> handleSeatNotAbleException(SeatNotAbleException exception) {
        ErrorResponse errorResponse= new ErrorResponse(exception.getErrorCode().getMessage(),exception.getErrorCode().getStatus());
        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(exception.getErrorCode().getStatus()));
    }
    @ExceptionHandler(SeatNumberAlreadyExistException.class)
    public ResponseEntity<ErrorResponse> handleSeatNumberAlreadyExistException(SeatNumberAlreadyExistException exception) {
        ErrorResponse errorResponse= new ErrorResponse(exception.getErrorCode().getMessage(),exception.getErrorCode().getStatus());
        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(exception.getErrorCode().getStatus()));
    }

}
