package dev.java10x.cadastrodeninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Boas vindas";
    }

    @PostMapping("/ninja")
    public String addNinja(){
        return "aaaa";
    }

    @GetMapping("/ninja")
    public String listNinjas(){
        return "aaaa";
    }

    @GetMapping("/ninja/{id}")
    public String listNinja(){
        return "";
    }

    @PutMapping("/ninja/{id}")
    public String editNinja(){
        return "";
    }

    @DeleteMapping("/ninja/{id}")
    public String deleteNinja(){
        return "";
    }

}
