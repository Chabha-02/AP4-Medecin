package io.githubchabha02.ap4medecin.Controller;

import io.githubchabha02.ap4medecin.Entity.Medecin;
import io.githubchabha02.ap4medecin.Repository.DepartementRepository;
import io.githubchabha02.ap4medecin.Repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/medecins")
public class MedecinController {
    private final MedecinRepository medecinRepository;

    @Autowired
    public MedecinController(MedecinRepository medecinRepository){
        this.medecinRepository = medecinRepository;
    }

    @GetMapping( path = " ")
    public List<Medecin> get(@RequestParam(required = false, name = "nom", defaultValue = "")String nom) {
        return this.medecinRepository.findAllByNomContaining(nom);}

    @GetMapping("/{id}")
    public Medecin getById(@PathVariable Long id){
        Optional<Medecin> medecinOptional = medecinRepository.findById(id);
        if (medecinOptional.isPresent())
        {
            return medecinOptional.get();

        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }



}


