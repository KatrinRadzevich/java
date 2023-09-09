package org.example.JavaFinalProject.view;

import org.example.JavaFinalProject.model.PopularToys;
import org.example.JavaFinalProject.model.RareToys;
import org.example.JavaFinalProject.model.Toys;

public class UserView {
    public void printAllToys(Toys toys) {
        System.out.println(toys);
    }

    public void printPopularToys(PopularToys popularToys) {
        System.out.println(popularToys);
    }

    public void printRareToys(RareToys rareToys) {
        System.out.println(rareToys);
    }
}
