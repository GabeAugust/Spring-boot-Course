package dev.java10x.cadastrodeninjas.missoes;


import dev.java10x.cadastrodeninjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Character rank;
    private String name;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;


    public MissoesModel(Long id, Character rank, String name) {
        this.id = id;
        this.rank = rank;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getRank() {
        return rank;
    }

    public void setRank(Character rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
