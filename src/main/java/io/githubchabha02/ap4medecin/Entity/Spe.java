package io.githubchabha02.ap4medecin.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Spe {
    @Id
    private Long id;
    private String libelle;
    @OneToMany(mappedBy = "spe")
    private Set<Medecin> medecins;

    public Spe() {
    }

    public Spe(Long id, String libelle, Set<Medecin> medecins) {
        this.id = id;
        this.libelle = libelle;
        this.medecins = medecins;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Set<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(Set<Medecin> medecins) {
        this.medecins = medecins;
    }


    @Override
    public String toString() {
        return "Spe{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", medecins=" + medecins +
                '}';
    }
}