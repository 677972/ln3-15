package kosta.lessons.day7;

import javax.imageio.IIOException;
import java.util.Arrays;
import java.util.Scanner;

//Ручная сортировка массива после ввода его с клавиатуры. Вводишь 5 чисел и сортируешь в порядке возрастания.
public class Lesson7  {

    public void startDay7() {
        System.out.println("Введите 5 целых чисел");
        Scanner sc = new Scanner(System.in);
        long[] array = new long[5];
        try {
            for (int i = 0; i < array.length; i++)
                array[i] = sc.nextInt();
                System.out.println(Arrays.toString(array));
                methodSort(array);
                choiceSort(array);
                bubbleSort(array);
                insertSort(array);
        } catch (Exception e) {
            System.out.println("Введенная строка не является целым числом");
            startDay7();
        }
    }

    //СОРТИРОВКА МЕТОДОМ Arrays.sort()
    public static void methodSort(long[] arrayToSort){

        long time1 = System.nanoTime();
        long[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        Arrays.sort(array);
        time1 = System.nanoTime() - time1;
        System.out.printf(Arrays.toString(array) + " - сортировка методом Arrays.sort() %,9.3f ms\n", time1/1_000_000.0);

    }

    //СОРТИРОВКА ВЫБОРОМ - делит массив на сортированную и несортированную часть
    public static void choiceSort(long[] arrayToSort){

        //проходим по массиву
        //находим минимальный элемент
        //меняем местами первый и минимальный элемент
        //повторяем пока не пройдем по всему массиву

        long time2 = System.nanoTime();
        long[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        int Min;

        for (int i = 0; i < array.length - 1; i++) { //доходим не до последнего элемента массива, т.к. его будет не с чем сравнить (ненужная итерация)
            Min = i;
            for (int j = i; j < array.length; j++) {
                if (array[Min] > array[j]){
                    Min = j;
                }
            }
            long temp = array[i];
            array[i] = array[Min];
            array[Min] = temp;
        }

        time2 = System.nanoTime() - time2;
        System.out.printf(Arrays.toString(array) + " - сортировка выбором %,9.3f ms\n", time2/1_000_000.0);

    }

    //СОРТИРОВКА ПУЗЫРЬКОМ - сравниваются два соседних елемента и устанавливаются в правильном поряддке
    //самый большой элемент в списке оказывается в самом верху массива, а все более мелкие элементы смещаются на одну позицию влево
    public static void bubbleSort(long[] arrayToSort){

        //проходим по массиву
        //сравниваем два соседних элемента и при необходимости меняем их местами
        //повторяем, пока не отсортируем
        //хорошо работает если массив уже частично отсортирован

        long time3 = System.nanoTime();
        long[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        int changeCounter;

        do {
            changeCounter=0;
            for (int i = 0; i < array.length - 1; i++) { //доходим не до последнего элемента массива, т.к. его будет не с чем сравнить (ненужная итерация)
                if (array[i]>array[i + 1]){
                    long temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    changeCounter++;
                }
            }
        } while (changeCounter>0);

        time3 = System.nanoTime() - time3;
        System.out.printf(Arrays.toString(array) + " - сортировка пузырьком %,9.3f ms\n", time3/1_000_000.0);

    }

    //СОРТИРОВКА ВСТАВКАМИ - делит массив на сортированную и несортированную часть
    public static void insertSort(long[] arrayToSort){

        //проходим по массиву
        //последовательно выбираем каждый элемент в этом массиве
        //устанавливаем элемент на его позицию в отсортированной части массива
        //хорошо работает если массив уже частично отсортирован

        long time4 = System.nanoTime();
        long[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long element; // это тот самый элемент который выбираем, чтобы проверить где он должен находится
        int indexToInsert; //индекс в отсортированной части массива, куда мы установим элемент

        for (int i = 0; i < array.length; i++) {
            element = array[i];
            indexToInsert = i;
            while (indexToInsert > 0 //первое условие - пока мы не просмотрели все элементы массива продолжаем цикл
                    && array[indexToInsert-1] > element) { //второе условие - пока индекс для вставки и число которое находится в отсортированной части массива больше элемента который мы должны вставить
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;

            }
        }

        time4 = System.nanoTime() - time4;
        System.out.printf(Arrays.toString(array) + " - сортировка вставками %,9.3f ms\n", time4/1_000_000.0);

    }

}
