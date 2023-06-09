package com.example.webdbchinook.controllers;

import com.example.webdbchinook.beans.GenreService;
import com.example.webdbchinook.entities.Genre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class GenreController {

    private GenreService gs;

    @GetMapping("/genres")
    public String genres(Model model) {
        model.addAttribute("genres", gs.getGenres());
        return "genres";
    }

    @GetMapping("/tracks_by_genre")
    public String tracksByGenre(@RequestParam Integer id, Model model) {
        Optional<Genre> og = gs.getGenre(id);
        if (og.isPresent()) {
            model.addAttribute("tracks", og.get().getTracks());
            return "tracks";
        } else {
            model.addAttribute("message", "Genre with id %d not found".formatted(id));
            return "error";
        }
    }

    @PostMapping("/add_genre")
    public String addGenre(@RequestParam String genre, Model model) {
        Genre g = gs.addGenre(genre);
        if (g != null) {
            return "redirect:/genres";
        } else {
            model.addAttribute("message", "This genre (%s) already exists".formatted(genre));
            return "error";
        }
    }

    @GetMapping("/delete_genre")
    public String delete(@RequestParam Integer id) {
        gs.delete(id);
        return "redirect:/genres";
    }
}
