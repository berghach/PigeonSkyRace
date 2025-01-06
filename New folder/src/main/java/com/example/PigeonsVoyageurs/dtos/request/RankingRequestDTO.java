package com.example.PigeonsVoyageurs.dtos.request;

import lombok.Builder;

import java.time.LocalTime;
import java.util.UUID;

@Builder(builderClassName = "Builder")
public record RankingRequestDTO(
        UUID competitionId,
        UUID pigeonId,
        int position,
        double distance,
        LocalTime duration,
        double speed,
        double score
) {}
