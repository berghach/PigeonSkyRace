package com.example.PigeonsVoyageurs.repositories;

import com.example.PigeonsVoyageurs.entities.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, UUID> {
}
