package it.eng.movieratingsservice.service.impl;

import it.eng.movieratingsservice.dto.RatingDTO;
import it.eng.movieratingsservice.entity.Rating;
import it.eng.movieratingsservice.entity.UserRating;
import it.eng.movieratingsservice.mapper.RatingMapper;
import it.eng.movieratingsservice.repository.RatingRepository;
import it.eng.movieratingsservice.service.RatingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RatingServiceImpl implements RatingService {

    private RatingRepository ratingRepository;
    private RatingMapper ratingMapper;

    @Override
    public UserRating getUserRatingByUserId(String userId) {
//        List<RatingDTO> list = ratingRepository.findByUserId(userId)
//                            .stream().map( r -> ratingMapper.entityToDto(r))
//                            .toList();

        List<Rating> list = ratingRepository.findByUserId(userId);

        return new UserRating(userId, list);


    }
    }


