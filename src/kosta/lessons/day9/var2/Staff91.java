package kosta.lessons.day9.var2;

/*В Java многопоточность программы организуется с помощью интерфейса Runnable
 и класса Thread, который наследуется от Runnable.
 Первый способ более гибкий, второй – проще.*/

public class Staff91 implements Runnable {
    int ind;
    private String name = "Tom";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        ind++;
        System.out.println(name + ind);
    }
}