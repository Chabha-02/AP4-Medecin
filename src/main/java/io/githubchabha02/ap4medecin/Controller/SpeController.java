package io.githubchabha02.ap4medecin.Controller;

import io.githubchabha02.ap4medecin.Projection.SpeCollectionView;
import io.githubchabha02.ap4medecin.Repository.SpeRepository;
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
@RequestMapping("api/spe")
public class SpeController {
    private final SpeRepository speRepository;

    @Autowired
    public SpeController(SpeRepository speRepository) {
        this.speRepository = speRepository;
    }

    @GetMapping()
    public List<SpeCollectionView> getAll() {
        return this.speRepository.findAllSpeBy();
    }

    @GetMapping("/{id}")
    public SpeCollectionView getById(@PathVariable("id") Long id) {
        Optional<SpeCollectionView> speOptional = this.speRepository.findSpeById(id);
        if (speOptional.isPresent()) {
            return speOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
