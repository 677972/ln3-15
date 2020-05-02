/* 1 Абстрактный класс people для User и Staff (в нем добавить поле время работы что бы унаследовали)
https://younglinux.info/java/interface
2 Интерфейс для User и Staff с методом вывода на экран своего времени работы
(пояснение: Staff выводит часы работы, User выводит сообщение об отсутствии работы)*/

package kosta.lessons.day8.AbstrNasled;

public class Lesson8 extends People8 {

    //метод вывода рабочего времени для наследования (extends)
    public static void startDay8() {
        System.out.println("Рабочее время для Staff = " + new Staff8().getWorkTime());
        System.out.println("Рабочее время для Staff = " + new User8().getWorkTime());
    }

}