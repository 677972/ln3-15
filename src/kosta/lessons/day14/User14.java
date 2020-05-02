package kosta.lessons.day14;

public class User14 {
    private String name1 = "Tom";
    private String name2 = "Jerry";

    @Override
    public String toString() {
        return "User14{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

}
