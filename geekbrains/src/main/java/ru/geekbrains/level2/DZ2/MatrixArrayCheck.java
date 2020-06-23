package ru.geekbrains.level2.DZ2;

public class MatrixArrayCheck {
    private static final int SIZE = 4;

    public void checkSize(String[][] matrix) {
        if (matrix.length != SIZE) {
            throw new MyArraySizeException(String.format("Размер массива [%s] не равен %s массиву %s", matrix.length, SIZE, matrix));
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != SIZE) {
                throw new MyArraySizeException(String.format("Внутренний размер массива [%s] не равен %s массиву %s", matrix[i].length, SIZE, matrix[i]));
            }
        }
    }

    public void valueToInt(String[][] matrix) {
        int val = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                try {
                    int integerVal = Integer.parseInt(matrix[i][j]);
                    val += integerVal;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Значение массива с индексом[%s][%s] не содержит целых чисел [%s]", i, j, matrix[i][j]));
                }
            }
        }
    }
}
