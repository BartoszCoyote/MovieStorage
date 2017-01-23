package pl.jedynak.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.jedynak.Domain.Movie;

import java.util.List;


public interface MovieRepository extends CrudRepository<Movie, Integer> {

    List<Movie> findByNameContaining(String q);

}