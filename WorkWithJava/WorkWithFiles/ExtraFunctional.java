package WorkWithJava.WorkWithFiles;

import java.io.*;
import java.util.Scanner;

public class ExtraFunctional {
    public void addCommand() throws IOException {

        try {
            File file = new File("Animals.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            Scanner sc = new Scanner(System.in);
            String line;
            System.out.println("Введите имя животного, чтобы изменить команду: ");
            String name = sc.nextLine();
            System.out.println("Введите команду: ");
            String command = sc.nextLine();
            boolean isLineEdited = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(name))  {
                    line = line + ", " + command;
                    isLineEdited = true;
                }

                sb.append(line).append("\n");

            }
            reader.close();

            if (isLineEdited) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(sb.toString());
                writer.close();
                System.out.println("Файл успешно отредактирован.");
            } else {
                System.out.println("Строка не была отредактирована.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при редактировании файла: " + e.getMessage());
        }
    }
}

