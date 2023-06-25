package WorkWithJava.MVP;

import WorkWithJava.ReadInfo;
import WorkWithJava.Registry;

import java.io.IOException;
import java.util.Scanner;

public class Model {

    View view = new View();
    Registry registry = new Registry();

    public void workWithRegistry() throws IOException {

        int choice = view.menu();
        switch (choice) {
            case 1 -> registry.addNewAnimal();
            case 2 -> ReadInfo.readInfo();

//          case 3 -> ;
            case 4 -> System.out.println("До свидания!");
//
        }
    }
}

