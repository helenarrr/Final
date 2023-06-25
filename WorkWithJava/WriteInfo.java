package WorkWithJava;

import WorkWithJava.ClassesAnimals.Animal;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WriteInfo {

    public static void writeBasicInfo(Animal animal, String command) {

        try (FileWriter writer = new FileWriter("Animals.txt", true)) {
            Map<Animal, String> animalMap = new HashMap<>();
            animalMap.put(animal, command);
            for (Map.Entry<Animal, String> entry : animalMap.entrySet()) {
                writer.write(entry.getKey() + "Он умеет: " + entry.getValue() + "\n");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
