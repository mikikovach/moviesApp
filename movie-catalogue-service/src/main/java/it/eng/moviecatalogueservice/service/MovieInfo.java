package it.eng.moviecatalogueservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import it.eng.moviecatalogueservice.entity.CatalogueItem;
import it.eng.moviecatalogueservice.entity.Movie;
import it.eng.moviecatalogueservice.entity.Rating;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
@Slf4j
public class MovieInfo {

//    private RestTemplate restTemplate;
//    private WebClient movieInfoWebClient;
    private WebClient webClient;
//    private ReactorLoadBalancerExchangeFilterFunction lbFunction;
    private InfoApiClient infoApiClient;

// The Resilience4j default Aspect order is the following:
//Retry ( CircuitBreaker ( RateLimiter ( TimeLimiter ( Bulkhead ( Function ) ) ) ) )
//By Aspect order, we mean that if we apply both CircuitBreaker and Retry to the method
// then first CircuitBreaker will work and then Retry will work.

   @CircuitBreaker(name = "${spring.application.name}")
    @Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultCatalogueItem")
    public CatalogueItem getMovieInfo(Rating rating) {

    log.info("U getMovieInfo() metodi");

//     Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
//        Movie movie = webClient
//                .get()
//                .uri("http://localhost:8082/movies/" + rating.getMovieId())
//                .retrieve()
//                .bodyToMono(Movie.class)
//                .block();

        Movie movie = infoApiClient.getMovieInfo(rating.getMovieId());

        return new CatalogueItem(movie.getName(), movie.getDescription(), rating.getRating());
    }

    public CatalogueItem getDefaultCatalogueItem(Rating rating, Exception exc){
        log.info("U getDefaultCatalogueItem() metodi");
        return new CatalogueItem("Default movie name", "Default movie description", 0);
    }


}
