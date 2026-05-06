package com.makhaya.stockmanagement.handlers;

import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.spi.ErrorCodes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {

    private Integer httpCode;
    private String message;
    private ErrorCodes errorCode;
    private List<String> errors = new ArrayList<>();
    
}
