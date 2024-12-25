package it.eng.movieratingsservice.mapper;

import it.eng.movieratingsservice.dto.RatingDTO;
import it.eng.movieratingsservice.entity.Rating;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RatingMapper {

    public RatingDTO entityToDto(Rating rating);



}
