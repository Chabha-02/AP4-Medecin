package io.githubchabha02.ap4medecin.Repository;


import io.githubchabha02.ap4medecin.Entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    List<Medecin> findAllByNomContaining(String nom);
}
