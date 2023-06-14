package org.example.Lesson2.ClassWork;

import static java.lang.Math.sqrt;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длину вектора
     */
    public double vectorLenght() {
        return sqrt(x * x + y * y + z * z);
    }

    /**
     * @return скалярное произведение
     */
    public double scalar(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @return векторное произведение
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x
        );
    }

    /**
     * @return косинус угла вектора
     */
    public double kosVector(Vector vector2) {
        return scalar(vector2) / (vectorLenght() * vector2.vectorLenght());
    }

    /**
     * @return сумма векторов
     */
    public Vector vectorPlus(Vector vector2) {
        return new Vector(
                x + vector2.x,
                y + vector2.y,
                z + vector2.z
        );
    }

    /**
     * @return разница векторов
     */
    public Vector vectorMinus(Vector vector2) {
        return new Vector(
                x - vector2.x,
                y - vector2.y,
                z - vector2.z
        );
    }
}
