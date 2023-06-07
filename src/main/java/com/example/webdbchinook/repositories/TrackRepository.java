package com.example.webdbchinook.repositories;

import com.example.webdbchinook.entities.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track, Integer> {
}