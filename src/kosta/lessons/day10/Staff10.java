package kosta.lessons.day10;

public class Staff10 implements Runnable
{
    private String name;

    //Alt + Insert / Constructor
    public Staff10(String name)
    {
        this.name = name;
    }

    @Override //Alt + Insert / Implements
    public void run ()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(name + ":" + i);
        }
    }

    // Инструкция throw позволяет генерировать исключения
    public void method1() throws Exception
    {
        throw new Exception();
    }

}
