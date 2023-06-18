package org.example.Lesson3.ClassWork.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
// его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cube {
    private Integer sizeSm;
    private String colour;
    private String material;

    public Integer cubeVolume() {
        return sizeSm * sizeSm * sizeSm;
    }
}
