package com.example.webdbchinook.beans;

import com.example.webdbchinook.entities.Genre;
import com.example.webdbchinook.repositories.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GenreService {
    private GenreRepository repository;

    public List<Genre> getGenres() {
        return repository.findAll();
    }
}
