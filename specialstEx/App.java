package specialstEx;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import specialstEx.homePets.Dog;

public class App {
    public static void main(String[] args) {
        boolean run = true;
        System.out.println("Приветсвтую в реестре домашних животных");
        try (BufferedReader reader = new BufferedReader(new FileReader("base.txt"))) {
            System.out.println("Сейчас у вас есть:\n");
            String line = reader.readLine();
            String[] words;
            while (line != null) {
                words = line.split(",");
                System.out.println("Имя" + words[0] + "Тип" + words[1] + "Класс" + words[2] + "Возраст" + words[3]
                        + "Команды" + words[4]);
                line = reader.readLine();
            }

        } catch (Exception e) {
            try (FileWriter writer = new FileWriter("base.txt", false)) {
                writer.write("");
            } catch (Exception error) {
                System.out.println(error);
            }
            while (run) {
                System.out.println("Что делаем дальше?");
                System.out.println("1 - Добавить животное");
                System.out.println("2 - выбрать животное");
                System.out.println("3 - сохранить базу");
                System.out.println("4 - завершить работу");
                try (Scanner inputScanner = new Scanner(System.in)) {
                    switch (inputScanner.nextInt()) {
                        case 1:
                            System.out.println("Введите имя");
                            String newName = inputScanner.nextLine();
                            System.out.println("Выберите тип: 1-рабочее животное\n2-домашнее животное");
                            Integer newType = inputScanner.nextInt();
                            System.out.println(
                                    "Выберите класс: 1-собака\n 2-кошка\n 3-хомячок\n 4-лошадь\n 5-верблюд\n 6-осел\n");
                            Integer newClass = inputScanner.nextInt();
                            System.out.println("Введите дату рождения в формате дд.мм.гггг");
                            SimpleDateFormat newBithDate = new SimpleDateFormat(inputScanner.nextLine());
                            System.out
                                    .println("Введите команды, которыми владеет животное через запятую");
                            String[] newCommand = inputScanner.nextLine().split(",");
                            switch (newClass) {
                                case 1:

                            }
                            break;

                        default:
                            break;
                    }
                }
            }
        }
    }
}
