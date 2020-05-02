/*Jackson распарсить User из файла в объект
1 Скачал Jackson http://www.java2s.com/Code/Jar/j/jackson-all.htm
2 Импорт в идею
Структура проекта (CTRL + SHIFT + ALT + S on Windows/Linux, ⌘ + ; on Mac OS X)
Modules на левой панели / Вкладка Dependencies / '+' → JARs or directories
https://github.com/FasterXML/jackson-docs
https://mkyong.com/java/jackson-how-to-parse-json/
*/
package kosta.lessons.day15.var2;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson151 {

//  Java Objects to JSON
    public void setObjectMapper ()
    {
        ObjectMapper mapper = new ObjectMapper();

        User151 user151 = createUser15();

        try {

//          Java objects to JSON file
            mapper.writeValue(new File("D:\\user151.json"), user151);

//          Java objects to JSON string - compact-print
            String jsonString = mapper.writeValueAsString(user151);
            System.out.println(jsonString);

//          Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user151);
            System.out.println(jsonInString2);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getObjectMapper()
    {
        ObjectMapper mapper = new ObjectMapper();

        try {

//          JSON file to Java object
            User151 user151 = mapper.readValue(new File("D:\\user151.json"), User151.class);

//          JSON string to Java object
            String jsonInString = "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
            User151 user152 = mapper.readValue(jsonInString, User151.class);

//          compact print
            System.out.println(user152);

//          pretty print
            String prettyUser152 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user152);

            System.out.println(prettyUser152);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//  Create User15
    private static User151 createUser15() {

        User151 user151 = new User151();

        user151.setName("Tom");
        user151.setAge(30);
        user151.setPosition(new String[]{"Founder", "CTO", "Writer"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2020", new BigDecimal(20000));
            put("2030", new BigDecimal(30000));
        }};
        user151.setSalary(salary);
        user151.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

        return user151;

    }

}
