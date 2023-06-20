package org.example.Lesson3.HomeWork.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String bookName;
    private String surname;
    private Double price;
    private Integer year;
    private Integer pages;


}
