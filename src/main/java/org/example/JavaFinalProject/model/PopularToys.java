package org.example.JavaFinalProject.model;

public class PopularToys extends Toys {

    public PopularToys(Integer toyId, String toyName, Integer toyQuantity, Double toyWeight) {
        super(toyId, toyName, 500, toyWeight);
    }

    @Override
    public String toString() {
        return "PopularToy: " +
                "toyId = " + toyId +
                ", toyName = '" + toyName + '\'' +
                ", toyQuantity = " + toyQuantity +
                ", toyWeight = " + toyWeight;
    }
}
