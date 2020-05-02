/* 1 Сериализация
2 Сборка объектов класса Staff в 10 потоках
 https://younglinux.info/java/runnable */

package kosta.lessons.day9.var1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson9
{
    public void startDay9() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Staff9 obj1 = new Staff9("obj" + finalI);
                    System.out.println(obj1.getName());
                }
            });
        }
        executorService.shutdown();
    }






/*    public void startDay9 ()
    { //14-16 засунуть внутрь потока
        Staff9 obj1 = new Staff9("obj1");
        Staff9 obj2 = new Staff9("obj2");
        Staff9 obj3 = new Staff9("obj3");

        ExecutorService executorService = Executors.newFixedThreadPool(10); //продублитровать
        executorService.submit(obj1);
        executorService.submit(obj2);
        executorService.submit(obj3);
        executorService.shutdown();

        // переделать, сделать 10 потоков и вывести объект в каждом
    }*/
}
