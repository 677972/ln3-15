package kosta.lessons.day10;

import java.util.LinkedList;
import java.util.List;

public class OutMem
{
    public void startDay10()
    {
        List<Object[]> arrays = new LinkedList<>();
        for (; ; )
        {
            arrays.add(new Object[10]);
        }
    }
}
