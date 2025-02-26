package com.example.PigeonsVoyageurs.controllers;

import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import com.example.PigeonsVoyageurs.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestingController {

    @GetMapping
    public String greeting(){
        return "hello, world!";
    }

    @GetMapping("/secure")
    public ResponseEntity<Object> getAuthenticatedUser(Authentication authentication){
        return ResponseEntity.ok(authentication.getPrincipal());
    }
}
