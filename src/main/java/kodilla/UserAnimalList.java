package kodilla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserAnimalList {
    List<Animal> animalList = new ArrayList<>();

    //Dodanie zwierzątka do kolekcji użytkowinka - z kostki pomarańczowej
    public void addAnimalOrange(Animal orange) {
        animalList.add(orange);
    }
    //Dodanie zwierzątka do kolekcji użytkowinka - z kostki niebieskiej
    public void addAnimalBlue(Animal blue) {
        animalList.add(blue);
    }

    //Sprawdzenie czy zwierzątko z kostki jest w kolekcji i w jakiej ilości
    public int checkQuantityPig() {
        int occurrences = Collections.frequency(animalList, Animal.PIG);
        return occurrences;
    }

    public int checkQuantitySheep() {
        int occurrences = Collections.frequency(animalList, Animal.SHEEP);
        return occurrences;
    }

    public int checkQuantityRabbit() {
        int occurrences = Collections.frequency(animalList, Animal.RABBIT);
        return occurrences;
    }

    public int getSize() {
        int size = animalList.size();
        return size;
    }
}
