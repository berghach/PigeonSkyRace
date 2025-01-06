package com.example.PigeonsVoyageurs.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "ranking",
        uniqueConstraints = @UniqueConstraint(
                name = "combination_must_be_unique",
                columnNames = {"competition_id", "pigeon_id"}
        )
)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;

    @ManyToOne
    @JoinColumn(name = "pigeon_id")
    private Pigeon pigeon;

    @Column(name = "position")
    private int position;

    @Column(name = "distance")
    private double distance;

    @Column(name = "duration")
    private LocalTime duration;

    @Column(name = "speed")
    private double speed;

    @Column(name = "score")
    private double score;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Pigeon getPigeon() {
        return pigeon;
    }

    public void setPigeon(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
