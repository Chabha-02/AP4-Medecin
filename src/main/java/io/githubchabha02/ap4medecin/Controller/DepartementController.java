package io.githubchabha02.ap4medecin.Controller;

import io.githubchabha02.ap4medecin.Entity.Departement;
import io.githubchabha02.ap4medecin.Repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/departements")
public class DepartementController {
    private final DepartementRepository departementRepository;

    @Autowired
    public DepartementController(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @GetMapping("/")
    public List<Departement> get() {
        return departementRepository.findAll();
    }

    @GetMapping("/{id}")
    public Departement getById(@PathVariable Long id) {
        Optional<Departement> departementOptional = departementRepository.findById(id);
        if (departementOptional.isPresent())
        {
            return departementOptional.get();

        } else {
           throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }


}
