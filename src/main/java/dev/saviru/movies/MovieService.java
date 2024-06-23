package dev.saviru.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// this is where most business logic will go
// uses repository class to talk to database
@Service
public class MovieService {
    // framework will instantiate class for us
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findById(id);
//    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
