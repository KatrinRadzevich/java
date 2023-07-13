package org.example.OOP.Lesson2.HomeWork;

public class Human implements Members {
    protected String type;
    protected double maxRunDistance;
    protected double maxJumpDistance;
    private boolean win;

    public Human(String type, double maxRunDistance, double maxJumpDistance) {
        this.type = "Human";
        if (maxRunDistance > 5.5) this.maxRunDistance = 5.5;
        else this.maxRunDistance = maxRunDistance;
        if (maxJumpDistance > 1.5) this.maxJumpDistance = 1.5;
        else this.maxJumpDistance = maxJumpDistance;
        this.win = true;
    }

    @Override
    public boolean run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " could run: " + distance + "km" + " because he can run for " + maxRunDistance + "km even");
            return true;
        } else {
            System.out.println(type + " could NOT run: " + distance + "km" + " because he can run for " + maxRunDistance + "km only");
            return false;
        }
    }

    @Override
    public void jump(double distance) {
        if (distance <= maxJumpDistance) {
            System.out.println(type + " could jump over: " + distance + "m" + " because he can jump for " + maxJumpDistance + "m even");
        } else {
            System.out.println(type + " could NOT jump over: " + distance + "m" + " because he can jump for " + maxJumpDistance + "m only");
        }
    }

    @Override
    public void setWin(boolean win) {
        this.win = win;
    }

    @Override
    public boolean getWin() {
        return win;
    }

    @Override
    public String toString() {
        return type + ", maxRunDistance=" + maxRunDistance + "km" +
                ", maxJumpDistance=" + maxJumpDistance + "m";
    }
}
