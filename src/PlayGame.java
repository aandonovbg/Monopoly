import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static void startGame(String[][] fields, String[] playersName, int[] playersMoney, int[] playersPosition, boolean[] playersInJail, int[] PlayersJailTimeCounter) {
        for (int i = 0; i < playersName.length; i++) {
            int dice1 = Dice.throwDice();
            int dice2 = Dice.throwDice();
            System.out.println(playersName[i] + " threw Dice " + dice1 + " and " + dice2);
            System.out.println(playersName[i] + "'s position is " + (playersPosition[i] + dice1 + dice2));

            if (dice1 == dice2) {
                System.out.println(playersName[i] + " threw PAIR!!!");
            }

            MethodsPlayer.setPlayerPosition(playersPosition, i, dice1 + dice2);//player's NEW position is applied to arr index
            isFieldFree(fields, playersName, playersMoney, playersPosition, i, dice1 + dice2);

            Dice.checkForPair(playersName, i, dice1, dice2);

            if (playersMoney[i] == 0) {
                System.out.println(playersName[i] + " you have NO more money.\nYou are broke!");
                System.out.println("END OF GAME FOR YOU!!!");
            }
        }
        startGame(fields, playersName, playersMoney, playersPosition, playersInJail, PlayersJailTimeCounter);
    }

    public static void isFieldFree(String[][] fields, String[] playersName, int[] playersMoney, int[] playersPosition, int iteration, int diceSum) {
        Scanner sc = new Scanner(System.in);
        //if the field is free/empty
        if (fields[1][playersPosition[iteration]].equals("")) {
            System.out.println("Property \"" + fields[0][playersPosition[iteration]] + "\" is free.");
            System.out.println("Would you like to buy it?");
            System.out.print("Yes/No-> ");
            String q = sc.next().toLowerCase();
            switch (q) {
                case "yes":
                    if (playersMoney[iteration] > Integer.parseInt(fields[3][(playersPosition[iteration] + diceSum)])) {
                        MethodsPlayer.setPlayerMoney(playersMoney, iteration, playersMoney[iteration] - Integer.parseInt(fields[3][(playersPosition[iteration] + diceSum)]));
                        MethodsField.setFieldOwner(fields, iteration, playersName[iteration]);
                        System.out.println(playersName[iteration] + " successfully bought property \"" + fields[0][playersPosition[iteration]] + "\"!");
                    } else if (MethodsPlayer.getPlayerMoney(playersMoney, iteration) < Integer.parseInt(fields[3][(playersPosition[iteration] + diceSum)])) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    }
                    break;
                case "no":
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    isFieldFree(fields, playersName, playersMoney, playersPosition, iteration, diceSum);
                    break;
            }
            //if the field have Owner
        } else if (!fields[1][diceSum].equalsIgnoreCase("")) {
            //player pays rent to the Owner of the field
            if (playersMoney[iteration] > Integer.parseInt(fields[3][playersPosition[iteration]]))
                System.out.println(playersName[iteration] + " paid " + Integer.valueOf(fields[3][playersPosition[iteration]]) + " to " + fields[1][playersPosition[iteration]]);
            playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]);

            //adding rent money to the field Owner budget
            for (int i = 0; i < playersName.length; i++) {
                if (playersName[i].equalsIgnoreCase(fields[1][playersPosition[iteration]])) {
                    playersName[i] += Integer.valueOf(fields[3][playersPosition[iteration]]);
                }
            }
        }
    }

    public static void payMoney(String[][] fields, int[] playersMoney, int[] playersPosition, int iteration) {
        playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]);
    }


}
