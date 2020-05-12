package kosta.lessons.day5;

import java.util.Scanner;

// При нажатии в консоли буквы А будет вызываться метод который присвоит User имя Боб, использовать класс Scanner
public class Lesson5
{
    private String str = null;

    public void startDay5()
    {
        Scanner ss = new Scanner(System.in);

        do {
            System.out.println("Укажите букву А");
            str = ss.next();
        } while (!str.equals("A"));

        System.out.println("Буква А указана верно. Имя Bob будет присвоено.");
        new Lesson5().startDay52();
    }

    public void startDay52()
    {
        User5 user5 = new User5();
        System.out.println(user5.toString());
        user5.setName("Bob");
        System.out.println(user5.toString());
    }
}
