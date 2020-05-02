package kosta.lessons.day12;

public class User12 implements Runnable
{   private int num;
    private String name;

    //Alt + Insert / Constructor
    public User12(String name)
    {
        this.name = name;
    }

    @Override //Alt + Insert / Implements
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(name + ":" + i);
        }
    }
}
