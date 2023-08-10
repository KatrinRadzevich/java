package org.example.Exceptions.Lesson3.ClassWork.Ex5;

public class Ex5 {
    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "2", "3", "6"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        try {
            System.out.println(arraySumElements(myArray));
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
//        try {
//            System.out.println(arraySumElements(myArray));
//        }catch (MyArrayDataException | MyArraySizeException e) {
//            e.printStackTrace();
//        }
    }

    public static int arraySumElements(String[][] myArray) {
        int res = 0;
        int arraySize = 4;
        if (myArray.length != arraySize)
            throw new MyArraySizeException("Desired array length: " + arraySize + ". Current length: " + myArray.length);
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length != arraySize)
                throw new MyArraySizeException("Desired array length: " + arraySize + ". Current length: " + myArray[i].length);
            for (int j = 0; j < myArray[i].length; j++) {
//                if(myArray[i][j].matches("[0-9]+")) throw new MyArrayDataException();
                try {
                    res += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return res;
    }
}

