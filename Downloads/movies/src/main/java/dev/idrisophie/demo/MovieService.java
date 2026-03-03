package dev.idrisophie.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movierRepository;

    public List<Movie> allMovies(){
        return movierRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movierRepository.findMovieByImdbId(imdbId);
    }
}
