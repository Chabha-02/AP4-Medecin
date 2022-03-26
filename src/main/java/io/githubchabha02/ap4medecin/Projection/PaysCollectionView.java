package io.githubchabha02.ap4medecin.Projection;

import java.util.Set;

public interface PaysCollectionView {
    Long getId();

    String getNom();

    Set<DepartementCollectionView> getDepartements();
}
