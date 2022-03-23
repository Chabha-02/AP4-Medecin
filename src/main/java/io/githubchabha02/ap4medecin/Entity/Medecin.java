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
    private String spe;
    @ManyToOne
    private Departement departement;

    public Medecin(Long id, String nom, String prenom, String adresse, String tel, String spe, Departement departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.spe = spe;
        this.departement = departement;
    }

    public Medecin() {
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

    public String getSpe() {
        return spe;
    }

    public void setSpe(String spe) {
        this.spe = spe;
    }

    @JsonBackReference
    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", spe='" + spe + '\'' +
               // ", departement=" + departement +
                '}';
    }
}