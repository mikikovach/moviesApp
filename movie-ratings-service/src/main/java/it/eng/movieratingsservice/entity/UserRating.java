package it.eng.movieratingsservice.entity;

import it.eng.movieratingsservice.dto.RatingDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRating {

    private String userId;
    private List<Rating> ratings;
}
