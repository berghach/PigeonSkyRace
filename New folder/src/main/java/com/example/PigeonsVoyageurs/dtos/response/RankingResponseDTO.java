package com.example.PigeonsVoyageurs.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RankingResponseDTO {
    UUID id;
    String competitionName;
    String pigeonRing;
    int position;
    double distance;
    java.time.LocalTime duration;
    double speed;
    double score;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public void setPigeonRing(String pigeonRing) {
        this.pigeonRing = pigeonRing;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setScore(double score) {
        this.score = score;
    }
}