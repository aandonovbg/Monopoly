import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static void startGame(String[][] fields, String[][] communityChest, String[] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition, int[] playersJailTimeCounter, String[] fieldsInitialPrices, boolean[] isPlayerActive) {

        for (int i = 0; i < playersName.length; i++) {
            if (!isPlayerActive[i]) {
                continue;
            } else {
                int pairCount = 0;
                //count the Players
                int sumOfActivePlayers = 0;
                for (int j = 0; j < isPlayerActive.length; j++) {
                    if (isPlayerActive[j]) {
                        sumOfActivePlayers++;
                    }
                }
                // checking if current Player is not the only one left active
                if (sumOfActivePlayers == 1) {
                    return;
                } else {
                    //checks if Player can build houses
                    Houses.checkIfNeighborHoodIsEnabled(Houses.createdNeighborhoods(fields, playersName, i), fields, playersName, playersMoney, i);
                    //checks for JailTime
                    if (playersJailTimeCounter[i] > 0 || pairCount == 3) {
                        Dice.promptEnterKey();
                        int dice1 = Dice.throwDice();
                        int dice2 = Dice.throwDice();
                        System.out.println(playersName[i] + " threw Dice " + dice1 + " and " + dice2);
                        if (dice1 == dice2) {
                            playersJailTimeCounter[i] = 0;
                            System.out.println(playersName[i] + " threw PAIR!!!");
                            System.out.println(playersName[i] + " is out of JAIL!!!");

                            MethodsPlayer.setPlayerPosition(playersPosition, playersMoney, i, dice1 + dice2);
                            System.out.println(playersName[i] + "'s position is " + playersPosition[i] + " -\"" + fields[0][playersPosition[i]] + "\"");
                            isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, i, dice1 + dice2);

                            if (playersMoney[i] < 0) {
                                deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, i);
                            }
                        } else {
                            playersJailTimeCounter[i]--;
                        }

                        if (playersJailTimeCounter[i] > 1) {
                            System.out.println(playersName[i] + " has " + playersJailTimeCounter[i] + " turns left in Jail ");
                        } else {
                            System.out.println(playersName[i] + " has " + playersJailTimeCounter[i] + " turn left in Jail ");
                        }
                    } else {
                        System.out.println();
                        Dice.promptEnterKey();
                        int dice1 = Dice.throwDice();
                        int dice2 = Dice.throwDice();
                        System.out.println(playersName[i] + " threw Dice " + dice1 + " and " + dice2);
                        System.out.println();

                        if (dice1 == dice2) {
                            System.out.println(playersName[i] + " threw PAIR!!!");
                            pairCount++;
                            System.out.println("Pair Count = " + pairCount);
                        }

                        MethodsPlayer.setPlayerPosition(playersPosition, playersMoney, i, dice1 + dice2);//player's NEW position is applied to arr index
                        System.out.println(playersName[i] + "'s position is " + playersPosition[i] + " -\"" + fields[0][playersPosition[i]] + "\"");
                        isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, i, dice1 + dice2);

                        if (playersMoney[i] > 0) {
                            Dice.checkForPair(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, i, dice1, dice2, pairCount);
                        }
                    }
                }
            }
            if (playersMoney[i] < 0) {
                if (isPlayerActive[i]) {
                    deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, i);
                }
            }
        }

        //count the Players
        int sumOfActivePlayers = 0;
        for (int j = 0; j < isPlayerActive.length; j++) {
            if (isPlayerActive[j]) {
                sumOfActivePlayers++;
            }
        }
        //checking if there is only one player left
        if (sumOfActivePlayers > 1) {
            startGame(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive);
        }
/*             return;
           for (int j = 0; j < isPlayerActive.length; j++) {
                if (isPlayerActive[j]){
                    System.out.println("And the WINNER is " + playersName[j].toUpperCase());
                }
            }


        } else {
            startGame(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive);
        }

 */
    }


    public static void deletePlayer(String[][] fields, String[] playersName, String[] fieldsInitialPrices, boolean[] isPlayerActive, int iteration) {
        if (!isPlayerActive[iteration]) {
            return;
        } else {
            System.out.println(playersName[iteration] + " you have NO more money.\nYou are broke!");
            System.out.println("END OF GAME FOR YOU!!!");

            //suspending player's turn
            isPlayerActive[iteration] = false;

            //restoring initial price of the fields owned by the player
            for (int i = 0; i < fields[2].length; i++) {
                if (playersName[iteration].equals(fields[1][i])) {
                    fields[2][i] = fieldsInitialPrices[i];
                }
            }
            //restoring initial house count of the fields owned by the player
            for (int i = 0; i < fields[5].length; i++) {
                if (playersName[iteration].equals(fields[1][i])) {
                    fields[5][i] = "0";
                }
            }

            // removing ownership from the fields own by the player
            for (int i = 0; i < fields[1].length; i++) {
                if (playersName[iteration].equals(fields[1][i])) {
                    fields[1][i] = "";
                }
            }

            //checking if there is only one Player left
            int sumOfActivePlayers = 0;
            for (int j = 0; j < isPlayerActive.length; j++) {
                if (isPlayerActive[j]) {
                    sumOfActivePlayers++;
                }
            }
            if (sumOfActivePlayers == 1) {
                for (int j = 0; j < isPlayerActive.length; j++) {
                    if (isPlayerActive[j]) {
                        System.out.println("And the WINNER is " + playersName[j].toUpperCase());
                    }
                }
            }

        }
    }

    public static void isFieldSpecial(String[][] fields, String[][] communityChest, String[] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition, int[] playersJailTimeCounter, String[] fieldsInitialPrices, boolean[] isPlayerActive, int iteration, int diceSum) {
        if (fields[1][playersPosition[iteration]].equals("Community Chest") ||
                fields[1][playersPosition[iteration]].equals("Income Tax") ||
                fields[1][playersPosition[iteration]].equals("Go To Jail") ||
                fields[1][playersPosition[iteration]].equals("Luxury Tax") ||
                fields[1][playersPosition[iteration]].equals("Chance") ||
                fields[1][playersPosition[iteration]].equals("Jail") ||
                fields[1][playersPosition[iteration]].equals("Free Parking")) {
            switch (fields[1][playersPosition[iteration]]) {
                case "Chance" -> {
                    Random rand = new Random();
                    int chance = rand.nextInt(12);
                    System.out.println(chanceCards[chance]);
                    switch (chance) {
                        case 0 -> {
                            playersPosition[iteration] = 39;
                            isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                        }
                        case 1 -> {
                            playersPosition[iteration] = 0;
                            System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                            playersMoney[iteration] += 200;
                            System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                        }
                        case 2 -> {
                            if (playersPosition[iteration] == 36) {
                                playersPosition[iteration] = 24;
                                playersMoney[iteration] += 200;
                                System.out.println(playersName[iteration] + " passed through \"GO\" and collects $200.\"");
                                isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            } else {
                                playersPosition[iteration] = 24;
                                isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            }
                        }
                        case 3 -> {
                            if (playersPosition[iteration] == 7) {
                                playersPosition[iteration] = 11;
                                System.out.println(playersName[iteration] + "'s position is " + playersPosition[iteration] + " -\"" + fields[0][playersPosition[iteration]] + "\"");
                                isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            } else {
                                playersPosition[iteration] = 11;
                                playersMoney[iteration] += 200;
                                System.out.println(playersName[iteration] + " passed through \"GO\" and collects $200.\"");
                                isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            }
                        }
                        case 4 -> {
                            if (playersPosition[iteration] == 7) {
                                playersPosition[iteration] = 15;
                                System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                isRailRoadFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            } else if (playersPosition[iteration] == 22) {
                                playersPosition[iteration] = 25;
                                System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                                isRailRoadFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            } else if (playersPosition[iteration] == 36) {
                                playersPosition[iteration] = 5;
                                System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                                isRailRoadFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            }
                        }
                        case 5 -> {
                            if (playersPosition[iteration] == 7) {
                                playersPosition[iteration] = 12;
                                System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                                isUtilityFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            } else if (playersPosition[iteration] == 22) {
                                playersPosition[iteration] = 28;
                                System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                                isUtilityFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            }
                        }
                        case 6 -> {
                            playersMoney[iteration] += 50;
                            System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                        }
                        case 7 -> {
                            playersPosition[iteration] -= 3;
                            System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                            isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");

                        }
                        case 8 -> {
                            playersPosition[iteration] = 10;
                            System.out.println(playersName[iteration] + " is IN " + fields[0][playersPosition[iteration]]);
                            playersJailTimeCounter[iteration] = 3;
                        }
                        case 9 -> {
                            System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                            System.out.println(playersName[iteration] + " must pay 15$");
                            if (playersMoney[iteration] < 15) {
                                System.out.println("You don't have enough money to pay your fee!");
                            }
                            playersMoney[iteration] -= 15;

                        }
                        case 10 -> {
                            if (playersPosition[iteration] > 5) {
                                playersPosition[iteration] = 5;
                                playersMoney[iteration] += 200;
                                System.out.println(playersName[iteration] + " passed through \"GO\" and collects $200.\"");
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                            } else {
                                playersPosition[iteration] = 5;
                            }
                        }
                        case 11 -> {
                            //checking if Player has enough money
                            if (playersMoney[iteration] > (playersMoney.length - 1) * 50) {
                                for (int i = 0; i < playersMoney.length; i++) {
                                    playersMoney[i] += 50;
                                }
                                playersMoney[iteration] -= playersMoney.length * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                            }

                        }
                        case 12 -> {
                            playersMoney[iteration] += 150;
                            System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                        }
                    }

                }
                case "Community Chest" -> {
                    Random rand = new Random();
                    int index = rand.nextInt(13);
                    System.out.println(communityChest[0][index]);
                    switch (index) {
                        case 0 -> {
                            playersPosition[iteration] = 0;
                            System.out.println(playersName[iteration] + " was moved to " + fields[0][playersPosition[iteration]]);
                            System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");

                        }
                        case 4 -> {
                            playersPosition[iteration] = 10;
                            playersJailTimeCounter[iteration] = 3;
                        }
                        case 7 -> {
                            for (int i = 0; i < playersMoney.length; i++) {
                                playersMoney[i] -= 10;      //deduct 10$ of every player
                            }
                            playersMoney[iteration] += playersMoney.length * 10; //add 10$ from every player to current player
                            System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                            for (int i = 0; i < playersMoney.length; i++) {
                                if (playersMoney[i] < 0) {
                                    deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, i);
                                }
                            }
                        }
                        default -> {
                            playersMoney[iteration] += Integer.parseInt(communityChest[1][index]);
                            if (playersMoney[iteration] > 0) {
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                            } else {
                                System.out.println(playersName[iteration] + " you are missing " + Math.abs(playersMoney[iteration]));
                            }
                        }
                    }
                }
                case "Income Tax" -> {
                    System.out.println("Pay 200$ Income TAX :)");
                    playersMoney[iteration] -= 200;
                    if (playersMoney[iteration] < 0) {
                        System.out.println(playersName[iteration] + " you have " + (playersMoney[iteration] + 200) + " in your Bank account");
                        System.out.println("You don't have enough to pay your Tax!");
                    } else {
                        System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                    }
                    if (playersMoney[iteration] < 0) {
                        deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, iteration);
                    }
                }
                case "Go To Jail" -> {
                    System.out.println("Go straight to Jail");
                    playersPosition[iteration] = 10;
                    playersJailTimeCounter[iteration] = 3;
                }
                case "Luxury Tax" -> {
                    System.out.println("Pay 100$ Luxury TAX :)");
                    playersMoney[iteration] -= 100;
                    System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                    if (playersMoney[iteration] < 0) {
                        deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, iteration);


                    }
                }
                case "Jail" -> System.out.println("Just Visiting");
                case "Free Parking" -> System.out.println("Free Parking");
            }
        }
    }

    public static void isFieldFree(String[][] fields, String[][] communityChest, String[] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition, int[] playersJailTimeCounter, String[] fieldsInitialPrices, boolean[] isPlayerActive, int iteration, int diceSum) {
        Scanner sc = new Scanner(System.in);
        if (fields[1][playersPosition[iteration]].equals("")) { //if the field is free/empty
            System.out.println("Property \"" + fields[0][playersPosition[iteration]] + "\" is free.");
            System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
            System.out.println("Property price is " + fields[2][playersPosition[iteration]] + "$");
            System.out.println("Would you like to buy it?");
            System.out.print("Yes/No-> ");
            String q = sc.next().toLowerCase();
            switch (q) {
                case "yes":
                    if (playersMoney[iteration] > Integer.parseInt(fields[2][playersPosition[iteration]])) {
                        playersMoney[iteration] -= Integer.parseInt(fields[2][(playersPosition[iteration])]);
                        fields[1][playersPosition[iteration]] = playersName[iteration];

                        System.out.println(playersName[iteration] + " successfully bought property \"" + fields[0][playersPosition[iteration]] + "\"!");
                        System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                    } else if (playersMoney[iteration] < Integer.parseInt(fields[2][playersPosition[iteration]])) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    }
                    break;
                case "no":
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                    break;
            }
            //if the field have Owner or Special
        } else if (!fields[1][playersPosition[iteration]].equals("")) {
            //check if field is SPECIAL
            if (fields[0][playersPosition[iteration]].equals("Chance") || fields[0][playersPosition[iteration]].equals("Community Chest") ||
                    fields[0][playersPosition[iteration]].equals("Income Tax") || fields[0][playersPosition[iteration]].equals("Jail") ||
                    fields[0][playersPosition[iteration]].equals("Go To Jail") || fields[0][playersPosition[iteration]].equals("Luxury Tax") || fields[0][playersPosition[iteration]].equals("Free Parking")) {
                isFieldSpecial(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
            }
            //if field is RailRoad
            else if (fields[0][playersPosition[iteration]].equals("Reading Railroad") || fields[0][playersPosition[iteration]].equals("Pennsylvania Railroad") ||
                    fields[0][playersPosition[iteration]].equals("Short Line Railroad") || fields[0][playersPosition[iteration]].equals("B&O Railroad")) {
                isRailRoadFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
            } else if (fields[0][playersPosition[iteration]].equals("Electric Company") || fields[0][playersPosition[iteration]].equals("Water Works")) {
                isUtilityFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
            }


            //check if Player is the owner of the field
            else if (fields[1][playersPosition[iteration]].equals(playersName[iteration])) {
                System.out.println(playersName[iteration] + " is the owner of " + fields[0][playersPosition[iteration]]);

            }
            //Player pays rent to the Owner of the field
            //if Player has enough money
            else if (playersMoney[iteration] > Integer.parseInt(fields[3][playersPosition[iteration]])) {
                System.out.println(playersName[iteration] + " paid " + Integer.parseInt(fields[3][playersPosition[iteration]]) + " to " + fields[1][playersPosition[iteration]]);
                playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]);

                //adding rent money to the field Owner budget
                for (int i = 0; i < playersName.length; i++) {
                    if (playersName[i].equalsIgnoreCase(fields[1][playersPosition[iteration]])) {
                        playersMoney[i] += Integer.parseInt(fields[3][playersPosition[iteration]]);
                    }
                }
                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
            }
            //if Player does NOT have enough money
            else if (playersMoney[iteration] < Integer.parseInt(fields[3][playersPosition[iteration]])) {
                System.out.println(playersName[iteration] + " you have " + playersMoney[iteration] + " left in your Bank Account.");
                System.out.println(playersName[iteration] + " you must pay " + Integer.parseInt(fields[3][playersPosition[iteration]]) + " to " + fields[1][playersPosition[iteration]]);
                playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]);
                // deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, iteration);
            }
        }
    }

    public static void isRailRoadFree(String[][] fields, String[][] communityChest, String[] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition, int[] playersJailTimeCounter, String[] fieldsInitialPrices, boolean[] isPlayerActive, int iteration, int diceSum) {
        Scanner sc = new Scanner(System.in);
        //if the field is free/empty
        if (fields[1][playersPosition[iteration]].equals("")) {
            System.out.println("Property \"" + fields[0][playersPosition[iteration]] + "\" is free.");
            System.out.println("Would you like to buy it?");
            System.out.print("Yes/No-> ");
            String q = sc.next().toLowerCase();
            switch (q) {
                case "yes":
                    if (playersMoney[iteration] > Integer.parseInt(fields[2][playersPosition[iteration]])) {
                        playersMoney[iteration] -= Integer.parseInt(fields[2][(playersPosition[iteration])]);
                        fields[1][playersPosition[iteration]] = playersName[iteration];
                        System.out.println(playersName[iteration] + " successfully bought property \"" + fields[0][playersPosition[iteration]] + "\"!");
                        System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                    } else if (playersMoney[iteration] < Integer.parseInt(fields[2][playersPosition[iteration]])) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    }
                    break;
                case "no":
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                    break;
            }
            //if the field has Owner
        } else if (!fields[1][playersPosition[iteration]].equals("")) {
            //Player pays rent to the Owner of the field
            //if Player has enough money
            //chanceCards[0][4]

            if (fields[1][playersPosition[iteration]].equals(playersName[iteration])) {    //checks if Player is the owner of the field
                System.out.println(playersName[iteration] + " is the owner of " + fields[0][playersPosition[iteration]]);

            } else {
                int count = 0; //counts how many RailRoad station the Owner has
                if (fields[1][playersPosition[iteration]].equals(fields[1][5])) {
                    count++;
                }
                if (fields[1][playersPosition[iteration]].equals(fields[1][15])) {
                    count++;
                }
                if (fields[1][playersPosition[iteration]].equals(fields[1][25])) {
                    count++;
                }
                if (fields[1][playersPosition[iteration]].equals(fields[1][35])) {
                    count++;
                }

                if (playersMoney[iteration] > Integer.parseInt(fields[3][playersPosition[iteration]]) * count * 2) {
                    System.out.println(playersName[iteration] + " paid " + Integer.parseInt(fields[3][playersPosition[iteration]]) * count * 2 + " to " + fields[1][playersPosition[iteration]]);
                    playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]) * count * 2;


                    //adding rent money to the field Owner budget
                    for (int i = 0; i < playersName.length; i++) {
                        if (playersName[i].equalsIgnoreCase(fields[1][playersPosition[iteration]])) {
                            playersMoney[i] += Integer.parseInt(fields[3][playersPosition[iteration]]) * count * 2;
                        }
                    }
                    System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                }
                //if Player does NOT have enough money
                else if (playersMoney[iteration] < Integer.parseInt(fields[3][playersPosition[iteration]]) * count * 2) {
                    System.out.println(playersName[iteration] + " you have " + playersMoney[iteration] + " left in your Bank Account.");
                    System.out.println(playersName[iteration] + " you must pay " + Integer.parseInt(fields[3][playersPosition[iteration]]) * count * 2 + " to " + fields[1][playersPosition[iteration]]);
                    playersMoney[iteration] -= Integer.parseInt(fields[3][playersPosition[iteration]]) * count * 2;
                    //deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, iteration);
                }
            }
        }
    }

    public static void isUtilityFree(String[][] fields, String[][] communityChest, String[] chanceCards, String[] playersName, int[] playersMoney, int[] playersPosition, int[] playersJailTimeCounter, String[] fieldsInitialPrices, boolean[] isPlayerActive, int iteration, int diceSum) {
        Scanner sc = new Scanner(System.in);
        int count = 0; //counts how many Utilities the Owner has
        int multiplier = 4;
        //if the field is free/empty
        if (fields[1][playersPosition[iteration]].equals("")) {
            System.out.println("Property \"" + fields[0][playersPosition[iteration]] + "\" is free.");
            System.out.println("Would you like to buy it?");
            System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
            System.out.println("Property price is " + fields[2][playersPosition[iteration]] + "$");
            System.out.print("Yes/No-> ");
            String q = sc.next().toLowerCase();
            switch (q) {
                case "yes":
                    if (playersMoney[iteration] > Integer.parseInt(fields[2][playersPosition[iteration]])) {
                        playersMoney[iteration] -= Integer.parseInt(fields[2][(playersPosition[iteration])]);
                        fields[1][playersPosition[iteration]] = playersName[iteration];
                        System.out.println(playersName[iteration] + " successfully bought property \"" + fields[0][playersPosition[iteration]] + "\"!");
                        System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                    } else if (playersMoney[iteration] < Integer.parseInt(fields[2][playersPosition[iteration]])) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    }
                    break;
                case "no":
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    isFieldFree(fields, communityChest, chanceCards, playersName, playersMoney, playersPosition, playersJailTimeCounter, fieldsInitialPrices, isPlayerActive, iteration, diceSum);
                    break;
            }
            //if the field have Owner
        } else if (!fields[1][playersPosition[iteration]].equals("")) {
            //chanceCards[0][5]

            if (fields[1][playersPosition[iteration]].equals(playersName[iteration])) {      //checks if Player is the owner of the field
                System.out.println(fields[1][playersPosition[iteration]] + " is the owner of " + fields[0][playersPosition[iteration]]);

            } else {

                if (fields[1][playersPosition[iteration]].equals(fields[1][12])) {
                    count++;
                }
                if (fields[1][playersPosition[iteration]].equals(fields[1][28])) {
                    count++;
                }
                if (count > 1) {
                    multiplier = 10;
                }
                int total = diceSum * multiplier;

                //if Player has enough money
                if (playersMoney[iteration] > total) {
                    System.out.println(playersName[iteration] + " paid " + total + " to " + fields[1][playersPosition[iteration]]);
                    playersMoney[iteration] -= total;

                    //adding rent money to the field's Owner budget
                    for (int i = 0; i < playersName.length; i++) {
                        if (playersName[i].equalsIgnoreCase(fields[1][playersPosition[iteration]])) {
                            playersMoney[i] += total;
                        }
                    }
                    System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                }
                //if Player does NOT have enough money
                else if (playersMoney[iteration] < diceSum * multiplier) {
                    System.out.println(fields[1][playersPosition[iteration]] + " is the owner of " + fields[0][playersPosition[iteration]]);
                    playersMoney[iteration] -= total;
                    //deletePlayer(fields, playersName, fieldsInitialPrices, isPlayerActive, iteration);
                }
            }
        }
    }
}
