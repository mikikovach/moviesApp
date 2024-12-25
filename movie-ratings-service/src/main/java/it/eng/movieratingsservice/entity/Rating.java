package it.eng.movieratingsservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ratingSeq")
    @SequenceGenerator(name = "ratingSeq",allocationSize = 1,initialValue = 1)
    private Long id;
    private Long movieId;
    private int rating;
    private String userId;
}
