package kosta.lessons.day9.var2;

public class Lesson91 {
    Staff91 staff91 = new Staff91();

    Thread t1 = new Thread(staff91);
    Thread t2 = new Thread(staff91);
    Thread t3 = new Thread(staff91);
    Thread t4 = new Thread(staff91);
    Thread t5 = new Thread(staff91);
    Thread t6 = new Thread(staff91);
    Thread t7 = new Thread(staff91);
    Thread t8 = new Thread(staff91);
    Thread t9 = new Thread(staff91);
    Thread t10 = new Thread(staff91);

    public void startDay91()
    {
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }

}
