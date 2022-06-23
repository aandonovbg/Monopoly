import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static void startGame(String[][] fields, String[][] communityChest, String[][] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition, boolean[] playersInJail, int[] playersJailTimeCounter) {
        for (int i = 0; i < playersName.length; i++) {
            int dice1 = Dice.throwDice();
            int dice2 = Dice.throwDice();
            System.out.println(playersName[i] + " threw Dice " + dice1 + " and " + dice2);
            System.out.println(playersName[i] + "'s position is " + (playersPosition[i] + dice1 + dice2));

            if (dice1 == dice2) {
                System.out.println(playersName[i] + " threw PAIR!!!");
            }

            MethodsPlayer.setPlayerPosition(playersPosition, i, dice1 + dice2);//player's NEW position is applied to arr index
            isFieldSpecial(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersInJail, playersJailTimeCounter, i);
            isFieldFree(fields, playersName, playersMoney, playersPosition, playersInJail, playersJailTimeCounter, i, dice1 + dice2);

            Dice.checkForPair(playersName, i, dice1, dice2);

            if (playersMoney[i] == 0) {
                deletePlayer(playersName, playersMoney, playersPosition, playersInJail, playersJailTimeCounter, i);
            }
        }
        startGame(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersInJail, playersJailTimeCounter);
    }

    public static void deletePlayer(String[] playersName, int[] playersMoney, int[] playersPosition, boolean[] playersInJail, int[] PlayersJailTimeCounter, int iteration) {
        System.out.println(playersName[iteration] + " you have NO more money.\nYou are broke!");
        System.out.println("END OF GAME FOR YOU!!!");

        String[] playersNameTemp = new String[playersName.length - 1];
        System.arraycopy(playersName, 0, playersNameTemp, 0, iteration);
        System.arraycopy(playersName, iteration + 1, playersNameTemp, iteration, playersName.length);
        playersName = playersNameTemp;

        int[] playerMoneyTemp = new int[playersMoney.length - 1];
        System.arraycopy(playersMoney, 0, playerMoneyTemp, 0, iteration);
        System.arraycopy(playersMoney, iteration + 1, playerMoneyTemp, iteration, playersMoney.length);
        playersMoney = playerMoneyTemp;

        int[] playerPositionTemp = new int[playersPosition.length - 1];
        System.arraycopy(playersPosition, 0, playerPositionTemp, 0, iteration);
        System.arraycopy(playersPosition, iteration + 1, playerPositionTemp, iteration, playersPosition.length);
        playersPosition = playerPositionTemp;

        boolean[] playersInJailTemp = new boolean[playersInJail.length - 1];
        System.arraycopy(playersInJail, 0, playersInJailTemp, 0, iteration);
        System.arraycopy(playersInJail, iteration + 1, playersInJailTemp, iteration, playersInJail.length);
        playersInJail = playersInJailTemp;

        int[] PlayersJailTimeCounterTemp = new int[PlayersJailTimeCounter.length - 1];
        System.arraycopy(PlayersJailTimeCounter, 0, PlayersJailTimeCounterTemp, 0, iteration);
        System.arraycopy(PlayersJailTimeCounter, iteration + 1, PlayersJailTimeCounterTemp, iteration, PlayersJailTimeCounter.length);
        PlayersJailTimeCounter = PlayersJailTimeCounterTemp;
    }

    public static void isFieldSpecial(String[][] fields, String[][] communityChest, String[][] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition, boolean[] playersInJail, int[] playersJailTimeCounter, int iteration) {
        if (fields[1][playersPosition[iteration]].equals("Community Chest") ||
                fields[1][playersPosition[iteration]].equals("Income Tax") ||
                fields[1][playersPosition[iteration]].equals("Go To Jail") ||
                fields[1][playersPosition[iteration]].equals("Luxury Tax") ||
                fields[1][playersPosition[iteration]].equals("Chance") ||
                fields[1][playersPosition[iteration]].equals("Free Parking")) {
            switch (fields[1][playersPosition[iteration]]) {
                case "Chance" -> {
                    Random rand = new Random();
                    int chance = rand.nextInt(12);
                    switch (chance) {
                        case 0 -> {
                            System.out.println(chanceCards[0][chance]);
                            playersPosition[iteration] = 39;
                            isFieldFree(fields, playersName, playersMoney, playersPosition, playersInJail, playersJailTimeCounter, iteration, 39);
                        }
                        case 1->{
                            System.out.println(chanceCards[0][chance]);
                            playersPosition[iteration] = 0;
                            playersMoney[iteration]+=200;
                        }
                        case 2->{

                        }
                    }

                }
                case "Community Chest" -> {
                    Random rand = new Random();
                    int index = rand.nextInt(13);
                    if (index == 7) {     //check if index is equal to [0][7]
                        System.out.println(communityChest[0][index]);
                        for (int i = 0; i < playersMoney.length; i++) {
                            playersMoney[i] -= 10;      //deduct 10$ of every player
                        }
                        playersMoney[iteration] += playersMoney.length * 10; //add 10$ from every player to current player
                    } else {
                        System.out.println(communityChest[0][index]);
                        playersMoney[iteration] += Integer.parseInt(communityChest[1][index]);
                    }
                }
                case "Income Tax" -> {
                    System.out.println("Pay 200$ Income TAX :)");
                    playersMoney[iteration] -= 200;
                }
                case "Go To Jail" -> {
                    System.out.println("Go straight to Jail");
                    playersPosition[iteration] = 10;
                }
                case "Luxury Tax" -> {
                    System.out.println("Pay 100$ Luxury TAX :)");
                    playersMoney[iteration] -= 100;
                }
            }
        }

    }

    public static void isFieldFree(String[][] fields, String[] playersName, int[] playersMoney, int[] playersPosition, boolean[] playersInJail, int[] playersJailTimeCounter, int iteration, int diceSum) {
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
                    isFieldFree(fields, playersName, playersMoney, playersPosition, playersInJail, playersJailTimeCounter, iteration, diceSum);
                    break;
            }
            //if the field have Owner
        } else if (!fields[1][playersPosition[iteration]].equals("")) {
            //Player pays rent to the Owner of the field
            //if Player has enough money
            if (playersMoney[iteration] > Integer.parseInt(fields[3][playersPosition[iteration]])) {
                System.out.println(playersName[iteration] + " paid " + Integer.parseInt(fields[3][playersPosition[iteration]]) + " to " + fields[1][playersPosition[iteration]]);
                playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]);

                //adding rent money to the field Owner budget
                for (int i = 0; i < playersName.length; i++) {
                    if (playersName[i].equalsIgnoreCase(fields[1][playersPosition[iteration]])) {
                        playersMoney[i] += Integer.parseInt(fields[3][playersPosition[iteration]]);
                    }
                }
            }
            //if Player does NOT have enough money
            else if (playersMoney[iteration] < Integer.parseInt(fields[3][playersPosition[iteration]])) {
                deletePlayer(playersName, playersMoney, playersPosition, playersInJail, playersJailTimeCounter, iteration);
            }
        }
    }

    public static void payMoney(String[][] fields, int[] playersMoney, int[] playersPosition, int iteration) {
        playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]);
    }


}
