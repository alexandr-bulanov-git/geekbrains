package ru.geekbrains.level2.DZ2;

public class Main {
    /**
     * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
     * при подаче массива другого размера необходимо бросить исключение prev.MyArraySizeException
     *
     * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
     * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
     * должно быть брошено исключение prev.MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные
     *
     * 3. В методе main() вызвать полученный метод, обработать возможные исключения
     * MySizeArrayException и prev.MyArrayDataException, и вывести результат расчета
     */
    public static void main(String[] args) {
        MatrixArrayCheck matrixArrayCheck = new MatrixArrayCheck();
        String[][] matrix1 = {
                {"1", "2", "3", "4"},
                {"1", "A", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] matrix2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2"},
                {"1", "2", "3", "4"}
        };

        try {
            matrixArrayCheck.checkSize(matrix2);
            matrixArrayCheck.valueToInt(matrix2);
        } catch (MyArraySizeException e) {
            System.out.println(String.format("Размер массива неправильны. %s", e.getMessage()));
        } catch (MyArrayDataException e) {
            System.out.println(String.format("Значение массива не является целым числом. %s", e.getMessage()));
        }

        try {
            matrixArrayCheck.checkSize(matrix1);
            matrixArrayCheck.valueToInt(matrix1);
        } catch (MyArraySizeException e) {
            System.out.println();
            System.out.println(String.format("Размер массива неправильный: %s", e.getMessage()));
        } catch (MyArrayDataException e) {
            System.out.println();
            System.out.println(String.format("Значение массива не является целым числом: %s", e.getMessage()));
        }
    }
}
