package kodilla;

public class Greeding extends  Exchange{
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
        //Testowe uzupełnienie listy
        userAnimalList.fullfilList();
        userAnimalList.getSize();
        double quantityOfPairOfPig = userAnimalList.checkQuantityPig();
        System.out.println("Ilość par zwierzątek " + quantityOfPairOfPig);
        //Remis
        if (orange == blue) {
            userAnimalList.addAnimalOrange(orange);
            System.out.println("Wyrzucono parę zwierzątek");
        }
        //Dodanie zwierzątka do kolekcji
        if (orange == Animal.PIG || blue == Animal.PIG) {
            int n = 1;
            while ((quantityOfPairOfPig + 1.0) > n) {
                n++;
                userAnimalList.addAnimalOrange(Animal.PIG);
            }
        }
        userAnimalList.getSize();
        return userAnimalList;
    }

}

