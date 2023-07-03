package WorkWithJava.WorkWithFiles;

import java.io.*;
import java.util.Scanner;

public class ReadInfo {


    public static void readCommands() throws IOException {

        File file = new File("Animals.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя животного, чтобы посмотреть, что он умеет : ");
        String name = sc.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(name)) {
                    int index = line.indexOf(name) + (name.length() + 2);
                    String needStr = line.substring(index);
                    System.out.println(needStr);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
