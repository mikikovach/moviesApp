package it.eng.moviecatalogueservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogueItemDTO {

    private String name;
    private String description;
    private int rating;
}
