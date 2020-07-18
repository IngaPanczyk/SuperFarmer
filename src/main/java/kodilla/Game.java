package kodilla;

public class Game {
    Animal orange;
    Animal blue;


    public Animal getOrange() {
        return orange;
    }

    public Animal getBlue() {
        return blue;
    }


    public UserAnimalList greeding() {
        //Rzucenie kostką
        Dice dice = new Dice();
        orange = dice.orangeDice();
        blue = dice.blueDice();

        //Wywołanie listy zwierztek
        UserAnimalList userAnimalList = new UserAnimalList();
        userAnimalList.fullfilList();
        userAnimalList.getSize();
        int quantityOfPig = userAnimalList.checkQuantityPig();
        System.out.println(quantityOfPig);

        //Dodanie zwierzątek do kolekcji
        if (orange == blue) {
            userAnimalList.addAnimalOrange(orange);
            return userAnimalList;

        } if (quantityOfPig > 0 ) {
            if (orange == Animal.PIG) {
                int z = 0;
                while (z < quantityOfPig) {
                    z++;
                    userAnimalList.addAnimalOrange(orange);
                    userAnimalList.getSize();
                }

            } else if (blue == Animal.PIG) {
                int z = 0;
                while (z < quantityOfPig) {
                    z++;
                    userAnimalList.addAnimalOrange(orange);

                }
                return userAnimalList;
            }
        }
        userAnimalList.getSize();
        return userAnimalList;
    }
}
