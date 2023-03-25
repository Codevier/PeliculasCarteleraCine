package com.cinema.controllers;

import com.cinema.entities.Movie;
import com.cinema.services.MovieServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class MovieController {
    private final MovieServices movieServices;

    @PostMapping
    public Movie saveMovie(@RequestBody Movie movie){
        return movieServices.saveMovie(movie);
    }
}
