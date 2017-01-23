package pl.jedynak.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jedynak.Domain.Movie;
import pl.jedynak.Repository.MovieRepository;

import java.util.List;

@Component
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> search(String q) {
        return movieRepository.findByNameContaining(q);
    }

    @Override
    public Movie findOne(int id) {
        return movieRepository.findOne(id);
    }

    @Override
    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void delete(int id) {
        movieRepository.delete(id);
    }

}