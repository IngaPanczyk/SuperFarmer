package kodilla;

public class Game {
    public UserAnimalList greeding() {
        Dice dice = new Dice();
        Animal orange = dice.orangeDice();
        Animal blue = dice.blueDice();

        if (orange == blue) {
            UserAnimalList userAnimalList = new UserAnimalList();
            userAnimalList.addAnimalOrange(orange);
            System.out.println("Ilość zwierzątek w kolekcji " + userAnimalList.getSize());
            return userAnimalList;
        }else{
            return null;
        }
    }

}
