package com.example.PigeonsVoyageurs.mappers;

import com.example.PigeonsVoyageurs.dtos.request.CompetitionRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.CompetitionResponseDTO;
import com.example.PigeonsVoyageurs.entities.Competition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CompetitionMapper {
//    @Mapping(source = "raceName", target = "raceName")
//    @Mapping(source = "startAt", target = "startAt")
//    @Mapping(source = "distance", target = "distance")
//    @Mapping(source = "startLatitude", target = "startLatitude")
//    @Mapping(source = "startLongitude", target = "startLongitude")
//    @Mapping(target = "id", ignore = true)
    Competition toEntity(CompetitionRequestDTO competitionRequestDTO);
//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "raceName", target = "raceName")
//    @Mapping(source = "startAt", target = "startAt")
//    @Mapping(source = "distance", target = "distance")
//    @Mapping(source = "startLatitude", target = "startLatitude")
//    @Mapping(source = "startLongitude", target = "startLongitude")
    CompetitionResponseDTO toResponseDTO(Competition competition);
}
