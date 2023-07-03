package WorkWithJava;

import WorkWithJava.ClassesAnimals.*;
import WorkWithJava.WorkWithFiles.WriteInfo;

import java.util.Scanner;

public class Registry {
    Scanner sc = new Scanner(System.in);

    public void addNewAnimal() {
        String command;
        System.out.println("Какое животное вы хотите завести в базу?");
        System.out.println("1-Домашнее, 2-Вьючнное, введите в консоль цифру: ");
        int flag = sc.nextInt();
        if (flag == 1) {
            System.out.println("1-Кошка, 2-Собака, 3-Хомяк");
            flag = sc.nextInt();
            if (flag == 1) {
                System.out.println("Введите имя животного: ");
                Cats cats = new Cats(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                command = cats.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo("Кошка: ", cats, command);
            }
            if (flag == 2) {
                System.out.println("Введите имя животного: ");
                Dogs dogs = new Dogs(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                command = dogs.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo("Собака: ", dogs, command);

            }
            if (flag == 3) {
                System.out.println("Введите имя животного: ");
                Hamsters hamsters = new Hamsters(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                command = hamsters.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo("Хомяк: ", hamsters, command);
            }
        } else if (flag == 2) {
            System.out.println("1-Лошадь, 2-Осел, 3-Верблюд");
            flag = sc.nextInt();
            if (flag == 1) {
                System.out.println("Введите имя животного: ");
                Horses horses = new Horses(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                command = horses.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo("Лошадь: ", horses, command);
            }
            if (flag == 2) {
                System.out.println("Введите имя животного: ");
                Donkeys donkeys = new Donkeys(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                command = donkeys.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo("Осел: ", donkeys, command);

            }
            if (flag == 3) {
                System.out.println("Введите имя животного: ");
                Camels camels = new Camels(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                command = camels.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo("Верблюд: ",camels, command);

            }
        }
    }
}