package com.example.client.Controllers;

import com.example.client.Service.ServiceCall;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class Controller {
    private ServiceCall serviceCall;

    public Controller(ServiceCall serviceCall) {
        this.serviceCall = serviceCall;
    }

    @GetMapping
    public ResponseEntity<?> getResponseFromServer(){
        return serviceCall.requestFromServer();
    }
}
