package org.example.OOP.Lesson3.ClassWork.Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        return new ArrayList<String>(Arrays.asList("a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ")));
    }
}
