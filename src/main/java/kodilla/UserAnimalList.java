package kodilla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserAnimalList extends Exchange{
    List<Animal> animalList = new ArrayList<>();

    //Dodanie zwierzątka do kolekcji użytkowinka - z kostki pomarańczowej
    public void addAnimalOrange(Animal orange) {
        animalList.add(orange);
    }
    //Dodanie zwierzątka do kolekcji użytkowinka - z kostki niebieskiej
    public void addAnimalBlue(Animal blue) {
        animalList.add(blue);
    }
    //Wyświetlenie ilości zwierzątek w kolekjcji


    //Sprawdzenie czy zwierzątko z kostki jest w kolekcji i w jakiej ilości
    public double checkQuantityPig() {
        double occurrences = Collections.frequency(animalList, Animal.PIG);
        double quantityOfpairOfPig = occurrences/2;
        return  quantityOfpairOfPig;
    }

    public int checkQuantitySheep() {
        int occurrences = Collections.frequency(animalList, Animal.SHEEP);
        return occurrences;
    }

    public int checkQuantityRabbit() {
        int occurrences = Collections.frequency(animalList, Animal.RABBIT);
        return occurrences;
    }

    public void getSize() {
        int size = animalList.size();
        System.out.println("Ilość zwierzątek w kolekcji " + size);
    }

    public void fullfilList() {
        animalList.add(Animal.PIG);
        animalList.add(Animal.PIG);
        animalList.add(Animal.PIG);
        animalList.add(Animal.PIG);

    }

    public void exchangePig() {
        animalList.remove(Animal.PIG);
        animalList.add(Animal.SHEEP);
        animalList.add(Animal.SHEEP);
        System.out.println(animalList.size());
    }
}
