package RegistryOfPets.Progect;

public class Interface {

    private final Program program;


    public Interface(Program program) {
        this.program = program;
    }
    public void start(){
        program.startProg();
    }
    public void addNewAnimal(){
        program.addAnimal();
    }
    public void addNewCommand(){
        program.addCommand();
    }
    public void showCommands(){
        program.showCommands();
    }
}
