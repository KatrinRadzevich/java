package org.example.OOP.Lesson1.ClassWork.Ex1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ronnie", "Gray", 2);
//        System.out.println("Кот: " + cat1.getName() + " с цветом шерсти: " + cat1.getColour() + " с количеством годиков: " + cat1.getAge());
//        cat1.setAge(-5);
//        cat1.setAge(5);
//        System.out.println("Кот: " + cat1.getName() + " с цветом шерсти: " + cat1.getColour() + " с количеством годиков: " + cat1.getAge());
//        cat1.animalInfo();
//        cat1.voice();
//        cat1.jump();
//    Animal cat2 = new Cat();
//    ((Cat)cat2).klubok();
        Animal[] catAndDog = {
                new Cat("Ronnie", "gray", 2),
                new Dog("Ray", "yellow", 5)
        };
        for (Animal o : catAndDog) {

            o.klubok();
//            if (o instanceof Cat) {
//                ((Cat) o).klubok();
//            } else {
//                System.out.println("Животное не кот");
//            }

//            try {
//                ((Cat) o).klubok();
//            } catch(ClassCastException ex){
//                System.out.println("ошибка");
//            }
            o.voice();
        }
    }
}

