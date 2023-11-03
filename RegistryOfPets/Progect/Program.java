package RegistryOfPets.Progect;

import java.time.LocalDate;
import java.util.Scanner;

import RegistryOfPets.Animals.Animal;
import RegistryOfPets.Animals.PackAnimals.PackAnimal;
import RegistryOfPets.Animals.PackAnimals.PackBase;
import RegistryOfPets.Animals.PetAnimals.PetAnimal;
import RegistryOfPets.Animals.PetAnimals.PetsBase;

public class Program implements Controller {

    private Animal animal;
    private PetsBase petsBase = new PetsBase();
    private PackBase packsBase = new PackBase();

    static final Scanner scanner = new Scanner(System.in);
    
    @Override
    public void startProg() {
        System.out.println("Программа запущена");
        System.out.println("1. Добавить новое животное");
        System.out.println("2. Обучить команде");
        System.out.println("3. Показать все команды");
        System.out.println("0. Выход");
    }

    @Override
    public void addAnimal() {
        boolean flag = false;
        while(flag == false) {
            System.out.println("Кого добавляем?");
            System.out.println("1. Домашнее животное");
            System.out.println("2. Вьючное животное");
            System.out.println("Выберите действие: ");
            

            int animalType = scanner.nextInt();
            if (animalType == 1 || animalType == 2) {
                if (animalType == 1) {
                    String animalName = "";
                    System.out.println("Введите вид домашнего животного");
                    System.out.println("dog, cat, hamster");
                    
                    if (checkType(readData(), animalType) == false) {
                        flag = false;
                    } else {
                        System.out.println("Введите Имя домашнего животного");
                        String name = readData();
                        animalName = name;
                    }
                    LocalDate birthday = LocalDate.parse(readDate());
                    this.animal = new PetAnimal(animalName, birthday);
                    petsBase.add((PetAnimal) animal);
                    flag = true;
                }
                if (animalType == 2) {
                    String animalName = "";
                    System.out.println("Введите вид вьючного животного");
                    System.out.println("camel, donkey, horse");
                    
                    if (checkType(readData(), animalType) == false) {
                        flag = false;
                    } else {
                        System.out.println("Введите Имя вьючного животного");
                        String name = readData();
                        animalName = name;
                    }
                    LocalDate birthday = LocalDate.parse(readDate());
                    this.animal = new PackAnimal(animalName, birthday);
                    packsBase.add((PackAnimal) animal);
                    flag = true;
                }
            } else {
                flag = false;
            }
            flag=true;
            
        }
    }
    public String readDate(){
        System.out.println("Введите дату рождения в формате YYYY-MM-DD");
        String date = scanner.nextLine();
        LocalDate.parse(date);
        return date;
    }
    public String readData(){
        String result = "";
        String str = "";
        boolean flag = false;
        if (flag == false && str == "") {
            str = scanner.nextLine();
            result = str;
            flag = true;
        }
        return result;
    }

    @Override
    public boolean checkType(String string, int animalType) {
        String newString = string.toLowerCase();
        boolean flag = false;
        String[] petArray = {"dog", "cat", "hamster"};
        String[] packArray = {"camel","donkey","horse"};
        if(animalType == 1) {
            for (String s : petArray) {
                if (newString.equals(s)) {
                    System.out.println("Это домашнее животное");
                    flag = true;
                    break;
                }
            }flag = true;
        }
        if(animalType == 2) {
            for (String s : packArray) {
                if (newString.equals(s)) {
                    System.out.println("Это вьючное животное");
                    flag = true;
                    break;
                }
            }flag = true;
        }
        if (flag == false) {
            System.out.println("Ошибка ввода, неправильный тип.");
        }
        return flag;
    }


    public void showCommands() {
        System.out.println("Животное обучено командам: ");
        animal.getCommand();
    }

    public void addCommand() {
        String comandName = "";
        boolean flag = false;
        while (flag == false && comandName == "") {
            System.out.println("Введите название команды");
            String someCommand = scanner.nextLine();
            if (someCommand == ""||someCommand == null){
                flag = false;

            }else {
                comandName = someCommand;
                Command comand = new Command(comandName);
                animal.addCommand(comand);
                flag = true;
            }
        }
    }
}
