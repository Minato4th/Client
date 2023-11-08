package com.example.client.Service;

import org.springframework.http.ResponseEntity;

public interface ServiceCall {

    ResponseEntity<?> requestFromServer();
}
