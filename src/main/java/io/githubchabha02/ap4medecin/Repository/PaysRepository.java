package io.githubchabha02.ap4medecin.Repository;

import io.githubchabha02.ap4medecin.Entity.Departement;
import io.githubchabha02.ap4medecin.Entity.Pays;
import io.githubchabha02.ap4medecin.Projection.PaysCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaysRepository extends JpaRepository<Pays,Long > {

    List<PaysCollectionView> findAllPaysBy();

    Optional<PaysCollectionView> findPaysById(Long id);
}
