package it.eng.movieinfoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private Long movieId;
    private String name;
    private String description;
}
