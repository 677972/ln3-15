package kosta.lessons.day3;

import java.math.BigDecimal;

/*Создать отдельный класс User. Найти в интернете список всех типов данных JAVA.
Создать 8 полей используя 8 основных типов данных JAVA в этом классе и для примера обозвать их как то по смысловому ... типа String name; int age; и т.д.
Bonus: в каком типе хранят деньги и добавить к юзеру
Зайти на сайт JavaRush купить месячную подписку и в свободное время проходить после моих задач (стоит 1800руб). Для тренеровки основ пойдет*/
public class User3 {
    byte age = 18; //1 байт от -128 до 128
    short height = 185; //2 байта от -32,768 до 32,767
    int population = 144500000; //4 байта от -2,147,483,648 до 2,147,483,647
    long vvp = 1578000000; //8 байт от -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807
    float dollar = 78.80f; //4 байта, дробные
    double euro = 86.20; //8 байт, дробные - обычно используется
    boolean registration = false; //логический, true или false
    char male = 'м'; //   один любой символ
    BigDecimal money = BigDecimal.valueOf(35.50);  //деньги
    String txt = "Содержит какой то текст";  //текст

    public void startDay3() {
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("population = " + population);
        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("registration = " + registration);
        System.out.println("male = " + male);
        System.out.println("money = " + money);
        System.out.println("txt = " + txt);
    }
}
