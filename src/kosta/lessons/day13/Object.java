//Класс object посмотреть
package kosta.lessons.day13;
//Всего в Object 11 публичных методов, 5 обычных и 6 с нативной реализацией.
/*
Класса Object - корень иерархии классов.
Каждый класс имеет Object как суперкласс.
Все объекты, включая массивы, реализуют методы этого класса.

Конструктор:
Object()

Методы:
protected Object clone() - Создает и возвращает копию этого объекта
protected void finalize() - Вызывается сборщиком мусора когда нет больше ссылок на объект
Class getClass() - Возвращает класс во время выполнения
int hashCode() - Возвращает hash код для объекта
void notify() - Возобновляет единичный поток, который ожидает на объектном мониторе
void notifyAll() - Возобновляет все потоки, которые ожидают на объектном мониторе
String toString() - Возвращает строковое представление объекта
void wait() - Остановка текущего потока пока другой поток не вызовет notify() или notifyAll метод для этого объекта
void wait(long timeout) - Остановка текущего потока на время или пока другой поток не вызовет notify() или notifyAll метод для этого объекта
void wait(long         time        out, int nanos) - Остановка текущего потока на время или пока другой поток не вызовет notify() или notifyAll метод для этого объекта
*/

public class Object {
   /* private static native void registerNatives();
    static {
        registerNatives();
    }

    public final native Class<?> getClass();

    public native int hashCode();

    public boolean equals(Object obj) {
        return (this == obj);
    }

    protected native Object clone() throws CloneNotSupportedException;

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public final native void notify();

    public final native void notifyAll();

    public final native void wait(long timeout) throws InterruptedException;

    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                    "nanosecond timeout value out of range");
        }

        if (nanos >= 500000 || (nanos != 0 && timeout == 0)) {
            timeout++;
        }

        wait(timeout);
    }

    public final void wait() throws InterruptedException {
        wait(0);
    }

    protected void finalize() throws Throwable { }
*/
}
