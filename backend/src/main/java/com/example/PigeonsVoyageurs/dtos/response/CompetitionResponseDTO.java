package com.example.PigeonsVoyageurs.dtos.response;

import com.example.PigeonsVoyageurs.entities.Ranking;
import com.example.PigeonsVoyageurs.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompetitionResponseDTO{
    private UUID id;

    private String raceName;

    private LocalDateTime startAt;

    private double distance;

    private double startLatitude;

    private double startLongitude;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public void setStartLongitude(double startLongitude) {
        this.startLongitude = startLongitude;
    }
}
