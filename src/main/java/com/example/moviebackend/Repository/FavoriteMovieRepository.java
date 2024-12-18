package com.example.moviebackend.Repository;

import com.example.moviebackend.Entity.FavoriteMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteMovieRepository extends JpaRepository<FavoriteMovie,Long> {
}
