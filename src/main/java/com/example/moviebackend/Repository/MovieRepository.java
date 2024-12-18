package com.example.moviebackend.Repository;

import com.example.moviebackend.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}