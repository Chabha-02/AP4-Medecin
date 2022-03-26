package io.githubchabha02.ap4medecin.Repository;

import io.githubchabha02.ap4medecin.Entity.Departement;
import io.githubchabha02.ap4medecin.Projection.DepartementCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {

    List<DepartementCollectionView> findAllDepartementBy();

    Optional<DepartementCollectionView> findDepartementById(Long id);

}
