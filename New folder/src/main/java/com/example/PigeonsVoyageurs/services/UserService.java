package com.example.PigeonsVoyageurs.services;

import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import com.example.PigeonsVoyageurs.entities.User;
import com.example.PigeonsVoyageurs.mappers.UserMapper;
import com.example.PigeonsVoyageurs.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    
    public Optional<UserResponseDTO> get(UUID id) {
        User user = userRepository.getReferenceById(id);
        UserResponseDTO userResponseDTO = userMapper.toResponseDTO(user);
        return Optional.of(userResponseDTO);
    }

    
    public List<UserResponseDTO> getAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(userMapper::toResponseDTO).toList();
    }

    
    public UserResponseDTO save(UserRequestDTO reqEntity) {
        System.out.println("Mapping.....");
        User mappedUser = userMapper.toEntity(reqEntity);
        System.out.println(mappedUser);
        System.out.println("Inserting...");
        mappedUser.setPassword(passwordEncoder.encode(mappedUser.getPassword()));
        User savedUser = userRepository.save(mappedUser);
        System.out.println(savedUser);
        return userMapper.toResponseDTO(savedUser);
    }

    
    public UserResponseDTO update(UserRequestDTO reqEntity, UUID oldId) {
        return null;
    }

    
    public boolean delete(UUID oldId) {
        User existingUser = userRepository.findById(oldId)
                .orElseThrow(() -> new EntityNotFoundException("User with ID " + oldId + " not found"));
        userRepository.delete(existingUser);
        return userRepository.existsById(oldId);
    }
}
