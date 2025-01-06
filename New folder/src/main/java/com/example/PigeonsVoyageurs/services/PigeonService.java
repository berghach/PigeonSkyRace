package com.example.PigeonsVoyageurs.services;

import com.example.PigeonsVoyageurs.dtos.request.PigeonRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.PigeonResponseDTO;
import com.example.PigeonsVoyageurs.entities.Pigeon;
import com.example.PigeonsVoyageurs.mappers.PigeonMapper;
import com.example.PigeonsVoyageurs.repositories.PigeonRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PigeonService {

    private final PigeonRepository pigeonRepository;
    private final PigeonMapper pigeonMapper;
    
    public Optional<PigeonResponseDTO> get(UUID id) {
        Pigeon pigeon = pigeonRepository.getReferenceById(id);
        PigeonResponseDTO pigeonResponseDTO = pigeonMapper.toResponseDTO(pigeon);
        return Optional.of(pigeonResponseDTO);
    }

    
    public List<PigeonResponseDTO> getAll() {
        List<Pigeon> pigeons = pigeonRepository.findAll();
        return pigeons.stream().map(pigeonMapper::toResponseDTO).toList();
    }

    
    public PigeonResponseDTO save(PigeonRequestDTO reqEntity) {
        System.out.println("Mapping.....");
        Pigeon mappedPigeon = pigeonMapper.toEntity(reqEntity);
        System.out.println("Inserting...");
        Pigeon savedPigeon = pigeonRepository.save(mappedPigeon);
        System.out.println(savedPigeon);
        return pigeonMapper.toResponseDTO(savedPigeon);
    }

    
    public PigeonResponseDTO update(PigeonRequestDTO reqEntity, UUID oldId) {
        return null;
    }

    
    public boolean delete(UUID oldId) {
        Pigeon existingPigeon = pigeonRepository.findById(oldId)
                .orElseThrow(() -> new EntityNotFoundException("Pigeon with ID " + oldId + " not found"));
        pigeonRepository.delete(existingPigeon);
        return pigeonRepository.existsById(oldId);
    }
}
