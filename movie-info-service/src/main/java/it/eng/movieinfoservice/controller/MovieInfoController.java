package it.eng.movieinfoservice.controller;

import it.eng.movieinfoservice.MovieInfoServiceApplication;
import it.eng.movieinfoservice.entity.Movie;
import it.eng.movieinfoservice.entity.MovieSummary;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
@AllArgsConstructor
@NoArgsConstructor
public class MovieInfoController {

    @Value("${api.key}")
    private String apiKey;

    private RestTemplate restTemplate;

    @Autowired
    public MovieInfoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CrossOrigin
    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable Long movieId) {
        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieSummary.class);
        Movie movie = new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
        return movie;
    }
}
