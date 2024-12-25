package it.eng.movieratingsservice.controller;

import it.eng.movieratingsservice.dto.RatingDTO;
import it.eng.movieratingsservice.entity.Rating;
import it.eng.movieratingsservice.entity.UserRating;
import it.eng.movieratingsservice.service.RatingService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@AllArgsConstructor
public class MovieRatingsController {

    private RatingService ratingService;

    @CrossOrigin
    @GetMapping("/{userId}")
    public ResponseEntity<UserRating> getRatingsByUserId(@PathVariable String userId){

        UserRating ratings = ratingService.getUserRatingByUserId(userId);

        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }
}
