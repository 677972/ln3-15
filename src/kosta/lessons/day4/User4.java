package kosta.lessons.day4;

import java.math.BigDecimal;

public class User4 {
    private byte age = 18;
    private short height = 185;
    private int population = 144500000;
    private long vvp = 1578000000;
    private float dollar = 78.80f;
    private double euro = 86.20;
    private boolean registration = false;
    private char male = 'м';
    private BigDecimal money = BigDecimal.valueOf(35.50);
    private String txt = "Содержит какой то текст";
    private Card4 card4; // инициализация переменной

    //метод Alt + Insert / Setter
    public void setCard4(Card4 card4) {
        this.card4 = card4;
    }

    @Override //метод преобразует и возвращает строку Alt + Insert / toString()
    public String toString() {
        return "User{" +
                "age=" + age +
                ", height=" + height +
                ", population=" + population +
                ", vvp=" + vvp +
                ", dollar=" + dollar +
                ", euro=" + euro +
                ", registration=" + registration +
                ", male=" + male +
                ", money=" + money +
                ", txt='" + txt + '\'' +
                ", card1=" + card4 +
                '}';
    }

}
