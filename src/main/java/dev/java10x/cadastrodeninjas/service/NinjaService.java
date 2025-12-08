package dev.java10x.cadastrodeninjas.service;

import dev.java10x.cadastrodeninjas.model.NinjaModel;
import dev.java10x.cadastrodeninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository repository;

    public NinjaService(NinjaRepository repository){
        this.repository = repository;
    }

    public List<NinjaModel> listNinjas(){
        return repository.findAll();
    }


    public NinjaModel listNinja(Long id){
        Optional<NinjaModel> ninja = repository.findById(id);
        return ninja.orElse(null);
    }


}
