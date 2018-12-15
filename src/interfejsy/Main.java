package interfejsy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Kot();
        pet.dajGłos();
        pet.idz(5);
        pet.jedz();

        Pet pet2 = new Dog();
        pet2.dajGłos();
        pet2.idz(5);
        pet2.jedz();

        List<Pet> lista = new ArrayList();
        lista.add(new Kot());
        lista.add(new Dog());

        List<PetClass> list2 = new ArrayList<>();
        list2.add(new Snake());

        //Pet p = new Pet();
    }
}
