package it.eng.moviecatalogueservice.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

    private Long movieId;
    private int rating;


}
