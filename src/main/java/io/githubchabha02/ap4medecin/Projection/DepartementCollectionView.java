package io.githubchabha02.ap4medecin.Projection;

import java.util.Set;

public interface DepartementCollectionView {
    Long getId();

    String getNom();

    String getNum();

    PaysView getPays();

    Set<MedecinView> getMedecins();
}
