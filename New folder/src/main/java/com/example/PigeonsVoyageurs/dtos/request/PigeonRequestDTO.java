package com.example.PigeonsVoyageurs.dtos.request;

import com.example.PigeonsVoyageurs.enumeration.Sexe;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

@Builder(builderClassName = "Builder")
public record PigeonRequestDTO(
        @NotNull(message = "The pigeon sexe is required")
        Sexe sexe,

        @NotNull(message = "The pigeon color is required")
        String color,

        @NotNull(message = "The pigeon age is required")
        int age
) {}