import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static int throwDiceTest(String[] players, int iteration) {

        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int diceSum=dice1+dice2;
        System.out.println(players[iteration]+" throw Dice "+dice1+" and "+dice2);

        while (dice1 == dice2){
            System.out.println(players[iteration] + " throw PAIR");
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            diceSum=dice1+dice2;
            throwDiceTest(players,iteration);
        }
        return diceSum;
    }

    public static int throwDice1(){
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        return dice1;
    }
    public static int throwDice2(){
        Random rand = new Random();
        int dice2 = rand.nextInt(6) + 1;
        return dice2;
    }
}
