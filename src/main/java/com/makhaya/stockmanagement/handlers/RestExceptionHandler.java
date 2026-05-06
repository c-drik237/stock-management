package com.makhaya.stockmanagement.handlers;

import com.makhaya.stockmanagement.ApiStockManagementApplication;
import com.makhaya.stockmanagement.repositories.ArticleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.makhaya.stockmanagement.exceptions.EntityNotFoundException;
import com.makhaya.stockmanagement.exceptions.InvalidEntityException;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    
    private final ArticleRepository articleRepository;
    private final ApiStockManagementApplication apiStockManagementApplication;

    RestExceptionHandler(ApiStockManagementApplication apiStockManagementApplication, ArticleRepository articleRepository) {
        this.apiStockManagementApplication = apiStockManagementApplication;
        this.articleRepository = articleRepository;
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorDto> handlerException(EntityNotFoundException exception, WebRequest webRequest){

        final HttpStatus notFound = HttpStatus.NOT_FOUND;
        final ErrorDto.builder().
                errorCode(exception.getErrorCode()).
                httpCode(notFound.value()).
                message(exception.getMessage()).
                errors(exception.getErrorCode()).
                build();  
        return new ResponseEntity<>(ErrorDto, notFound);
            
    }

    @ExceptionHandler(InvalidEntityException.class)
    public ResponseEntity<ErrorDto> handlerException(InvalidEntityException exception, WebRequest webRequest){

        final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        final ErrorDto.builder().
                errorCode(exception.getErrorCode()).
                httpCode(badRequest.value()).
                message(exception.getMessage()).
                errors(exception.getErrorCode()).
                build();  
        return new ResponseEntity<>(ErrorDto, badRequest);
       
    }
    
}
