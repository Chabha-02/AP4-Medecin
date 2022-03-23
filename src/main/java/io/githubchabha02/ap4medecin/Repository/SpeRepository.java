package io.githubchabha02.ap4medecin.Repository;

import io.githubchabha02.ap4medecin.Entity.Departement;
import io.githubchabha02.ap4medecin.Entity.Spe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeRepository extends JpaRepository<Spe, Long> {
}
