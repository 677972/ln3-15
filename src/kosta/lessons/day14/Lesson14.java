//через input/outputStream записать в файл и прочитать User
package kosta.lessons.day14;

import java.io.*;

public class Lesson14
{
//    Назначение класса FileOutputStream - запись байтов в файл
    public void setFileOutputStream() throws IOException
    {
        File file = new File("D:\\day14.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
//        Дополнительный параметр boolean append. Если true, данные дозаписываются в конец файла.
//        Если false (а по умолчанию это значение и есть false), старые данные будут стерты, а новые записаны.
        User14 user14 = new User14();
        fileOutputStream.write(user14.toString().getBytes());
    }

//    Назначение класса FileInputStream - чтение байтов из файла
//    Но обращение к источнику данных, например, чтение из файла, дорогостоящая по производительности операция.
//    И каждый раз обращаться к файлу для чтения по одному байту расточительно.
/*    public void getFileInputStream() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("D:\\test.txt");

        int i;
        while ((i=fileInputStream.read())!= -1)
        {
            System.out.print((char)i);
        }
    }*/

//    Назначение класса BufferedInputStream - считывает данные не по одному байту, а блоками
//    и временно хранит их в специальном буфере. Это позволяет оптимизировать работу программы за счет того,
//    что уменьшается количество обращений к файлу. Буферизированные потоки нужны прежде всего для оптимизации ввода-вывода.
    public void getBufferedInputStream() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\day14.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception FileNotFoundException) {
            System.out.println("Файл не найден");
        }
    }
}
