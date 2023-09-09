package org.example.JavaFinalProject.model;

public class RareToys extends Toys {

    public RareToys(Integer toyId, String toyName, Integer toyQuantity, Double toyWeight) {
        super(toyId, toyName, 50, toyWeight);
    }

    @Override
    public String toString() {
        return "RareToy: " +
                "toyId = " + toyId +
                ", toyName = '" + toyName + '\'' +
                ", toyQuantity = " + toyQuantity +
                ", toyWeight = " + toyWeight;
    }
}
