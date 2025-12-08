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

    public NinjaModel createNinja(NinjaModel ninja){
        return repository.save(ninja);
    }

    public void deleteNinja(Long id){
        repository.deleteById(id);
    }

    public NinjaModel updateNinja(Long id, NinjaModel ninjaModel){
        if(repository.existsById(id)){
            ninjaModel.setId(id);
            return repository.save(ninjaModel);
        }
        return null;
    }


}
