package it.eng.moviecatalogueservice.controller;

import it.eng.moviecatalogueservice.dto.CatalogueItemDTO;
import it.eng.moviecatalogueservice.dto.RatingDTO;
import it.eng.moviecatalogueservice.entity.CatalogueItem;
import it.eng.moviecatalogueservice.entity.UserRating;
import it.eng.moviecatalogueservice.service.MovieInfo;
import it.eng.moviecatalogueservice.service.UserRatingInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/catalogue")
@Slf4j
@AllArgsConstructor
public class MovieCatalogueController {

//    private RestTemplate restTemplate;
    private MovieInfo movieInfo;
    private UserRatingInfo userRatingInfo;


    @CrossOrigin
    @GetMapping("/{userId}")
    public List<CatalogueItem> getCatalogueItems(@PathVariable String userId){

        UserRating userRating = userRatingInfo.getUserRating(userId);

        return userRating.getRatings()
                .stream()
                .map( rating -> movieInfo.getMovieInfo(rating))
                .toList();

    }
}
