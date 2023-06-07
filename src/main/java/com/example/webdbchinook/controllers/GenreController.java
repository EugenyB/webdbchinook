package com.example.webdbchinook.controllers;

import com.example.webdbchinook.beans.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class GenreController {

    private GenreService gs;

    @GetMapping("/genres")
    public String genres(Model model) {
        model.addAttribute("genres", gs.getGenres());
        return "genres";
    }
}
