package com.example.moviebackend.Service;

import com.example.moviebackend.Entity.Movie;
import com.example.moviebackend.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        List<Movie> newMovies = movieRepository.findAll();
//        System.out.println(newMovies);
        return newMovies;
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }
}