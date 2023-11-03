package RegistryOfPets.Animals.PetAnimals;

import java.util.ArrayList;
import java.util.Collection;

import RegistryOfPets.Animals.DataBase;

public class PetsBase implements DataBase<PetAnimal> {

    private ArrayList<PetAnimal> petsCollection = new ArrayList<>();

    @Override
    public void add(PetAnimal item) {
        petsCollection.add(item);
    }

    @Override
    public Collection<PetAnimal> getAll() {
        return petsCollection;
    }

}
