package kosta.lessons.day9.var1;

/*В Java многопоточность программы организуется с помощью интерфейса Runnable
 и класса Thread, который наследуется от Runnable.
 Первый способ более гибкий, второй – проще.*/

public class Staff9
{
    private String name;

    //Alt + Insert / Constructor
    public Staff9(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*    private String name;

    //Alt + Insert / Constructor
    public Staff9(String name)
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
    }*/
}
