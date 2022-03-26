package io.githubchabha02.ap4medecin.Repository;

import io.githubchabha02.ap4medecin.Entity.Departement;
import io.githubchabha02.ap4medecin.Entity.Spe;
import io.githubchabha02.ap4medecin.Projection.SpeCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpeRepository extends JpaRepository<Spe, Long> {

    List<SpeCollectionView> findAllSpeBy();

    Optional<SpeCollectionView> findSpeById(Long id);
}
