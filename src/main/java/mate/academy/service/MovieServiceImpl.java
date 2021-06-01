package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.util.exceptions.DataProcessingException;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) throws DataProcessingException {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) throws DataProcessingException {
        return movieDao.get(id).get();
    }
}