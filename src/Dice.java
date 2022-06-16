import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static int throwDice() {
        System.out.println("");
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        return dice;
    }

    public static void checkForPair(String[] players, int iteration, int dice1, int dice2) {
        int diceSum = dice1 + dice2;
        System.out.println(players[iteration]+" throw Dice "+dice1+" and "+dice2);
        while (dice1 == dice2) {
            System.out.println(players[iteration] + " threw a PAIR and he must throw again");
            dice1 = Dice.throwDice();
            dice2 = Dice.throwDice();
            System.out.println(players[iteration] + " threw Dice "+dice1+" and "+dice2);
            //diceSum = dice1 + dice2;
            checkForPair(players, iteration, dice1, dice2);
        }

    }
}

