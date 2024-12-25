package it.eng.moviecatalogueservice.service;

import it.eng.moviecatalogueservice.entity.UserRating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "movie-ratings-service") // Feign client library will dynamically create implementation for this interface
public interface RatingsApiClient {

//    @GetMapping("/movies/{movieId}")
//    public Movie getMovieInfo(@PathVariable Long movieId);

    @GetMapping("/ratings/{userId}")
    public UserRating getRatingsByUserId(@PathVariable String userId);


}
