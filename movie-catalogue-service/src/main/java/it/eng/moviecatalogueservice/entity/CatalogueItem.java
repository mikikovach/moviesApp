package it.eng.moviecatalogueservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogueItem {
    private String name;
    private String description;
    private int rating;

}
