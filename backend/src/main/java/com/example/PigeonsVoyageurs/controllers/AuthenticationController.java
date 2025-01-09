package com.example.PigeonsVoyageurs.controllers;

import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import com.example.PigeonsVoyageurs.services.UserService;
import com.example.PigeonsVoyageurs.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final UserService userService;
    private final JwtUtil jwtUtil;

    @GetMapping
    public String greeting(){
        return "here for authentication!";
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(Authentication authentication){
        String username = authentication.getName();
        String token = jwtUtil.generateToken(username);
        return ResponseEntity.ok(token);
    }
    @PostMapping("/signup")
    public ResponseEntity<UserResponseDTO> signUp(@RequestBody UserRequestDTO userRequestDTO){
        System.out.println(userRequestDTO);
        UserResponseDTO userResponseDTO = userService.save(userRequestDTO);
        return ResponseEntity.ok(userResponseDTO);
    }
}
