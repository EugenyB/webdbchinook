package com.example.webdbchinook.controllers;

import com.example.webdbchinook.beans.TrackService;
import com.example.webdbchinook.entities.Track;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class TrackController {

    private TrackService ts;

    @GetMapping("/tracks")
    public String tracks(Model model) {
        List<Track> tracks = ts.getTracks();
        model.addAttribute("tracks", tracks);
        return "tracks";
    }
}
