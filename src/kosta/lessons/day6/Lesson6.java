/* При запуске программы будет вызываться метод, который через конструктор собирает объект User с заданными параметрами:
ImageUrl, Name, Nick, Description, Location, FollowingCount, FollowersCount, Money и FIO.
Создать класс User с константами, приватными полями и геттерами и сеттерами(POJO)*/

package kosta.lessons.day6;

import java.math.BigDecimal;

public class Lesson6
{
    public void startDay6 ()
    {
        User6 user6 = new User6 (
                34534,
                "https://devcolibri.com/unit/урок-8-создание-pojo-объекта-user-работа-с-view-из-java-2/",
                "Tom",
                "Ket",
                "tdfh",
                "er",
                3425,
                346,
                BigDecimal.valueOf(3323.5234),
                "Иванов Иван Иванович");
        System.out.println(user6.getImageUrl());
        System.out.println(user6.getName());
        System.out.println(user6.getNick());
        System.out.println(user6.getDescription());
        System.out.println(user6.getLocation());
        System.out.println(user6.getFollowingCount());
        System.out.println(user6.getFollowersCount());
        System.out.println(user6.getMoney());
        System.out.println(user6.getFIO());
    }

}