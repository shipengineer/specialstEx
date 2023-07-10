package specialstEx;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import specialstEx.helpers.Animal;
import specialstEx.helpers.Counter;
import specialstEx.homePets.Cat;
import specialstEx.homePets.Dog;
import specialstEx.homePets.Hamster;
import specialstEx.workPets.Camell;
import specialstEx.workPets.Donkey;
import specialstEx.workPets.Horse;

public class App {
    public static void main(String[] args) {
        List<Animal> rancho = new ArrayList<Animal>();
        boolean run = true;
        System.out.println("Приветсвтую в реестре домашних животных");
        Counter counter = new Counter();
        String[] words;
        String outLine = "";
        List<String> inputCommandList = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader("base.txt"))) {
            System.out.println("Сейчас у вас есть:\n");
            String line = reader.readLine();
            counter.setValue(Integer.parseInt(line));
            line = reader.readLine();
            while (line != null) {
                words = line.split(",");
                for (int i = 4; i < words.length; i++) {
                    inputCommandList.add(words[i]);

                }
                outLine = outLine
                        + "Имя" + words[0] + "Тип" + words[1] + "Класс" + words[2] + "Дата рождения" + words[3]
                        + "Команды" + inputCommandList + "\n";
                switch (Integer.parseInt(words[2])) {
                    case 1:
                        rancho.add(counter.getCount(),
                                new Dog(words[0], new SimpleDateFormat(words[3]), inputCommandList));
                        break;
                    case 2:
                        rancho.add(counter.getCount(),
                                new Cat(words[0], new SimpleDateFormat(words[3]), inputCommandList));
                        break;
                    case 3:
                        rancho.add(counter.getCount(),
                                new Hamster(words[0], new SimpleDateFormat(words[3]), inputCommandList));
                        break;
                    case 4:
                        rancho.add(counter.getCount(),
                                new Horse(words[0], new SimpleDateFormat(words[3]), inputCommandList));
                        break;
                    case 5:
                        rancho.add(counter.getCount(),
                                new Camell(words[0], new SimpleDateFormat(words[3]), inputCommandList));
                        break;
                    case 6:
                        rancho.add(counter.getCount(),
                                new Donkey(words[0], new SimpleDateFormat(words[3]), inputCommandList));
                        break;
                    default:
                        System.out.println("Животного с таким номером нет в каталоге");
                        break;
                }
                ;
                line = reader.readLine();
                inputCommandList.clear();
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
                System.out.println("2 - Выбрать животное");
                System.out.println("3 - Сохранить базу");
                System.out.println("4 - Завершить работу");
                try (Scanner inputScanner = new Scanner(System.in)) {
                    switch (inputScanner.nextInt()) {
                        case 1:
                            counter.add();
                            System.out.println("Введите имя");
                            String newName = inputScanner.nextLine();
                            System.out.println(
                                    "Выберите класс: 1-собака\n 2-кошка\n 3-хомячок\n 4-лошадь\n 5-верблюд\n 6-осел\n");
                            Integer newClass = inputScanner.nextInt();
                            System.out.println("Введите дату рождения в формате дд.мм.гггг");
                            SimpleDateFormat newBithDate = new SimpleDateFormat(inputScanner.nextLine());
                            System.out
                                    .println("Введите команды, которыми владеет животное через запятую");
                            String[] commandsToInput = inputScanner.nextLine().split(",");
                            List<String> newCommands = new ArrayList<String>();
                            for (String element : commandsToInput) {
                                newCommands.add(element);
                            }
                            switch (newClass) {
                                case 1:
                                    rancho.add(counter.getCount(), new Dog(newName, newBithDate, newCommands));
                                    break;
                                case 2:
                                    rancho.add(counter.getCount(), new Cat(newName, newBithDate, newCommands));
                                    break;
                                case 3:
                                    rancho.add(counter.getCount(), new Hamster(newName, newBithDate, newCommands));
                                    break;
                                case 4:
                                    rancho.add(counter.getCount(), new Horse(newName, newBithDate, newCommands));
                                    break;
                                case 5:
                                    rancho.add(counter.getCount(), new Camell(newName, newBithDate, newCommands));
                                    break;
                                case 6:
                                    rancho.add(counter.getCount(), new Donkey(newName, newBithDate, newCommands));
                                    break;
                                default:
                                    System.out.println("Животного с таким номером нет в каталоге");
                                    break;
                            }
                            break;
                        case 2:

                            rancho.forEach((element) -> element.print());
                            System.out.println("Выберите животное по имени ");
                            String chosen = inputScanner.nextLine();
                            int chosenNumber = rancho.indexOf(chosen);
                            if (chosenNumber == -1) {
                                System.out.println("Такого животного нет");
                                break;
                            }
                            System.out.println("Что хотите изменить");
                            System.out.println("1 - сменить тип животного");
                            System.out.println("2 - обучить командам");
                            System.out.println("3 - посмотреть команды");

                            switch (inputScanner.nextInt()) {
                                case 1:
                                    rancho.get(chosenNumber).switchKind();
                                    break;

                                case 2:
                                    System.out.println("Укажите команду");
                                    rancho.get(chosenNumber).addCommand(inputScanner.nextLine());
                                    break;
                                case 3:
                                    rancho.get(chosenNumber).getCommands();
                                    break;

                                default:
                                    System.out.println("неправильная команда");
                                    break;
                            }
                            break;

                        case 3:
                            try (FileWriter writer = new FileWriter("base.txt", false)) {
                                String toWrite = "";
                                toWrite = toWrite + counter.getCount() + "\n";
                                for (int i = 0; i < rancho.size(); i++) {
                                    toWrite = toWrite + rancho.get(i).writeElement() + '\n';
                                }
                                writer.write(toWrite);
                            } catch (Exception error) {
                                System.out.println(error);
                            }
                            System.out.println("База сохранена");
                        case 4:
                            run = false;

                    }
                }
            }
        }
    }
}
