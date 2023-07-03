package WorkWithJava;

public class Counter implements AutoCloseable {
    static int count;
    static boolean flag;

    public void add() {
        count++;
    }

    @Override
    public void close() {
        if (!flag) {
            throw new IllegalStateException("Работа с объектом типа Счетчик была не в ресурсном try или ресурс остался открыт");
        }
    }
}

