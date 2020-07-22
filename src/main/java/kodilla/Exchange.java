package kodilla;

public class Exchange {

    public void exchange(Greeding greeding, Animal animalForExchange) {
        //Greeding greeding = new Greeding();
        //UserAnimalList userAnimalList = new UserAnimalList();
        //Wprowadzenie zwierzątka do wymany na razie "ręczne"
        System.out.println("Dokonano wymiany 1 świnki na 2 owce");
        //Animal animalForExchange = Animal.PIG;
        if (animalForExchange == Animal.PIG)
            greeding.exchangePig();
        System.out.println("Dokonano wymiany 1 świnki na 2 owce");
        //userAnimalList.getSize();
        greeding.getSize();

    }
}
