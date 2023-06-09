package com.example.webdbchinook.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "genre")
public class Genre {
    @Id
    @Column(name = "GenreId", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 120)
    private String name;

    @OneToMany(mappedBy = "genre", orphanRemoval = true)
    private Set<Track> tracks = new LinkedHashSet<>();

    public Genre(String name) {
        id = 0;
        this.name = name;
    }
}