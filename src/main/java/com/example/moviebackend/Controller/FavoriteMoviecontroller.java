package com.example.moviebackend.Controller;

import com.example.moviebackend.Entity.FavoriteMovie;
import com.example.moviebackend.Entity.Movie;
import com.example.moviebackend.Service.FavoriteMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/favoritemovies")
public class FavoriteMoviecontroller {
    @Autowired
    private FavoriteMovieService favoriteMovieService;

    @GetMapping
    public ResponseEntity<List<FavoriteMovie>> getAllMovies() {
        List<FavoriteMovie> movies = favoriteMovieService.getAllMovies();
        System.out.println(movies);
//        if (movies.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getMovieById(@PathVariable Long id) {
        FavoriteMovie movie = favoriteMovieService.getMovieById(id);
        if (movie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movie.getTitle());
    }
}
