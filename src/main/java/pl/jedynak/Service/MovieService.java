package pl.jedynak.Service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.jedynak.Domain.Movie;

import java.util.List;

@Component
@Service
public interface MovieService {


    Iterable<Movie> findAll();

    List<Movie> search(String q);

    Movie findOne(int id);

    void save(Movie movie);

    void delete(int id);




}

