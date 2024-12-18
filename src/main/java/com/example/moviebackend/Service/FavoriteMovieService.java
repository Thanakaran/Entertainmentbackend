package com.example.moviebackend.Service;

import com.example.moviebackend.Entity.FavoriteMovie;
import com.example.moviebackend.Entity.Movie;
import com.example.moviebackend.Repository.FavoriteMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteMovieService {
    @Autowired
    private FavoriteMovieRepository favoriteMovieRepository;

    public List<FavoriteMovie> getAllMovies() {
        List<FavoriteMovie> newMovies = favoriteMovieRepository.findAll();
        System.out.println(newMovies);
        return newMovies;
    }

    public FavoriteMovie getMovieById(Long id) {
        return favoriteMovieRepository.findById(id).orElse(null);
    }
}
