package dev.java10x.cadastrodeninjas.controller;


import dev.java10x.cadastrodeninjas.model.NinjaModel;
import dev.java10x.cadastrodeninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService service;

    public NinjaController(NinjaService service) {
        this.service = service;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Boas vindas";
    }

    @PostMapping("/ninja")
    public String addNinja(){
        return "aaaa";
    }

    @GetMapping("/ninja")
    public List<NinjaModel> listNinjas(){
        return service.listNinja();
    }

    @GetMapping("/ninja/{id}")
    public String listNinjaById(){
        return "aa";
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
