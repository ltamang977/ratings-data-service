package org.ltamang.ratingsdataservice;

import org.ltamang.ratingsdataservice.model.Ratings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsController {
    
    @RequestMapping("/{movieId}")
    public Ratings getCatalog(@PathVariable("movieId") Integer  movieId){

        return new Ratings(movieId, 5);

    }
}
