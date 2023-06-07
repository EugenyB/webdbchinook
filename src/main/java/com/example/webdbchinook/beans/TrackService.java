package com.example.webdbchinook.beans;

import com.example.webdbchinook.entities.Track;
import com.example.webdbchinook.repositories.TrackRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrackService {

    private TrackRepository repository;

    public List<Track> getTracks() {
        return repository.findAll();
    }
}
