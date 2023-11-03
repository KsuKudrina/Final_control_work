package RegistryOfPets;

import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import RegistryOfPets.Progect.Counter;
import RegistryOfPets.Progect.Interface;
import RegistryOfPets.Progect.Program;

public class Main {
    public static void main(String[] args) {
        Interface usInterface = new Interface(new Program());
        boolean checker = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (checker) {
                System.out.println("1. Добавить животное");
                System.out.println("2. Добавить команду");
                System.out.println("3. Показать команды");
                System.out.println("0. Закрыть программу");
                System.out.print("Выберите действие: ");
                try(Counter counter = new Counter()) {
                    if (scanner.hasNextInt()) {
                        int sc = scanner.nextInt();
                        scanner.nextLine();
                        try {
                            switch (sc) {
                                case 0:
                                    System.out.println("Завершение работы приложения");
                                    checker = false;
                                    break;
                                case 1:
                                    usInterface.addNewAnimal();
                                    System.out.println("Успешно добавлено.");
                                    counter.add();
                                    
                                    break;
                                case 2:
                                    usInterface.addNewCommand();
                                    System.out.println("Команда добавлена.");
                                    break;
                                case 3:
                                    usInterface.showCommands();
                                    break;
                                default:
                                    System.out.println("Выберите правильный пункт.");
                            }
                        } catch (DateTimeParseException e) {
                            System.out.println("Ошибка ввода даты");
                            checker = false;
                        } catch (InputMismatchException e) {
                             System.out.println("Ошибка ввода");
                            checker = false;
                        } catch (NullPointerException e) {
                            System.out.println("Что-то пошло не так");
                            checker = false;
                        }
                    } else {
                        System.out.println("Выберите правильный пункт.");
                        scanner.nextLine();
                    }
                }catch (Exception e){
                    throw new RuntimeException("Ошибка");
                }
            }
        }
    }
}
