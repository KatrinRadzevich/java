package org.example.JavaFinalProject.view;

import org.example.JavaFinalProject.controller.Controller;
import org.example.JavaFinalProject.model.Type;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createPoplarToy(0, "Doll", 0, 0.6);
        controller.createPoplarToy(0, "Car", 0, 0.8);
        controller.createToy(Type.RARE, 0, "Robo-car", 20, 0.3);
        controller.createToy(Type.POPULAR, 0, "Barbie", 320, 0.9);
        controller.createRareToy(0, "Robot", 0, 0.2);
        controller.createRareToy(0, "Spinner", 0, 0.1);

        controller.prizeMachineStart();
    }
}
