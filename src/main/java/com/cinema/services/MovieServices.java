package com.cinema.services;

import com.cinema.entities.Movie;
import com.cinema.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieServices {
    private final MovieRepository movieRepository;
    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }
}
