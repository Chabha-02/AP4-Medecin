package io.githubchabha02.ap4medecin.Controller;

import io.githubchabha02.ap4medecin.Entity.Pays;
import io.githubchabha02.ap4medecin.Projection.PaysCollectionView;
import io.githubchabha02.ap4medecin.Repository.PaysRepository;
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
@RequestMapping("api/pays")
public class PaysController {
    private final PaysRepository paysRepository;

    @Autowired
    public PaysController (PaysRepository paysRepository){
        this.paysRepository = paysRepository;
    }

    @GetMapping("/")
    public List<Pays> get() { return paysRepository.findAll();}

    @GetMapping("/{id}")
    public PaysCollectionView getById(@PathVariable Long id){
        Optional<PaysCollectionView> paysOptional = paysRepository.findPaysById(id);
        if (paysOptional.isPresent())
        {
            return paysOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
