package com.example.PigeonsVoyageurs.mappers;

import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import com.example.PigeonsVoyageurs.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserMapper {
    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "role", target = "role")
    @Mapping(source = "loftName", target = "loftName")
    @Mapping(source = "loftLatitude", target = "loftLatitude")
    @Mapping(source = "loftLongitude", target = "loftLongitude")
    @Mapping(target = "id", ignore = true)
    User toEntity(UserRequestDTO userRequestDTO);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "role", target = "role")
    @Mapping(source = "loftName", target = "loftName")
    @Mapping(source = "loftLatitude", target = "loftLatitude")
    @Mapping(source = "loftLongitude", target = "loftLongitude")
    UserResponseDTO toResponseDTO(User user);
}
