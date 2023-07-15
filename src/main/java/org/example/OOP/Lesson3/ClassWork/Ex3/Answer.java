package org.example.OOP.Lesson3.ClassWork.Ex3;


public class Answer {
    Integer bull;
    Integer cow;
    static int numTry;

    public Answer() {
    }

    public Answer(Integer bull, Integer cow, Integer numTry) {
        this.bull = bull;
        this.cow = cow;
        this.numTry = numTry;
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    public Integer getNumTry() {
        return numTry;
    }

    public void setNumTry(Integer numTry) {
        this.numTry = numTry;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "bull=" + bull +
                ", cow=" + cow +
                ", numTry=" + numTry +
                '}';
    }
}
