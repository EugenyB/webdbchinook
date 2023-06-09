package com.example.webdbchinook.beans;

import com.example.webdbchinook.entities.Genre;
import com.example.webdbchinook.repositories.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GenreService {
    private GenreRepository repository;

    public List<Genre> getGenres() {
        return repository.findAll();
    }

    public Optional<Genre> getGenre(Integer id) {
        return repository.findById(id);
    }

    public Genre addGenre(String genre) {
        try {
            return repository.save(new Genre(genre));
        } catch (Exception e) {
            return null;
        }
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
