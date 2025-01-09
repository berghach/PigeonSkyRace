package com.example.PigeonsVoyageurs.controllers;

import com.example.PigeonsVoyageurs.dtos.request.PigeonRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.PigeonResponseDTO;
import com.example.PigeonsVoyageurs.services.PigeonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pigeons")
public class PigeonController {

    private final PigeonService pigeonService;

    @GetMapping
    public String greeting(){
        return "here for pigeons!";
    }

    @PostMapping("/add")
    public ResponseEntity<PigeonResponseDTO> addPigeon(@RequestBody PigeonRequestDTO pigeonRequestDTO){
        System.out.println(pigeonRequestDTO);
        PigeonResponseDTO pigeonResponseDTO = pigeonService.save(pigeonRequestDTO);
        return ResponseEntity.ok(pigeonResponseDTO);
    }
}
