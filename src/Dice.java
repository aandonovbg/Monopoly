import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static int throwDice() {

        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static void promptEnterKey() {
        System.out.println();
        System.out.println("Row Dices(Press Enter)");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void checkForPair(String[][] fields, String[][] communityChest, String[] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition,  int[] playersJailTimeCounter,String[]fieldsInitialPrices, int iteration, int dice1, int dice2) {

        if (dice1 == dice2) {
            System.out.println(playersName[iteration] + " threw a PAIR and he must throw again");
            promptEnterKey();
            dice1 = Dice.throwDice();
            dice2 = Dice.throwDice();

            System.out.println(playersName[iteration] + " threw Dice " + dice1 + " and " + dice2);
            if (playersJailTimeCounter[iteration] == 0) {
                MethodsPlayer.setPlayerPosition(playersPosition, playersMoney, iteration, dice1 + dice2);//player's NEW position is applied to arr index
                System.out.println(playersName[iteration] + "'s position is " + playersPosition[iteration] + " -\"" + fields[0][playersPosition[iteration]] + "\"");

                PlayGame.isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter,fieldsInitialPrices, iteration);
                if (dice1 == dice2) {
                    checkForPair(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter,fieldsInitialPrices, iteration, dice1, dice2);
                }
            } else {

                if (dice1 == dice2) {
                    playersJailTimeCounter[iteration] = 0;
                    System.out.println(playersName[iteration] + " threw PAIR!!!");
                    System.out.println(playersName[iteration] + " is out of JAIL!!!");

                    MethodsPlayer.setPlayerPosition(playersPosition, playersMoney, iteration, dice1 + dice2);
                    System.out.println(playersName[iteration] + "'s position is " + playersPosition[iteration] + " -\"" + fields[0][playersPosition[iteration]] + "\"");
                    PlayGame.isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter,fieldsInitialPrices, iteration);

                    if (playersMoney[iteration] == 0) {
                        PlayGame.deletePlayer(fields,playersName, playersMoney, playersPosition,fieldsInitialPrices, iteration);
                    }
                } else {
                    System.out.println(playersName[iteration] + " has " + playersJailTimeCounter[iteration] + " turn left in Jail ");
                }
            }
        }
    }
}

