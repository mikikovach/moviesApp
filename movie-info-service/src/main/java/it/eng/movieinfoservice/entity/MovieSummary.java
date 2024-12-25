package it.eng.movieinfoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieSummary {

    private String id;
    private String title;
    private String overview;
}
