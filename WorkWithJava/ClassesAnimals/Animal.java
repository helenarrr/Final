package WorkWithJava.ClassesAnimals;


public class Animal implements ICommands {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String animalCommand(String command) {
        return command;
    }

    @Override
    public String toString() {
        return String.format("Это %s. ", name);
    }
}
