package com.example.swe304project.controller;

import com.example.swe304project.model.Music;
import com.example.swe304project.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicRepository musicRepository;

    @GetMapping("/home")
    public String getMusicView(Model model) {
        List<Music> musicList = musicRepository.findAll();
        model.addAttribute("musicList", musicList);
        return "music";
    }

    @GetMapping
    @ResponseBody
    public List<Music> getAllMusic() {
        return musicRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Music getMusicById(@PathVariable Long id) {
        return musicRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Music not found with id: " + id));
    }

    @PostMapping
    @ResponseBody
    public Music createMusic(@RequestBody Music music) {
        return musicRepository.save(music);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Music updateMusic(@PathVariable Long id, @RequestBody Music updatedMusic) {
        return musicRepository.findById(id)
                .map(music -> {
                    music.setName(updatedMusic.getName());
                    music.setSinger(updatedMusic.getSinger());
                    music.setYear(updatedMusic.getYear());
                    return musicRepository.save(music);
                })
                .orElseThrow(() -> new RuntimeException("Music not found with id: " + id));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteMusic(@PathVariable Long id) {
        musicRepository.deleteById(id);
    }


    @GetMapping("/search")
    @ResponseBody
    public List<Music> searchMusic(@RequestParam String q) {
        return musicRepository.search(q);
    }

    @GetMapping("/search/view")
    public String searchMusicView(@RequestParam String q, Model model) {
        List<Music> results = musicRepository.search(q);
        model.addAttribute("musicList", results);
        return "music";
    }
}