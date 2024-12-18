package com.example.moviebackend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "movie")
public class Movie {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genre;
    private String image_url;
    private String title;

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "id=" + id +
//                ", genre='" + genre + '\'' +
//                ", image_url='" + image_url + '\'' +
//                ", title='" + title + '\'' +
//                '}';}



}
