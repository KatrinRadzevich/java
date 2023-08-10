package org.example.Exceptions.Lesson3.ClassWork.Ex6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        readAndWrite();
    }

    private static void readAndWrite() {
        try {
            Map<String, String> map = readFile("test.txt");
            replaceText(map);
            saveToFile("t/t/t/test1.txt", map);
        } catch (ReadFileException e){
            e.printStackTrace();
        } catch (SaveFileException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            System.out.println("Неверный формат записи");
            System.out.println(e.getMessage());
        }
    }

    private static void saveToFile(String filePath, Map<String, String> map) throws SaveFileException {
        try (FileWriter writer = new FileWriter(filePath)){
            for (Map.Entry<String, String> entry: map.entrySet()){
                writer.write(entry.toString());
                writer.write("\n");
                writer.flush();
            }
        } catch (IOException e){
            throw new SaveFileException("Запись в файл не удалась", e);
        }
    }

    private static void replaceText(Map<String, String> map){
        for (Map.Entry<String, String> entry: map.entrySet()){
            String key = entry.getKey();
            String val = entry.getValue();
            if (val.equals("?")){
                entry.setValue(String.valueOf(key.length()));
            } else if (!val.matches("[0-9]+")) {
                throw new IllegalArgumentException("Ошибка в строке: " + entry);
            }
        }
    }

    private static Map<String, String> readFile(String filePath) throws ReadFileException {
        Map<String, String> map = new LinkedHashMap<>();
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] temp = line.split("=");
                map.put(temp[0], temp[1]);
            }
        } catch (IOException e){
            throw new ReadFileException("Чтение файла не удалось", e);
        }
        return map;
    }
}
