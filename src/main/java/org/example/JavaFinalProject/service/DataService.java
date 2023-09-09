package org.example.JavaFinalProject.service;


import org.example.JavaFinalProject.model.PopularToys;
import org.example.JavaFinalProject.model.RareToys;
import org.example.JavaFinalProject.model.Toys;
import org.example.JavaFinalProject.model.Type;

import java.util.List;

public interface DataService {
    void create(Type type, Integer toyId, String toyName, Integer toyQuantity, Double toyWeight);

    List<Toys> readAllToys();

    List<RareToys> readOnlyRareToys();

    List<PopularToys> readOnlyPopularToys();
}
