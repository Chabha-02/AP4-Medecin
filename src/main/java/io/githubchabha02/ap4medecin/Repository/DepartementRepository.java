package io.githubchabha02.ap4medecin.Repository;

import io.githubchabha02.ap4medecin.Entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {


}
