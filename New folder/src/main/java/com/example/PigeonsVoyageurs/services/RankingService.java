package com.example.PigeonsVoyageurs.services;

import com.example.PigeonsVoyageurs.dtos.request.RankingRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.RankingResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RankingService {
    
    public Optional<RankingResponseDTO> get(UUID id) {
        return Optional.empty();
    }

    
    public List<RankingResponseDTO> getAll() {
        return List.of();
    }

    
    public RankingResponseDTO save(RankingRequestDTO reqEntity) {
        return null;
    }

    
    public RankingResponseDTO update(RankingRequestDTO reqEntity, UUID oldId) {
        return null;
    }

    
    public boolean delete(UUID oldId) {
        return false;
    }
}
