package kosta.lessons.day12;

public class Staff12 implements Runnable {
    private String name = "Tom";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
