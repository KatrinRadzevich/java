package org.example.OOP.Lesson1.HomeWork;

public class Basket extends Shop {
    protected Integer boughtItems;

    public Basket(String name, Integer boughtItems) {
        super.name = name;
        this.boughtItems = boughtItems;
    }

    public Basket() {
    }

    @Override
    public void setAvailability(Integer availability) {
        super.setAvailability(availability - boughtItems);
    }

    public Integer getBoughtItems() {
        return boughtItems;
    }

    public void setBoughtItems(Integer boughtItems) {
        this.boughtItems = boughtItems;
    }

    @Override
    public String toString() {
        return "availableItems=" + "name: " + super.getName() +
                ", " + "price: " + super.getPrice() +
                ", " + "rating: " + super.getRating()
                + ", " + "available quantity: " + availability;
    }
}
