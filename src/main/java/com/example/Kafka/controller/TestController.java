package com.example.Kafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("kafka/test")
    public ResponseEntity<String> getTestKafkaController() {

        String hello = "Hello from kafka controller.";
        return new ResponseEntity<>(hello, HttpStatus.OK);
    }
}
