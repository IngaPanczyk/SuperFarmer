package kodilla;

public class Greeding extends UserAnimalList {
    Animal orange;
    Animal blue;


    public Animal getOrange() {
        return orange;
    }

    public Animal getBlue() {
        return blue;
    }


    public UserAnimalList greeding(Animal orange, Animal blue, UserAnimalList userAnimalList) {

        //Wywołanie listy zwierztek
        //UserAnimalList userAnimalList = new UserAnimalList();
        //Testowe uzupełnienie listy
        userAnimalList.fullfilList();
        userAnimalList.getSize();

        int qantityOfPig = userAnimalList.checkQuantityPig();
        int qantityOfRabbit = userAnimalList.checkQuantityRabbit();
        int qantityOfSheep = userAnimalList.checkQuantitySheep();
        int qantityOfHorse = userAnimalList.checkQuantityHorse();
        int gantityOfCow = userAnimalList.checkQuantityCow();
        System.out.println(Animal.PIG + ":" + qantityOfPig);
        System.out.println(Animal.RABBIT + ":" + qantityOfPig);
        System.out.println(Animal.SHEEP + ":" + qantityOfPig);
        System.out.println(Animal.HORSE + ":" + qantityOfPig);
        System.out.println(Animal.COW + ":" + qantityOfPig);

        if (orange == blue) {
            userAnimalList.addAnimalOrange(orange);
            System.out.println("+++" + orange);
        }
        //Dodanie zwierzątka do kolekcji
        if (orange == Animal.PIG) {
            for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                userAnimalList.addAnimalOrange(Animal.PIG);
                System.out.println("+++" + orange);
                userAnimalList.getSize();
            }
        } else if (blue == Animal.PIG) {
            for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                userAnimalList.addAnimalBlue(Animal.PIG);
                System.out.println("+++" + blue);
                userAnimalList.getSize();
            }
        }
        if (orange == Animal.RABBIT) {
            for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                userAnimalList.addAnimalOrange(Animal.RABBIT);
                System.out.println("+++" + orange);
                userAnimalList.getSize();
            }
        } else if (blue == Animal.RABBIT) {
            for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                userAnimalList.addAnimalBlue(Animal.RABBIT);
                System.out.println("+++" + blue);
                userAnimalList.getSize();
            }
        }
        if (orange == Animal.SHEEP) {
            for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                userAnimalList.addAnimalOrange(Animal.SHEEP);
                System.out.println("+++" + orange);
                userAnimalList.getSize();
            }
        } else if (blue == Animal.SHEEP) {
            for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                userAnimalList.addAnimalBlue(Animal.SHEEP);
                System.out.println("+++" + blue);
                userAnimalList.getSize();
            }
        }
        if (orange == Animal.COW) {
            for (int n = 0; n < (gantityOfCow + 1) / 2; n++) {
                userAnimalList.addAnimalOrange(Animal.COW);
                System.out.println("+++" + orange);
                userAnimalList.getSize();
            }
        } else if (blue == Animal.COW) {
            for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                userAnimalList.addAnimalBlue(Animal.COW);
                System.out.println("+++" + blue);
                userAnimalList.getSize();
            }
        }
        if (orange == Animal.HORSE) {
            for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                userAnimalList.addAnimalOrange(Animal.HORSE);
                System.out.println("+++" + orange);
                userAnimalList.getSize();
            }
        } else if (blue == Animal.HORSE) {
            for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                userAnimalList.addAnimalBlue(Animal.HORSE);
                System.out.println("+++" + blue);
                userAnimalList.getSize();
            }
        }
        return userAnimalList;
    }
}

