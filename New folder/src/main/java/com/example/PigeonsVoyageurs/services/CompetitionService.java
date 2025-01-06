package com.example.PigeonsVoyageurs.services;

import com.example.PigeonsVoyageurs.dtos.request.CompetitionRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.CompetitionResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class CompetitionService {
    
    public Optional<CompetitionResponseDTO> get(UUID id) {
        return Optional.empty();
    }

    
    public List<CompetitionResponseDTO> getAll() {
        return List.of();
    }

    
    public CompetitionResponseDTO save(CompetitionRequestDTO reqEntity) {
        return null;
    }

    
    public CompetitionResponseDTO update(CompetitionRequestDTO reqEntity, UUID oldId) {
        return null;
    }

    
    public boolean delete(UUID oldId) {
        return false;
    }
}
