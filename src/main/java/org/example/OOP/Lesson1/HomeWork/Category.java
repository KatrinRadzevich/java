package org.example.OOP.Lesson1.HomeWork;

public class Category extends Shop {
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "categoryName " + categoryName;
    }
}
