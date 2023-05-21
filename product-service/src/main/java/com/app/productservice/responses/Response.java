package com.app.productservice.responses;

import org.springframework.http.HttpStatus;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Response {
    String message;
    HttpStatus status;
}
