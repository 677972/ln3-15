package kosta.lessons.day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//1) Сериализация 2) Сборка объектов класса Staff в 10 потоках https://younglinux.info/java/runnable
public class Lesson9 {

    //вариант реализации 1
    public void startDay9() {
//        ExecutorService service = Executors.newFixedThreadPool(10); //пул с 10ю потоками
        ExecutorService executorService = Executors.newCachedThreadPool(); //кэширующий пул потоков - создает потоки по мере необходимости и переиспользует неактивные потоки (подчищает потоки, которые были неактивные некоторое время)
        for (int i = 0; i < 10; i++) { //запускает код асинхронно 10 раз
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Staff9 obj1 = new Staff9("Jerry" + finalI);
                    System.out.println(obj1.getName());
                }
            });
        }
        executorService.shutdown();
        startDay91();
    }

    //вариант реализации 2
    public void startDay91() {

        Staff91 staff91 = new Staff91();

        Thread t1 = new Thread(staff91);
        Thread t2 = new Thread(staff91);
        Thread t3 = new Thread(staff91);
        Thread t4 = new Thread(staff91);
        Thread t5 = new Thread(staff91);
        Thread t6 = new Thread(staff91);
        Thread t7 = new Thread(staff91);
        Thread t8 = new Thread(staff91);
        Thread t9 = new Thread(staff91);
        Thread t10 = new Thread(staff91);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }

}
