package com.example.PigeonsVoyageurs.dtos.request;


import lombok.Builder;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder(builderClassName = "Builder")
public record CompetitionRequestDTO(
        @NotNull(message = "Race name is required")
        String raceName,

        @NotNull(message = "the competition start time is required")
        LocalDateTime startAt,

        @NotNull(message = "Previewed distance is required")
        double distance,

        @NotNull(message = "Start point latitude is required")
        double startLatitude,

        @NotNull(message = "Start point longitude is required")
        double startLongitude
) {}
