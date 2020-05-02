/* Сегодня ковыряешь экспепшены. Выстрелишь ексепшеном в одном из потоков (используй throw).
Слова какие нада знать: try, catch, throw, throws, error,
exception, nullPointerException, OutOfBoundException, out of memory
Попробуй положить программу с outOfMemory*/
package kosta.lessons.day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson10
{
    public void startDay10 ()
    {
        Staff10 obj1 = new Staff10("obj1");
        Staff10 obj2 = new Staff10("obj2");
        Staff10 obj3 = new Staff10("obj3");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(obj1);
        executorService.submit(obj2);

        // Блок try/catch размещается в начале и конце кода, который может сгенерировать исключение.
        // Код в составе блока try/catch является защищенным кодом.
        // Код, предрасположенный к исключениям, размещается в блоке try
        try
        {
            obj2.method1();
        } catch (Exception a)
        {
            System.out.println("Исключение1");
            a.printStackTrace(); //выводит в консоль сообщение (в конкретном случае указывает на место исключения)
        }
//все потоки в трай кетч, а внутри потока исключение

        executorService.submit(obj3);
        executorService.shutdown();
    }
}
