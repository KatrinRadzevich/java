package org.example.OOP.Lesson3.ClassWork.Ex3;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();

}
