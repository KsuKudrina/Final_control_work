package RegistryOfPets.Animals.PackAnimals;

import java.util.ArrayList;
import java.util.Collection;

import RegistryOfPets.Animals.DataBase;

public class PackBase implements DataBase<PackAnimal>{
    
    private ArrayList<PackAnimal> packCollection = new ArrayList<>();

    @Override
    public void add(PackAnimal item) {
        packCollection.add(item);
    }

    @Override
    public Collection<PackAnimal> getAll() {
        return packCollection;
    }
}
