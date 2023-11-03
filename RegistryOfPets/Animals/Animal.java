package RegistryOfPets.Animals;

import java.time.LocalDate;
import RegistryOfPets.Progect.Command;

public abstract class Animal {
   
    protected String name;
    protected LocalDate birthday;
    protected String animalType;

    public Animal(String name, LocalDate birthday) {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    
    // public String getBirthday() {
    //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    //     return formatter.format(birthday);
    // }

    public abstract void getCommand();

    public  abstract void addCommand(Command command);
    
    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, дата рождения: %s ", getClass().getSimpleName(), name, getBirthday());
    }
}
