package kosta.lessons.day9;

//Многопоточность организуется с помощью интерфейса Runnable и класса Thread, который наследуется от Runnable.
public class Staff91 implements Runnable {

    private int ind;
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