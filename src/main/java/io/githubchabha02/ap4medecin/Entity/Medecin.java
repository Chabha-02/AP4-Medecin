package io.githubchabha02.ap4medecin.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Medecin {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    @ManyToOne
    private Departement departement;
    @ManyToOne(optional = true)
    private Spe spe;

    public Medecin() {
    }

    public Medecin(Long id, String nom, String prenom, String adresse, String tel, Departement departement, Spe spe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.departement = departement;
        this.spe = spe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Spe getSpe() {
        return spe;
    }

    public void setSpe(Spe spe) {
        this.spe = spe;
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", departement=" + departement +
                ", spe=" + spe +
                '}';
    }
}
