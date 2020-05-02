/* 1 Абстрактный класс people для User и Staff (в нем добавить поле время работы что бы унаследовали)
2 Интерфейс для User и Staff с методом вывода на экран своего времени работы (пояснение: Staff выводит часы работы, User выводит сообщение об отсутствии работы)*/

package kosta.lessons.day8.Inter;

public abstract class Lesson81 implements Inter {
    private int workTime = 8;

    public void startDay81(boolean workStatus) {
        if (workStatus){
            System.out.println("Рабочее время " + workTime + " часов");
        } else System.out.println("Работа отсутствует");
    }

}