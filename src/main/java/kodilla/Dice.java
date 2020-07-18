package kodilla;

import java.util.Random;

public class Dice {

    public static Animal orangeDice() {
        Random randomBlue = new Random();
        int n = randomBlue.nextInt(12);
        if (n == 1) {
            return Animal.HORSE;
        } else if (n == 2) {
            return Animal.WOLF;
        } else if (n >= 3 && n <= 7) {
            return Animal.RABBIT;
        } else if (n >= 8 && n <= 10) {
            return Animal.SHEEP;
        } else {
            return Animal.PIG;
        }
    }

    public static Animal blueDice() {
        Random randomOrange = new Random();
        int z = randomOrange.nextInt(12);
        if (z == 1) {
            return Animal.COW;
        } else if (z == 2) {
            return Animal.FOX;
        } else if (z >= 3 && z <= 7) {
            return Animal.RABBIT;
        } else if (z >= 8 && z <= 10) {
            return Animal.SHEEP;
        } else {
            return Animal.PIG;
        }
    }
}