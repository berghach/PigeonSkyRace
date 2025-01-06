package com.example.PigeonsVoyageurs.controllers;

import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import com.example.PigeonsVoyageurs.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final UserService userService;

    @GetMapping
    public String greeting(){
        return "here for authentication!";
    }
    @PostMapping("/signup")
    public ResponseEntity<UserResponseDTO> signUp(@RequestBody UserRequestDTO userRequestDTO){
        System.out.println(userRequestDTO);
        UserResponseDTO userResponseDTO = userService.save(userRequestDTO);
        return ResponseEntity.ok(userResponseDTO);
    }
}
