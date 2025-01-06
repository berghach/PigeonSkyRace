package com.example.PigeonsVoyageurs.mappers;

import com.example.PigeonsVoyageurs.dtos.request.RankingRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.RankingResponseDTO;
import com.example.PigeonsVoyageurs.entities.Ranking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RankingMapper {
//    @Mapping(source = "competition.id", target = "competitionId")
//    @Mapping(source = "pigeon.id", target = "pigeonId")
//    @Mapping(source = "position", target = "position")
//    @Mapping(source = "distance", target = "distance")
//    @Mapping(source = "duration", target = "duration")
//    @Mapping(source = "speed", target = "speed")
//    @Mapping(source = "score", target = "score")
//    @Mapping(target = "id", ignore = true)
    Ranking toEntity(RankingRequestDTO rankingRequestDTO);
//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "competition.id", target = "competitionId")
//    @Mapping(source = "pigeon.id", target = "pigeonId")
//    @Mapping(source = "position", target = "position")
//    @Mapping(source = "distance", target = "distance")
//    @Mapping(source = "duration", target = "duration")
//    @Mapping(source = "speed", target = "speed")
//    @Mapping(source = "score", target = "score")
    RankingResponseDTO toResponseDTO(Ranking ranking);
}
