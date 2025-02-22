package it.eng.movieratingsservice.repository;

import it.eng.movieratingsservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    public List<Rating> findByUserId(String userid);
}
