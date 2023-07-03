package WorkWithJava.MVP;

import java.util.Scanner;

public class View {

    public int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите цифру меню: ");
        System.out.println("\t1. Завести новое животное\n");
        System.out.println("\t2. Увидеть список команд, которое выполняет животное\n");
        System.out.println("\t3. Обучить животное новым командам\n");
        System.out.println("\t4. Выход\n");
        return sc.nextInt();
    }

}


