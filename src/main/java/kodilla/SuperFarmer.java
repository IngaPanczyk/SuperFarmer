package kodilla;


public class SuperFarmer {


    public static void main(String[] args) {
        //Test Kostka
        Dice dice = new Dice();
        dice.orangeDice();
        dice.blueDice();
        System.out.println(dice.blueDice());
        System.out.println(dice.orangeDice());
        //Test Gra
        Game game = new Game();
        game.greeding();
        System.out.println(game.getBlue());
    }


}
