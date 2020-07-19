package kodilla;


import java.util.concurrent.Exchanger;

public class SuperFarmer {


    public static void main(String[] args) {
        //Kostka
        Dice dice = new Dice();
        dice.orangeDice();
        dice.blueDice();
        System.out.println("Kostka pomarańczowa: " + dice.blueDice());
        System.out.println("Kostka niebieska: "+  dice.orangeDice());
        //Rozmnażanie
        Greeding greeding = new Greeding();
        greeding.greeding();
        //Wymiana
        greeding.exchange();
    }


}
