package kosta.lessons.day4;

public class Card4 {
    private String name = "User";
    private String colour = "Black";
    private int height =50;

    @Override    //метод преобразует и возвращает строку Alt + Insert / toString()
    public String toString() {
        return "Card4{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                '}';
    }

}