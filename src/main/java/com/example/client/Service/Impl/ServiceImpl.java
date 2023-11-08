package com.example.client.Service.Impl;

import com.example.client.Service.ServiceCall;
import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Data
@Service
public class ServiceImpl implements ServiceCall {

    private final RestTemplate restTemplate;

    public ServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<?> requestFromServer() {
        return restTemplate.exchange(
                URI.create("http://localhost:8080/"),
                HttpMethod.GET,
                null,
                String[].class);
    }
}
