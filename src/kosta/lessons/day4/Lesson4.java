package kosta.lessons.day4;

/* 1 Создать отдельный класс Card - карточка.
2 Создать объекты Card и User
3 Заинжектить (положить) карту в юзера (т.е. добавить Setter для Card через Alt+Insert)
4 Вывести на экран содержание объекта User используя метод toString()
5 Создать класс Lesson4 и там метод - и весь код в этот метод положить, а из main его дерни
Будем складировать весь код в отдельные классы Start*/
public class Lesson4 {

    public void startDay4(){
        Card4 card4 = new Card4();  //создание объекта
        User4 user4 = new User4();
        user4.setCard4(card4); //setter карты в юзера
        System.out.println(user4.toString());
    }
}
