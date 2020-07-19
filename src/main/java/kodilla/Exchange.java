package kodilla;

public class Exchange {

    public UserAnimalList exchange() {
        UserAnimalList userAnimalList = new UserAnimalList();
        Animal animalForExchange = Animal.PIG;
        if (animalForExchange == Animal.PIG)
            userAnimalList.exchangePig();
        System.out.println("Dokonano wymiany 1 świnki na 2 owce");
        userAnimalList.getSize();
        return userAnimalList;

    }
}
