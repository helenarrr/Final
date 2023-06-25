package WorkWithJava;

import WorkWithJava.ClassesAnimals.*;


import java.util.Scanner;

abstract public class Registry {

    Scanner sc = new Scanner(System.in);

    public void addNewAnimal() {
        System.out.println("Какое животное вы хотите завести в базу?");
        System.out.println("1-Домашнее, 2-Вьючнное, введите в консоль цифру: ");
        int flag = sc.nextInt();
        if (flag == 1) {
            System.out.println("1-Кошка, 2-Собака, 3-Хомяк");
            flag = sc.nextInt();
            if (flag == 1) {
                Cats cats = new Cats();
                System.out.println("Введите имя животного: ");
                String name = sc.nextLine();
                cats.setName(name);
            }
            if (flag == 2) {
                Dogs dogs = new Dogs();
                System.out.println("Введите имя животного: ");
                String name = sc.nextLine();
                dogs.setName(name);
            }
            if (flag == 3) {
                Hamsters hamsters = new Hamsters();
                System.out.println("Введите имя животного: ");
                String name = sc.nextLine();
                hamsters.setName(name);
            }
        }
        if (flag == 2) {
            System.out.println("1-Лошадь, 2-Осел, 3-Верблюд");
            flag = sc.nextInt();
            if (flag == 1) {
                Horses horses = new Horses();
                System.out.println("Введите имя животного: ");
                String name = sc.nextLine();
                horses.setName(name);
            }
            if (flag == 2) {
                Donkeys donkeys = new Donkeys();
                System.out.println("Введите имя животного: ");
                String name = sc.nextLine();
                donkeys.setName(name);
            }
            if (flag == 3) {
                Camels camels = new Camels();
                System.out.println("Введите имя животного: ");
                String name = sc.nextLine();
                camels.setName(name);
            }
        }
    }
}