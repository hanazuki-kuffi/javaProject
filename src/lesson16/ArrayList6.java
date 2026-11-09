package lesson16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> animals = new ArrayList<>();

        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        while (true) {
            menu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Сейчас в зоопарке можно увидеть " + animals.size() + " животных:");

                for (String animal : animals) {
                    System.out.println(animal);
                }
            }
            else if(command == 2) {

                System.out.println("Какое животное хотите добавить?:  ");
                String animal = scanner.next();
                animals.add(animal);
            }
            else if (command == 3) {


                System.out.println("Какое животное нужно удалить?: ");
                String removeAnimal = scanner.next();

                if (!animals.isEmpty()) {
                    animals.remove(removeAnimal);
                }
            }
            else if (command == 4) {

                animals.clear();
                System.out.println(animals);
                System.out.println("Все животные перевезены в другой зоопарк. Список пуст.");
            }
            else if  (command == 5) {
                System.out.println("Какое животное вы хотите увидеть в зоопарке?: ");
                String animal = scanner.next();

                if (animals.contains(animal)) {
                    System.out.println(animal + " на месте! Приходите посмотреть.");
                }
                else {
                    System.out.println("Такого животного сейчас нет в нашем зоопарке.");
                }
            }
            else {
                System.out.println("Exit");
                break;
            }
        }
    }

    public static void menu() {
        System.out.println("Menu: ");
        System.out.println("1 - Показать список животных в зоопарке.");
        System.out.println("2 - Добавить животное в список.");
        System.out.println("3 - Удалить животное из списка.");
        System.out.println("4 - Очистить список.");
        System.out.println("5 - Проверить, есть ли в зоопарке животное.");
        System.out.println("Любая другая цифра - Выйти из приложения.");
    }
}