//Jackson распарсить User из файла в объект
package kosta.lessons.day15.var1;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lesson15
{
    public void startDay15()
    {
        ObjectMapper objectMapper = new ObjectMapper();

        User15 user15 = new User15();
        user15.setName("Tom");
        user15.setAge(30);
        user15.setCars(Arrays.asList("BMW", "Volvo", "Mazda"));

        try {
            //Object to JSON
            objectMapper.writeValue(new File("D:\\user15.json"), user15);
            String userAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user15);
            System.out.println("Данные в файле user15.json:");
            System.out.println(userAsString);

            //  List<User> user2 = objectMapper2.readValue (new File("D:\\user.json", new TypeReference<List<User>>()),
//            String userJSON = "{\"name\":\"Том\", \"age\":30,\"cars\":[\"BMW\",\"Volvo\",\"Mazda\"]}"; //парсинг вручную
            String userJSON = readLineByLineJava8("D:\\user15.json");
            User15 user152 = objectMapper.readValue(userJSON, User15.class);
            System.out.println("Данные из JSON в объекте User152:");
            System.out.println(user152.getName());
            System.out.println(user152.getAge());
            System.out.println(user152.getCars());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readLineByLineJava8(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}



class User15
{
    private String name;
    private Integer age;
    private List<String> cars = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }
}
