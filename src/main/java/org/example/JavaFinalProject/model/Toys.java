package org.example.JavaFinalProject.model;

public abstract class Toys {
    Integer toyId;
    String toyName;
    Integer toyQuantity;
    Double toyWeight;

    public Toys(Integer toyId, String toyName, Integer toyQuantity, Double toyWeight) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyQuantity = toyQuantity;
        this.toyWeight = toyWeight;
    }

    public Toys() {
    }

    public Integer getToyId() {
        return toyId;
    }

    public void setToyId(Integer toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Integer getToyQuantity() {
        return toyQuantity;
    }

    public void setToyQuantity(Integer toyQuantity) {
        this.toyQuantity = toyQuantity;
    }

    public Double getToyWeight() {
        return toyWeight;
    }

    public void setToyWeight(Double toyWeight) {
        this.toyWeight = toyWeight;
    }
}
