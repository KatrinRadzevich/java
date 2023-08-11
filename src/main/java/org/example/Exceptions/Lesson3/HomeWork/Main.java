package org.example.Exceptions.Lesson3.HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] personInfoArray = personInfoInput();
        saveToFile(personInfoArray);
    }

    public static void saveToFile(String[] personInfo) {
        String[] fio = getName(personInfo).split(" ");
        Path path = Paths.get(fio[0] + ".txt");
        String text = rightPersonInfoString(personInfo);

        try {
            Files.write(path,
                    text.getBytes(),
                    StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE
            );

            System.out.println("Успешно записано");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String rightPersonInfoString(String[] personInfoArray) {
        String name = getName(personInfoArray);
        String date = getDate(personInfoArray);
        String phoneNumber = getPhoneNumber(personInfoArray);
        String sex = getSex(personInfoArray);
        return name + date + phoneNumber + sex;
    }

    public static String[] personInfoInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свои данные: Фамилия Имя Отчество(фамилия на первом месте), дата рождения(dd.mm.yyyy), номер телефона(только цифры без скобок,плюсов и др), пол(f/m). \nДанные можно в произвольном порядке,через пробел,без запятых :");
        String info = (scanner.nextLine());
        return info.trim().split(" ");
    }


    public static String getSex(String[] personInfoArray) {
        for (int i = 0; i < personInfoArray.length; i++) {
            if (personInfoArray[i].equals("m") || personInfoArray[i].equals("f")) {
                String sex = personInfoArray[i];
                return " " + sex;
            }
        }
        throw new IllegalArgumentException("Пол не валиден");
    }

    public static String getPhoneNumber(String[] personInfoArray) {
        for (int i = 0; i < personInfoArray.length; i++) {
            if (personInfoArray[i].matches("[0-9]+")) {
                String phoneNumber = personInfoArray[i];
                return " " + phoneNumber;
            }
        }
        throw new IllegalArgumentException("Номер не валиден");
    }

    public static String getDate(String[] personInfo) {
        for (int i = 0; i < personInfo.length; i++) {
            if (personInfo[i].contains(".")) {
                if (personInfo[i].matches("^(\\d{4}).(0?[1-9]|1[012]).(0?[1-9]|[12][0-9]|3[01])$") || personInfo[i].matches("^(0?[1-9]|[12][0-9]|3[0-1]).(0?[1-9]|1[0-9]).\\d{4}$")) {
                    String date = personInfo[i];
                    return " " + date;
                }
            }
        }
        throw new IllegalArgumentException("Дата не валидна");
    }

    public static String getName(String[] personInfoArray) {
        String name = "";
        for (int i = 0; i < personInfoArray.length; i++) {
            if (personInfoArray[i].matches("[А-я]+")) {
                name += personInfoArray[i] + " ";
            }
            String[] rightName = name.split(" ");
            if (rightName.length == 3) return name;
        }
        throw new IllegalArgumentException("Имя не валидно");
    }
}
