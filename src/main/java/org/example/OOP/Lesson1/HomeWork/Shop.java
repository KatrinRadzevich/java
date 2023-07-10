package org.example.OOP.Lesson1.HomeWork;

public class Shop extends Item {
    protected Integer availability;

    public Shop(String name, Double price, Integer rating, Integer availability) {
        super(name, price, rating);
        this.availability = availability;
    }

    public Shop() {
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public void showAvailability() {

    }

    @Override
    public String toString() {
        return "availableItems = " + "name: " + super.getName() +
                ", " + "price: " + super.getPrice() +
                ", " + "rating: " + super.getRating()
                + ", " + "available quantity: " + availability;
    }
}