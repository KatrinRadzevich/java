package org.example.Java.Lesson3.HomeWork.Task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Дан массив записей: наименование товара, цена, сорт.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private String name;
    private Integer price;
    private Integer quality;
}
