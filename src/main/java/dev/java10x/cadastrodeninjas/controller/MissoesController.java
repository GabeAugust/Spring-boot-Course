package dev.java10x.cadastrodeninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {

    @PostMapping("/missoes")
    public String addMission(){
        return "aaaa";
    }

    @GetMapping("/missoes")
    public String listMissions(){
        return "aaaa";
    }

    @GetMapping("/missoes/{id}")
    public String listMission(){
        return "";
    }

    @PutMapping("/missoes/{id}")
    public String editMission(){
        return "";
    }

    @DeleteMapping("/missoes/{id}")
    public String deleteMission(){
        return "";
    }
}
