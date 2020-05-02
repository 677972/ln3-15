package kosta.lessons.day5;

public class User5 {

    private String name;

//  метод Alt + Insert / Setter
    public void setName(String name) {
        this.name = name;
    }

//  метод преобразует и возвращает строку Alt + Insert / toString()
    @Override
    public String toString() {
        return "User5{" +
                "name='" + name + '\'' +
                '}';
    }
}
