package io.githubchabha02.ap4medecin.Projection;

public interface MedecinCollectionView {

    Long getId();

    String getNom();

    String getPrenom();

    String getAdresse();

    String getTel();

    SpeView getSpe();

    DepartementView getDepartement();
}
