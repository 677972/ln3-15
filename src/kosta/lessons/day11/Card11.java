package kosta.lessons.day11;

public class Card11<S>
{
    private String name = "User";
    private String colour = "Black";
    private int height =50;

    @Override
    public String toString() {
        return "Card11{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                '}';
    }
}
