package kodilla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserAnimalList {
    public List startGame(){
        List<Animal> animalList = new ArrayList<>();
        return animalList;
    }


    //Dodanie zwierzątka do kolekcji użytkowinka - z kostki pomarańczowej
    public void addAnimalOrange(Animal orange, List animalList) {
        animalList.add(orange);
    }

    //Dodanie zwierzątka do kolekcji użytkowinka - z kostki niebieskiej
    public void addAnimalBlue(Animal blue, List animalList) {
        animalList.add(blue);
    }
    //Wyświetlenie ilości zwierzątek w kolekjcji


    //Sprawdzenie czy zwierzątko z kostki jest w kolekcji i w jakiej ilości
    public int checkQuantityPig(List animalList) {
        int occurrences = Collections.frequency(animalList, Animal.PIG);
        return occurrences;
    }

    public int checkQuantitySheep(List animalList) {
        int occurrences = Collections.frequency(animalList, Animal.SHEEP);
        return occurrences;
    }

    public int checkQuantityRabbit(List animalList) {
        int occurrences = Collections.frequency(animalList, Animal.RABBIT);
        return occurrences;
    }

    protected int checkQuantityHorse(List animalList) {
        int occurrences = Collections.frequency(animalList, Animal.HORSE);
        return occurrences;
    }

    public int checkQuantityCow(List animalList) {
        int occurrences = Collections.frequency(animalList, Animal.COW);
        return occurrences;
    }

    public void getSize(List animalList) {
        int size = animalList.size();
        System.out.println("Ilość zwierzątek w kolekcji " + size);
    }

    public void fullfilList(List animalList) {
        animalList.add(Animal.PIG);
        animalList.add(Animal.PIG);
        animalList.add(Animal.PIG);
        animalList.add(Animal.PIG);
        animalList.add(Animal.PIG);
        animalList.add(Animal.SHEEP);
        animalList.add(Animal.SHEEP);
        animalList.add(Animal.SHEEP);
        animalList.add(Animal.SHEEP);
        animalList.add(Animal.SHEEP);
        animalList.add(Animal.RABBIT);
        animalList.add(Animal.RABBIT);
        animalList.add(Animal.RABBIT);
        animalList.add(Animal.RABBIT);
        animalList.add(Animal.RABBIT);
    }

    public void exchangePig(List animalList) {
        System.out.println("Ilość zwierzątke przed wymianą:" + animalList.size());
        animalList.remove(Animal.PIG);
        animalList.remove(Animal.PIG);
        animalList.remove(Animal.PIG);
        animalList.add(Animal.COW);
        System.out.println("Ilość zwierzątke po wymianie:" + animalList.size());
    }

    public void exchangeRabbit(List animalList) {
        System.out.println("Ilość zwierzątke przed wymianą:" + animalList.size());
        for (int n = 0; n <= 6; n++) {
            animalList.remove(Animal.RABBIT);
        }
        animalList.add(Animal.SHEEP);
        System.out.println("Ilość zwierzątke po wymianie:" + animalList.size());
    }
    public void exchangeSheep(List animalList) {
        System.out.println("Ilość zwierzątke przed wymianą:" + animalList.size());
        for (int n = 0; n <= 2; n++) {
            animalList.remove(Animal.SHEEP);
        }
        animalList.add(Animal.PIG);
        System.out.println("Ilość zwierzątke po wymianie:" + animalList.size());
    }
    public void exchangeCow(List animalList) {
        System.out.println("Ilość zwierzątke przed wymianą:" + animalList.size());
        for (int n = 0; n <= 2; n++) {
            animalList.remove(Animal.COW);
        }
        animalList.add(Animal.HORSE);
        System.out.println("Ilość zwierzątke po wymianie:" + animalList.size());
    }
}
