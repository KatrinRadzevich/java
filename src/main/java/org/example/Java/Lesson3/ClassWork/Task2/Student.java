package org.example.Java.Lesson3.ClassWork.Task2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String surname;
    private Integer group;
    private Integer salary;

    private List<Integer> marks;
}
