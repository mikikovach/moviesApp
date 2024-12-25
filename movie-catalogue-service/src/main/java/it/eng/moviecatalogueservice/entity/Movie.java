package it.eng.moviecatalogueservice.entity;


import lombok.Data;

@Data
public class Movie {

    private Long movieId;
    private String name;
    private String description;
}
