package io.githubchabha02.ap4medecin.Projection;

import java.util.Set;

public interface SpeCollectionView {
    Long getId();

    String getLibelle();

    Set<MedecinView> getMedecins();
}
