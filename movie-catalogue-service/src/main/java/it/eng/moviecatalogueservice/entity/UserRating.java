package it.eng.moviecatalogueservice.entity;

import it.eng.moviecatalogueservice.dto.RatingDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRating {

    private String userId;
    private List<Rating> ratings;


}
