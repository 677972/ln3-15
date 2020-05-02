package kosta.lessons.day11;

import kosta.lessons.day4.Card4;

public class People11<String>
{
    private int high = 170;
    private int weight = 80;
    private Card11 card11;

    public void setCard11(Card11 card11)
    {
        this.card11 = card11;
    }

    @Override
    public java.lang.String toString() {
        return "People11{" +
                "high=" + high +
                ", weight=" + weight +
                ", card11=" + card11 +
                '}';
    }
}