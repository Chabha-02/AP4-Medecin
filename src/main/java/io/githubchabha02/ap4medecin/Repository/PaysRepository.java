package io.githubchabha02.ap4medecin.Repository;

import io.githubchabha02.ap4medecin.Entity.Departement;
import io.githubchabha02.ap4medecin.Entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends JpaRepository<Pays,Long > {
}
