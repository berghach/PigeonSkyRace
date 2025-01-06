package com.example.PigeonsVoyageurs.repositories;

import com.example.PigeonsVoyageurs.entities.Pigeon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PigeonRepository extends JpaRepository<Pigeon, UUID> {
}
