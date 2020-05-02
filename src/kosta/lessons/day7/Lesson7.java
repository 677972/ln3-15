/* Сортировка массива после ввода его с клавиатуры. Вводишь 5 чисел и сортируешь в порядке возрастания
не доработал проверку на ввод букв*/

package kosta.lessons.day7;

import java.util.Arrays;
import java.util.Scanner;

// Завершает если введено нецелое число
/*
public class Lesson7 {
    private int m = 5;
    public void startDay7 () {
        int [] array = new int[m];
        System.out.println("Введите 5 целых чисел");
        try (Scanner scanner = new Scanner(System.in)) {
            for (int m = 1; m < array.length; m++) {
                array[m] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число");
        }
    }
}*/

/*public class Lesson7 {
    private int m = 5;
    public void startDay7 () {
        System.out.println("Введите 5 целых чисел");
        int [] array = new int[m];
        Scanner scanner = new Scanner(System.in);
        for (int m = 0; m < array.length; m++) {
            if (scanner.hasNextInt()) {
                array[m] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Вы ввели не целое число");
    }
}*/


// отсортировать руками (сравнение) доработать
public class Lesson7 {
    private int m = 5;

    public void startDay7() {
        System.out.println("Введите 5 целых чисел");
        int[] array = new int[m];
        Scanner scanner = new Scanner(System.in);
        for (int m = 1; m < array.length; m++)
            array[m] = scanner.nextInt();
        if (scanner.hasNextInt()) {
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));}
        else System.out.println("Вы ввели не целое число");
    }
}
