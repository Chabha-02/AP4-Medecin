package io.githubchabha02.ap4medecin.Repository;


import io.githubchabha02.ap4medecin.Entity.Medecin;
import io.githubchabha02.ap4medecin.Projection.MedecinCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    List<MedecinCollectionView> findAllMedecinBy();

    List<MedecinCollectionView> findAllByNomContaining(String nom);

    Optional<MedecinCollectionView> findMedecinById(Long id);
}
