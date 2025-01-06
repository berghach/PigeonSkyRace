package com.example.PigeonsVoyageurs.dtos.response;

import com.example.PigeonsVoyageurs.entities.User;
import com.example.PigeonsVoyageurs.enumeration.Sexe;
import com.example.PigeonsVoyageurs.entities.Ranking;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PigeonResponseDTO {
    private UUID id;

    private Sexe sexe;

    private String color;

    private int age;

    private String owner;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
