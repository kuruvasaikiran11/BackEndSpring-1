package com.Accio.MovieManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MovieController {

    Map<String, Movie> db = new HashMap<>();
    @GetMapping("/get_movie")
    public Movie get_movie(@RequestParam("name") String name){
        return db.get(name);
    }
    @PostMapping("/add_movie")
    public String add_movie(@RequestBody Movie movie){
        String name = movie.getName();
        db.put(name, movie);
        return "Movie added";
    }
}
