package com.example.webdbchinook.repositories;

import com.example.webdbchinook.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}