package org.example.Lesson3.HomeWork.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veggies {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer kind;

}
