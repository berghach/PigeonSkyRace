package com.example.PigeonsVoyageurs.repositories;

import com.example.PigeonsVoyageurs.entities.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingRepository extends JpaRepository<Ranking, Long> {
}
