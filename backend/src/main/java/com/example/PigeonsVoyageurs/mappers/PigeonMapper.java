package com.example.PigeonsVoyageurs.mappers;

import com.example.PigeonsVoyageurs.dtos.request.PigeonRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.PigeonResponseDTO;
import com.example.PigeonsVoyageurs.entities.Pigeon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PigeonMapper {
    @Mapping(source = "sexe", target = "sexe")
    @Mapping(source = "color", target = "color")
    @Mapping(source = "age", target = "age")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "pigeonRing", ignore = true)
    @Mapping(source = "userId", target = "user.id")
    Pigeon toEntity(PigeonRequestDTO pigeonRequestDTO);
    @Mapping(source = "id", target = "id")
//    @Mapping(source = "pigeonRing", target = "pigeonRing")
    @Mapping(source = "sexe", target = "sexe")
    @Mapping(source = "color", target = "color")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "user.username", target = "owner")
    PigeonResponseDTO toResponseDTO(Pigeon pigeon);
}
