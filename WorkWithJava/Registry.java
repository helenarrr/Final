package WorkWithJava;

import WorkWithJava.ClassesAnimals.*;

import java.util.Scanner;

public class Registry {
    Scanner sc = new Scanner(System.in);

    public void addNewAnimal() {
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
                String command = cats.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo(cats, command);
            }
            if (flag == 2) {
                System.out.println("Введите имя животного: ");
                Dogs dogs = new Dogs(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                String command = dogs.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo(dogs, command);

            }
            if (flag == 3) {
                System.out.println("Введите имя животного: ");
                Hamsters hamsters = new Hamsters(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                String command = hamsters.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo(hamsters, command);
            }
        } else if (flag == 2) {
            System.out.println("1-Лошадь, 2-Осел, 3-Верблюд");
            flag = sc.nextInt();
            if (flag == 1) {
                System.out.println("Введите имя животного: ");
                Horses horses = new Horses(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                String command = horses.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo(horses, command);
            }
            if (flag == 2) {
                System.out.println("Введите имя животного: ");
                Donkeys donkeys = new Donkeys(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                String command = donkeys.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo(donkeys, command);

            }
            if (flag == 3) {
                System.out.println("Введите имя животного: ");
                Camels camels = new Camels(sc.next());
                sc.nextLine();
                System.out.println("Что умеет животное? Введите команду: ");
                String command = camels.animalCommand(sc.nextLine());
                WriteInfo.writeBasicInfo(camels, command);

            }
        }
    }
}