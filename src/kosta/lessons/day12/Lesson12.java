/*собрать в 10 потоках User и Staff собрать их в List и потом отсортировать
в листа: User и Staff затолкать их в List, HashMap, Set, Tree*/
package kosta.lessons.day12;

import java.util.Arrays;
import java.util.List;

public class Lesson12
{    
    public void startDay12 ()
    {
        
        List<Thread> list = createList();
        list.sort(null);
        list.forEach(System.out::println);
        
    }

    private List<Thread> createList() {
        Staff12 staff12 = new Staff12();

        Thread t1 = new Thread(staff12);
        Thread t2 = new Thread(staff12);
        t1.start();
        t2.start();

        return Arrays.asList(t1,t2);
    }

}
