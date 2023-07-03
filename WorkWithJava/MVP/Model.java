package WorkWithJava.MVP;

import WorkWithJava.WorkWithFiles.ExtraFunctional;
import WorkWithJava.WorkWithFiles.ReadInfo;
import WorkWithJava.Registry;

import java.io.IOException;

public class Model {

    View view = new View();
    Registry registry = new Registry();

    public void workWithRegistry() throws IOException {

        ExtraFunctional extraFunctional = new ExtraFunctional();
        int choice = view.menu();
        switch (choice) {
            case 1 -> registry.countAddAnimal();
            case 2 -> ReadInfo.readCommands();
            case 3 ->  extraFunctional.addCommand();
            case 4 -> System.out.println("До свидания!");
        }
    }
}

