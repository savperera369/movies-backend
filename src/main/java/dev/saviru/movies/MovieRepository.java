package dev.saviru.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// data access layer for api
// it does job of actually talking to database and getting data back
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // just by naming this method as such
    // spring data mongodb will understand what we are trying to do
    Optional<Movie> findMovieByImdbId(String imdbId);
}
