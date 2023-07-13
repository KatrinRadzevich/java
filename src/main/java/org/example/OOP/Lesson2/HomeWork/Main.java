package org.example.OOP.Lesson2.HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Members> members = new ArrayList<>();
        members.add(new Human("qwe", 10, 2));
        members.add(new Cat("qwe1", 2, 2));
        members.add(new Robot("dew", 100000, 20000));

        ArrayList<Challenges> challenges = new ArrayList<>();
        challenges.add(new Treadmill(4));
        challenges.add(new Wall(2));


        for (Challenges challenge : challenges) {
            System.out.println();
            for (Members member : members) {
                if (member.getWin()) {
                    if (challenge.getLength() != 0) {
                        if (!member.run(challenge.getLength())) member.setWin(false);
                    } else {
                        member.jump(challenge.getHeight());
                    }
                }
            }
        }
    }
}