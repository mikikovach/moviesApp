package it.eng.moviecatalogueservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import it.eng.moviecatalogueservice.entity.UserRating;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class UserRatingInfo {

//    private RestTemplate restTemplate;
//    private WebClient movieRatingsWebClient;

    private WebClient webClient;

    private RatingsApiClient apiClient;



    public UserRating getUserRating(String userId) {

//             ResponseEntity<UserRating> responseEntity = restTemplate.getForEntity("http://movie-ratings-service/ratings/"+userId, UserRating.class);
//             UserRating userRating = responseEntity.getBody();


//        return webClient
//                .get()
//                .uri("http://localhost:8081/ratings/" + userId)
//                .retrieve()
//                .bodyToMono(UserRating.class)//Mono je nacin da dobijemo ovaj objekat na asynchronous nacin, dobijamo asynchronous objekat nazad
//                //ali u trenutku kad nam bude trebao nas objekat - to ce i biti
//                .block(); // blokiramo dalje izvrsenje dok mono ne emituje nas objekat

        return apiClient.getRatingsByUserId(userId);


    }



}
