package RegistryOfPets.Animals.PackAnimals;

import java.time.LocalDate;
import java.util.ArrayList;

import RegistryOfPets.Animals.Animal;
import RegistryOfPets.Progect.Command;

public class PackAnimal extends Animal{

    private ArrayList<Command> command = new ArrayList<>();

    public PackAnimal(String name, LocalDate birthday) {
        super(name, birthday);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public LocalDate getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void getCommand() {
        if (command.size()==0){
            System.out.println("Животное не обучено командами");
        }else
        for (Command com :command) {
            System.out.println(com.getCommandName());
        }
    }

    public void addCommand (Command command){
        this.command.add(command);
    }

}
