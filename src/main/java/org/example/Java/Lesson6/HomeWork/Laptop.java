package org.example.Java.Lesson6.HomeWork;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Laptop {
    private String name;
    private String model;
    private Integer ramGb;
    private String os;
    private String colour;
    private Double weightKg;
    private Integer priceDollars;
}