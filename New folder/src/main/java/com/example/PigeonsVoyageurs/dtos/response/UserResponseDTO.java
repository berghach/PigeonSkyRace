package com.example.PigeonsVoyageurs.dtos.response;

import com.example.PigeonsVoyageurs.entities.Competition;
import com.example.PigeonsVoyageurs.entities.Pigeon;
import com.example.PigeonsVoyageurs.enumeration.Role;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private UUID id;

    private String username;

    private Role role;

    private String loftName;

    private double loftLatitude;

    private double loftLongitude;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setLoftName(String loftName) {
        this.loftName = loftName;
    }

    public void setLoftLatitude(double loftLatitude) {
        this.loftLatitude = loftLatitude;
    }

    public void setLoftLongitude(double loftLongitude) {
        this.loftLongitude = loftLongitude;
    }
}
