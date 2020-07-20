package kodilla;

public class Exchange {

    public UserAnimalList exchange(Greeding greading) {
        UserAnimalList userAnimalList = new UserAnimalList();
        //Wprowadzenie zwierzątka do wymany na razie "ręczne"
        Animal animalForExchange = Animal.PIG;
        if (animalForExchange == Animal.PIG)
            userAnimalList.exchangePig();
        System.out.println("Dokonano wymiany 1 świnki na 2 owce");
        userAnimalList.getSize();
        return userAnimalList;

    }
}
