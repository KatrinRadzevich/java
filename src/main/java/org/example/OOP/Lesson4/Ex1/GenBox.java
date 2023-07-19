package org.example.OOP.Lesson4.Ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenBox<T> {
    T obj;
}
