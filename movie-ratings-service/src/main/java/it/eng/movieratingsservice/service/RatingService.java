package it.eng.movieratingsservice.service;

import it.eng.movieratingsservice.entity.UserRating;


public interface RatingService {

    public UserRating getUserRatingByUserId(String userId);

}
