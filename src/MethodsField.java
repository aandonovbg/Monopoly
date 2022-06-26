import java.util.ArrayList;
import java.util.Scanner;

public class MethodsField {
    public static String[][] initializeFieldsNamesAndOwners() {
        //[0][0]=fieldsNames
        //[1][0]=fieldsOwners
        //[2][0]=fieldsPrice
        //[3][0]=fieldsRent
        //[4][0]=fieldColor
        String[][] fieldsNamesAndOwners = new String[5][40];

        fieldsNamesAndOwners[0][0] = "GO";
        fieldsNamesAndOwners[0][1] = "Mediterranean Avenue";
        fieldsNamesAndOwners[0][2] = "Community Chest";
        fieldsNamesAndOwners[0][3] = "Baltic Avenue";
        fieldsNamesAndOwners[0][4] = "Income Tax";
        fieldsNamesAndOwners[0][5] = "Reading Railroad";
        fieldsNamesAndOwners[0][6] = "Oriental Avenue";
        fieldsNamesAndOwners[0][7] = "Chance";
        fieldsNamesAndOwners[0][8] = "Vermont Avenue";
        fieldsNamesAndOwners[0][9] = "Connecticut Avenue";
        fieldsNamesAndOwners[0][10] = "Jail";
        fieldsNamesAndOwners[0][11] = "St. Charles Place";
        fieldsNamesAndOwners[0][12] = "Electric Company";
        fieldsNamesAndOwners[0][13] = "States Avenue";
        fieldsNamesAndOwners[0][14] = "Virginia Avenue";
        fieldsNamesAndOwners[0][15] = "Pennsylvania Railroad";
        fieldsNamesAndOwners[0][16] = "St. James Place";
        fieldsNamesAndOwners[0][17] = "Community Chest";
        fieldsNamesAndOwners[0][18] = "Tennessee Avenue";
        fieldsNamesAndOwners[0][19] = "New York Avenue";
        fieldsNamesAndOwners[0][20] = "Free Parking";
        fieldsNamesAndOwners[0][21] = "Kentucky Avenue";
        fieldsNamesAndOwners[0][22] = "Chance";
        fieldsNamesAndOwners[0][23] = "Indiana Avenue";
        fieldsNamesAndOwners[0][24] = "Illinois Avenue";
        fieldsNamesAndOwners[0][25] = "Short Line Railroad";
        fieldsNamesAndOwners[0][26] = "Atlantic Avenue";
        fieldsNamesAndOwners[0][27] = "Ventnor Avenue";
        fieldsNamesAndOwners[0][28] = "Water Works";
        fieldsNamesAndOwners[0][29] = "Marvin Gardens";
        fieldsNamesAndOwners[0][30] = "Go To Jail";
        fieldsNamesAndOwners[0][31] = "Pacific Avenue";
        fieldsNamesAndOwners[0][32] = "North Carolina Avenue";
        fieldsNamesAndOwners[0][33] = "Community Chest";
        fieldsNamesAndOwners[0][34] = "Pennsylvania Avenue";
        fieldsNamesAndOwners[0][35] = "B&O Railroad";
        fieldsNamesAndOwners[0][36] = "Chance";
        fieldsNamesAndOwners[0][37] = "Park Place";
        fieldsNamesAndOwners[0][38] = "Luxury Tax";
        fieldsNamesAndOwners[0][39] = "Boardwalk";

        fieldsNamesAndOwners[1][0] = "GO";
        fieldsNamesAndOwners[1][1] = "";
        fieldsNamesAndOwners[1][2] = "Community Chest";
        fieldsNamesAndOwners[1][3] = "";
        fieldsNamesAndOwners[1][4] = "Income Tax";
        fieldsNamesAndOwners[1][5] = "";
        fieldsNamesAndOwners[1][6] = "";
        fieldsNamesAndOwners[1][7] = "Chance";
        fieldsNamesAndOwners[1][8] = "";
        fieldsNamesAndOwners[1][9] = "";
        fieldsNamesAndOwners[1][10] = "Jail";
        fieldsNamesAndOwners[1][11] = "";
        fieldsNamesAndOwners[1][12] = "";
        fieldsNamesAndOwners[1][13] = "";
        fieldsNamesAndOwners[1][14] = "";
        fieldsNamesAndOwners[1][15] = "";
        fieldsNamesAndOwners[1][16] = "";
        fieldsNamesAndOwners[1][17] = "Community Chest";
        fieldsNamesAndOwners[1][18] = "";
        fieldsNamesAndOwners[1][19] = "";
        fieldsNamesAndOwners[1][20] = "Free Parking";
        fieldsNamesAndOwners[1][21] = "";
        fieldsNamesAndOwners[1][22] = "Chance";
        fieldsNamesAndOwners[1][23] = "";
        fieldsNamesAndOwners[1][24] = "";
        fieldsNamesAndOwners[1][25] = "";
        fieldsNamesAndOwners[1][26] = "";
        fieldsNamesAndOwners[1][27] = "";
        fieldsNamesAndOwners[1][28] = "";
        fieldsNamesAndOwners[1][29] = "";
        fieldsNamesAndOwners[1][30] = "Go To Jail";
        fieldsNamesAndOwners[1][31] = "";
        fieldsNamesAndOwners[1][32] = "";
        fieldsNamesAndOwners[1][33] = "Community Chest";
        fieldsNamesAndOwners[1][34] = "";
        fieldsNamesAndOwners[1][35] = "";
        fieldsNamesAndOwners[1][36] = "Chance";
        fieldsNamesAndOwners[1][37] = "";
        fieldsNamesAndOwners[1][38] = "Luxury Tax";
        fieldsNamesAndOwners[1][39] = "";

        fieldsNamesAndOwners[2][0] = "";
        fieldsNamesAndOwners[2][1] = "60";
        fieldsNamesAndOwners[2][2] = "Community Chest";
        fieldsNamesAndOwners[2][3] = "60";
        fieldsNamesAndOwners[2][4] = "Income Tax";
        fieldsNamesAndOwners[2][5] = "200";
        fieldsNamesAndOwners[2][6] = "100";
        fieldsNamesAndOwners[2][7] = "Chance";
        fieldsNamesAndOwners[2][8] = "100";
        fieldsNamesAndOwners[2][9] = "120";
        fieldsNamesAndOwners[2][10] = "Jail";
        fieldsNamesAndOwners[2][11] = "140";
        fieldsNamesAndOwners[2][12] = "150";
        fieldsNamesAndOwners[2][13] = "140";
        fieldsNamesAndOwners[2][14] = "160";
        fieldsNamesAndOwners[2][15] = "200";
        fieldsNamesAndOwners[2][16] = "180";
        fieldsNamesAndOwners[2][17] = "Community Chest";
        fieldsNamesAndOwners[2][18] = "180";
        fieldsNamesAndOwners[2][19] = "200";
        fieldsNamesAndOwners[2][20] = "";
        fieldsNamesAndOwners[2][21] = "220";
        fieldsNamesAndOwners[2][22] = "Chance";
        fieldsNamesAndOwners[2][23] = "220";
        fieldsNamesAndOwners[2][24] = "240";
        fieldsNamesAndOwners[2][25] = "200";
        fieldsNamesAndOwners[2][26] = "260";
        fieldsNamesAndOwners[2][27] = "260";
        fieldsNamesAndOwners[2][28] = "150";
        fieldsNamesAndOwners[2][29] = "280";
        fieldsNamesAndOwners[2][30] = "Go To Jail";
        fieldsNamesAndOwners[2][31] = "300";
        fieldsNamesAndOwners[2][32] = "300";
        fieldsNamesAndOwners[2][33] = "Community Chest";
        fieldsNamesAndOwners[2][34] = "320";
        fieldsNamesAndOwners[2][35] = "200";
        fieldsNamesAndOwners[2][36] = "Chance";
        fieldsNamesAndOwners[2][37] = "350";
        fieldsNamesAndOwners[2][38] = "Luxury Tax";
        fieldsNamesAndOwners[2][39] = "400";


        fieldsNamesAndOwners[3][0] = "GO";
        fieldsNamesAndOwners[3][1] = "2";
        fieldsNamesAndOwners[3][2] = "Community Chest";
        fieldsNamesAndOwners[3][3] = "4";
        fieldsNamesAndOwners[3][4] = "Income Tax";
        fieldsNamesAndOwners[3][5] = "25";
        fieldsNamesAndOwners[3][6] = "6";
        fieldsNamesAndOwners[3][7] = "Chance";
        fieldsNamesAndOwners[3][8] = "6";
        fieldsNamesAndOwners[3][9] = "8";
        fieldsNamesAndOwners[3][10] = "Jail";
        fieldsNamesAndOwners[3][11] = "10";
        fieldsNamesAndOwners[3][12] = "0";
        fieldsNamesAndOwners[3][13] = "10";
        fieldsNamesAndOwners[3][14] = "12";
        fieldsNamesAndOwners[3][15] = "25";
        fieldsNamesAndOwners[3][16] = "14";
        fieldsNamesAndOwners[3][17] = "Community Chest";
        fieldsNamesAndOwners[3][18] = "14";
        fieldsNamesAndOwners[3][19] = "16";
        fieldsNamesAndOwners[3][20] = "";
        fieldsNamesAndOwners[3][21] = "18";
        fieldsNamesAndOwners[3][22] = "Chance";
        fieldsNamesAndOwners[3][23] = "18";
        fieldsNamesAndOwners[3][24] = "20";
        fieldsNamesAndOwners[3][25] = "25";
        fieldsNamesAndOwners[3][26] = "22";
        fieldsNamesAndOwners[3][27] = "22";
        fieldsNamesAndOwners[3][28] = "0";
        fieldsNamesAndOwners[3][29] = "24";
        fieldsNamesAndOwners[3][30] = "Go To Jail";
        fieldsNamesAndOwners[3][31] = "26";
        fieldsNamesAndOwners[3][32] = "26";
        fieldsNamesAndOwners[3][33] = "Community Chest";
        fieldsNamesAndOwners[3][34] = "28";
        fieldsNamesAndOwners[3][35] = "25";
        fieldsNamesAndOwners[3][36] = "Chance";
        fieldsNamesAndOwners[3][37] = "35";
        fieldsNamesAndOwners[3][38] = "Luxury Tax";
        fieldsNamesAndOwners[3][39] = "50";


        fieldsNamesAndOwners[4][0] = "GO";
        fieldsNamesAndOwners[4][1] = "Brown";
        fieldsNamesAndOwners[4][2] = "Community Chest";
        fieldsNamesAndOwners[4][3] = "Brown";
        fieldsNamesAndOwners[4][4] = "Income Tax";
        fieldsNamesAndOwners[4][5] = "";
        fieldsNamesAndOwners[4][6] = "Light Blue";
        fieldsNamesAndOwners[4][7] = "Chance";
        fieldsNamesAndOwners[4][8] = "Light Blue";
        fieldsNamesAndOwners[4][9] = "Light Blue";
        fieldsNamesAndOwners[4][10] = "Jail";
        fieldsNamesAndOwners[4][11] = "Pink";
        fieldsNamesAndOwners[4][12] = "";
        fieldsNamesAndOwners[4][13] = "Pink";
        fieldsNamesAndOwners[4][14] = "Pink";
        fieldsNamesAndOwners[4][15] = "";
        fieldsNamesAndOwners[4][16] = "Orange";
        fieldsNamesAndOwners[4][17] = "Community Chest";
        fieldsNamesAndOwners[4][18] = "Orange";
        fieldsNamesAndOwners[4][19] = "Orange";
        fieldsNamesAndOwners[4][20] = "Free Parking";
        fieldsNamesAndOwners[4][21] = "Red";
        fieldsNamesAndOwners[4][22] = "Chance";
        fieldsNamesAndOwners[4][23] = "Red";
        fieldsNamesAndOwners[4][24] = "Red";
        fieldsNamesAndOwners[4][25] = "";
        fieldsNamesAndOwners[4][26] = "Yellow";
        fieldsNamesAndOwners[4][27] = "Yellow";
        fieldsNamesAndOwners[4][28] = "";
        fieldsNamesAndOwners[4][29] = "Yellow";
        fieldsNamesAndOwners[4][30] = "Go To Jail";
        fieldsNamesAndOwners[4][31] = "Green";
        fieldsNamesAndOwners[4][32] = "Green";
        fieldsNamesAndOwners[4][33] = "Community Chest";
        fieldsNamesAndOwners[4][34] = "Green";
        fieldsNamesAndOwners[4][35] = "";
        fieldsNamesAndOwners[4][36] = "Chance";
        fieldsNamesAndOwners[4][37] = "Blue";
        fieldsNamesAndOwners[4][38] = "Luxury Tax";
        fieldsNamesAndOwners[4][39] = "Blue";

        return fieldsNamesAndOwners;
    }

    public static String[] chanceCards() {
        //[0][0]=cardsText
        String[] chanceCards = new String[13];
        chanceCards[0] = "Advance to \"Boardwalk\".";
        chanceCards[1] = "Advance to \"GO\". Collect $200.";
        chanceCards[2] = "Advance to \"Illinois Avenue\". If you pass \"GO\", collect $200.";
        chanceCards[3] = "Advance to \"St. Charles Place\". If you pass \"GO\", collect $200.";
        chanceCards[4] = "Advance to the nearest \"Railroad\". If unowned, you may buy it from the Bank." +
                " If owned, pay owner twice the rental to which they are otherwise entitled.";
        chanceCards[5] = "Advance to nearest \"Utility\". If unowned, you may buy it from the Bank." +
                " If owned, throw dice and pay owner a total ten times amount thrown.";
        chanceCards[6] = "Bank pays you dividend of $50.";
        chanceCards[7] = "Go back 3 spaces.";
        chanceCards[8] = "Go to Jail. Go directly to Jail, do not pass \"GO\", do NOT collect $200.";
        chanceCards[9] = "Speeding fine $15";
        chanceCards[10] = "Take a trip to \"Reading Railroad\". If you pass \"GO\", collect $200.";
        chanceCards[11] = "You have been elected Chairman of the Board. Pay each player $50";
        chanceCards[12] = "Your building loan matures. Collect $150";

        return chanceCards;
    }

    public static String[][] communityChest() {
        //[0][0]=cardsText
        //[1][0]=cardsCashAmount
        String[][] communityChest = new String[2][14];
        communityChest[0][0] = "Advance to \"GO\". Collect $200";
        communityChest[0][1] = "Bank error in your favor. Collect $200";
        communityChest[0][2] = "Doctor’s fee. Pay $50";
        communityChest[0][3] = "From sale of stock you get $50.";
        communityChest[0][4] = "Go to Jail. Go directly to jail, do not pass Go, do not collect $200";
        communityChest[0][5] = "Holiday fund matures. Receive $100.";
        communityChest[0][6] = "Income tax refund. Collect $20.";
        communityChest[0][7] = "It is your birthday. Collect $10 from every player";
        communityChest[0][8] = "Life insurance matures. Collect $100.";
        communityChest[0][9] = "Pay hospital fees of $100.";
        communityChest[0][10] = "Pay school fees of $50.";
        communityChest[0][11] = "Receive $25 consultancy fee.";
        communityChest[0][12] = "You have won second prize in a beauty contest. Collect $10.";
        communityChest[0][13] = "You inherit $100.";

        communityChest[1][0] = "200";
        communityChest[1][1] = "200";
        communityChest[1][2] = "-50";
        communityChest[1][3] = "50";
        communityChest[1][4] = "Go to Jail. Go directly to jail, do not pass Go, do not collect $200";
        communityChest[1][5] = "100";
        communityChest[1][6] = "20";
        communityChest[1][7] = "It is your birthday. Collect $10 from every player";
        communityChest[1][8] = "100";
        communityChest[1][9] = "-100";
        communityChest[1][10] = "-50";
        communityChest[1][11] = "25";
        communityChest[1][12] = "10";
        communityChest[1][13] = "100";

        return communityChest;
    }


    //HOW WE BUILD HOUSES!!!!

    public static ArrayList<String> createdNeighborhoods(String[][] fields, String[] playersName, int[] playersMoney, int[] playersPosition, int iteration) {
        ArrayList<String> buildHouseEnabled = new ArrayList<>();

        if (fields[1][1].equals(playersName[iteration]) && fields[1][3].equals(playersName[iteration])) {
            buildHouseEnabled.add("Brown");
            System.out.println(playersName[iteration] + " can build houses on \"Brown\" Neighborhood");
        } else if (fields[1][6].equals(playersName[iteration]) && fields[1][8].equals(playersName[iteration]) && fields[1][9].equals(playersName[iteration])) {
            buildHouseEnabled.add("Light Blue");
            System.out.println(playersName[iteration] + " can build houses on \"Light Blue\" Neighborhood");
        } else if (fields[1][11].equals(playersName[iteration]) && fields[1][13].equals(playersName[iteration]) && fields[1][14].equals(playersName[iteration])) {
            buildHouseEnabled.add("Pink");
            System.out.println(playersName[iteration] + " can build houses on \"Pink\" Neighborhood");
        } else if (fields[1][16].equals(playersName[iteration]) && fields[1][18].equals(playersName[iteration]) && fields[1][19].equals(playersName[iteration])) {
            buildHouseEnabled.add("Orange");
            System.out.println(playersName[iteration] + " can build houses on \"Orange\" Neighborhood");
        } else if (fields[1][21].equals(playersName[iteration]) && fields[1][23].equals(playersName[iteration]) && fields[1][24].equals(playersName[iteration])) {
            buildHouseEnabled.add("Red");
            System.out.println(playersName[iteration] + " can build houses on \"Red\" Neighborhood");
        } else if (fields[1][26].equals(playersName[iteration]) && fields[1][27].equals(playersName[iteration]) && fields[1][29].equals(playersName[iteration])) {
            buildHouseEnabled.add("Yellow");
            System.out.println(playersName[iteration] + " can build houses on \"Yellow\" Neighborhood");
        } else if (fields[1][31].equals(playersName[iteration]) && fields[1][32].equals(playersName[iteration]) && fields[1][34].equals(playersName[iteration])) {
            buildHouseEnabled.add("Green");
            System.out.println(playersName[iteration] + " can build houses on \"Green\" Neighborhood");
        } else if (fields[1][37].equals(playersName[iteration]) && fields[1][38].equals(playersName[iteration])) {
            buildHouseEnabled.add("Blue");
            System.out.println(playersName[iteration] + " can build houses on \"Blue\" Neighborhood");
        }
        return buildHouseEnabled;
    }

    public static void checkIfNeighborHoodIsEnabled(ArrayList<String> buildHouseEnabled, String[][] fields, String[] playersName, int[] playersMoney, int[] playersPosition, int iteration) {
        if (!buildHouseEnabled.isEmpty()) {
            if (buildHouseEnabled.size() > 1) {
                System.out.println(playersName[iteration] + " can build houses on following neighborhoods:");
                for (String s : buildHouseEnabled) {
                    System.out.println(s);
                }
            } else {
                System.out.println(playersName[iteration] + " can build houses on" + buildHouseEnabled.get(0) + "neighborhood");
            }
            System.out.println("Do you want to build houses?");
            System.out.print("Yes/No-> ");
            Scanner sc = new Scanner(System.in);
            String q = sc.next().toLowerCase();
            switch (q) {
                case "yes" -> {
                    buildHouses(buildHouseEnabled, fields, playersName, playersMoney, playersPosition, iteration);
                }
                case "no" -> {
//      HAVE TO FILL IN NO
                }
                default ->
                        checkIfNeighborHoodIsEnabled(buildHouseEnabled, fields, playersName, playersMoney, playersPosition, iteration);
            }
        }
    }

    public static void buildHouses(ArrayList<String> buildHouseEnabled, String[][] fields, String[] playersName, int[] playersMoney, int[] playersPosition, int iteration) {
        if (buildHouseEnabled.size() > 1) {
            System.out.print("choose neighborhood-> ");
            Scanner sc = new Scanner(System.in);
            String q = sc.nextLine().toLowerCase();
            int houseCounter = 0;
            switch (q) {
                case "brown" -> {
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 50) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 50) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][1] + "\"");
                        System.out.println("2.\"" + fields[0][3] + "\"");
                        System.out.print("Choose number 1 or 2-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][1] = "10";
                                } else if (houseCounter == 2) {
                                    fields[3][1] = "30";
                                } else if (houseCounter==3) {
                                    fields[3][1] = "90";
                                } else if (houseCounter==4) {
                                    fields[3][1] = "160";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][3] = "20";
                                } else if (houseCounter == 2) {
                                    fields[3][3] = "60";
                                } else if (houseCounter==3) {
                                    fields[3][3] = "180";
                                } else if (houseCounter==4) {
                                    fields[3][3] = "320";
                                }
                            }
                        }

                    }
                }
                case "light blue" -> {
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 50) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 50) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][6] + "\"");
                        System.out.println("2.\"" + fields[0][8] + "\"");
                        System.out.println("3.\"" + fields[0][9] + "\"");
                        System.out.print("Choose number from 1 to 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][6] = "30";
                                } else if (houseCounter == 2) {
                                    fields[3][6] = "90";
                                } else if (houseCounter==3) {
                                    fields[3][6] = "270";
                                } else if (houseCounter==4) {
                                    fields[3][6] = "400";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][8] = "30";
                                } else if (houseCounter == 2) {
                                    fields[3][8] = "90";
                                } else if (houseCounter==3) {
                                    fields[3][8] = "270";
                                } else if (houseCounter==4) {
                                    fields[3][8] = "400";
                                }
                            }
                            case 3->{
                                if (houseCounter == 1) {
                                    fields[3][9] = "40";
                                } else if (houseCounter == 2) {
                                    fields[3][9] = "100";
                                } else if (houseCounter==3) {
                                    fields[3][9] = "300";
                                } else if (houseCounter==4) {
                                    fields[3][9] = "450";
                                }
                            }
                        }

                    }
                }
                case "pink"->{
                    System.out.println("The price of 1 House is 100");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 100) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 100) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][11] + "\"");
                        System.out.println("2.\"" + fields[0][13] + "\"");
                        System.out.println("3.\"" + fields[0][14] + "\"");
                        System.out.print("Choose number from 1 to 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][11] = "50";
                                } else if (houseCounter == 2) {
                                    fields[3][11] = "150";
                                } else if (houseCounter==3) {
                                    fields[3][11] = "450";
                                } else if (houseCounter==4) {
                                    fields[3][11] = "625";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][13] = "50";
                                } else if (houseCounter == 2) {
                                    fields[3][13] = "150";
                                } else if (houseCounter==3) {
                                    fields[3][13] = "450";
                                } else if (houseCounter==4) {
                                    fields[3][13] = "625";
                                }
                            }
                            case 3->{
                                if (houseCounter == 1) {
                                    fields[3][14] = "60";
                                } else if (houseCounter == 2) {
                                    fields[3][14] = "180";
                                } else if (houseCounter==3) {
                                    fields[3][14] = "500";
                                } else if (houseCounter==4) {
                                    fields[3][14] = "700";
                                }
                            }
                        }
                    }
                }
                case "orange"->{
                    System.out.println("The price of 1 House is 100");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 100) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 100) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][16] + "\"");
                        System.out.println("2.\"" + fields[0][18] + "\"");
                        System.out.println("3.\"" + fields[0][19] + "\"");
                        System.out.print("Choose number from 1 to 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][16] = "70";
                                } else if (houseCounter == 2) {
                                    fields[3][16] = "200";
                                } else if (houseCounter==3) {
                                    fields[3][16] = "550";
                                } else if (houseCounter==4) {
                                    fields[3][16] = "750";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][18] = "70";
                                } else if (houseCounter == 2) {
                                    fields[3][18] = "200";
                                } else if (houseCounter==3) {
                                    fields[3][18] = "550";
                                } else if (houseCounter==4) {
                                    fields[3][18] = "750";
                                }
                            }
                            case 3->{
                                if (houseCounter == 1) {
                                    fields[3][19] = "80";
                                } else if (houseCounter == 2) {
                                    fields[3][19] = "220";
                                } else if (houseCounter==3) {
                                    fields[3][19] = "600";
                                } else if (houseCounter==4) {
                                    fields[3][19] = "800";
                                }
                            }
                        }
                    }
                }
                case "red"->{
                    System.out.println("The price of 1 House is 150");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 150) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 150) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][21] + "\"");
                        System.out.println("2.\"" + fields[0][23] + "\"");
                        System.out.println("3.\"" + fields[0][24] + "\"");
                        System.out.print("Choose number from 1 to 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][21] = "90";
                                } else if (houseCounter == 2) {
                                    fields[3][21] = "250";
                                } else if (houseCounter==3) {
                                    fields[3][21] = "700";
                                } else if (houseCounter==4) {
                                    fields[3][21] = "875";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][23] = "90";
                                } else if (houseCounter == 2) {
                                    fields[3][23] = "250";
                                } else if (houseCounter==3) {
                                    fields[3][23] = "700";
                                } else if (houseCounter==4) {
                                    fields[3][23] = "875";
                                }
                            }
                            case 3->{
                                if (houseCounter == 1) {
                                    fields[3][24] = "100";
                                } else if (houseCounter == 2) {
                                    fields[3][24] = "300";
                                } else if (houseCounter==3) {
                                    fields[3][24] = "750";
                                } else if (houseCounter==4) {
                                    fields[3][24] = "925";
                                }
                            }
                        }
                    }
                }
                case "yellow"->{
                    System.out.println("The price of 1 House is 150");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 150) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 150) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][26] + "\"");
                        System.out.println("2.\"" + fields[0][27] + "\"");
                        System.out.println("3.\"" + fields[0][29] + "\"");
                        System.out.print("Choose number from 1 to 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][26] = "110";
                                } else if (houseCounter == 2) {
                                    fields[3][26] = "330";
                                } else if (houseCounter==3) {
                                    fields[3][26] = "800";
                                } else if (houseCounter==4) {
                                    fields[3][26] = "975";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][27] = "110";
                                } else if (houseCounter == 2) {
                                    fields[3][27] = "330";
                                } else if (houseCounter==3) {
                                    fields[3][27] = "800";
                                } else if (houseCounter==4) {
                                    fields[3][27] = "975";
                                }
                            }
                            case 3->{
                                if (houseCounter == 1) {
                                    fields[3][29] = "120";
                                } else if (houseCounter == 2) {
                                    fields[3][29] = "360";
                                } else if (houseCounter==3) {
                                    fields[3][29] = "850";
                                } else if (houseCounter==4) {
                                    fields[3][29] = "1025";
                                }
                            }
                        }
                    }
                }
                case "green"->{
                    System.out.println("The price of 1 House is 200");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 200) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 200) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][31] + "\"");
                        System.out.println("2.\"" + fields[0][32] + "\"");
                        System.out.println("3.\"" + fields[0][34] + "\"");
                        System.out.print("Choose number from 1 to 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][31] = "130";
                                } else if (houseCounter == 2) {
                                    fields[3][31] = "390";
                                } else if (houseCounter==3) {
                                    fields[3][31] = "900";
                                } else if (houseCounter==4) {
                                    fields[3][31] = "1100";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][32] = "130";
                                } else if (houseCounter == 2) {
                                    fields[3][32] = "390";
                                } else if (houseCounter==3) {
                                    fields[3][32] = "900";
                                } else if (houseCounter==4) {
                                    fields[3][32] = "1100";
                                }
                            }
                            case 3->{
                                if (houseCounter == 1) {
                                    fields[3][34] = "150";
                                } else if (houseCounter == 2) {
                                    fields[3][34] = "450";
                                } else if (houseCounter==3) {
                                    fields[3][34] = "1000";
                                } else if (houseCounter==4) {
                                    fields[3][34] = "1200";
                                }
                            }
                        }
                    }
                }
                case "blue"->{
                    System.out.println("The price of 1 House is 200");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");
                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();
                    if (playersMoney[iteration] < houseCounter * 200) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 200) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][37] + "\"");
                        System.out.println("2.\"" + fields[0][39] + "\"");
                        System.out.print("Choose number 1 or 2-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter == 1) {
                                    fields[3][1] = "175";
                                } else if (houseCounter == 2) {
                                    fields[3][1] = "500";
                                } else if (houseCounter==3) {
                                    fields[3][1] = "1100";
                                } else if (houseCounter==4) {
                                    fields[3][1] = "1300";
                                }
                            }
                            case 2->{
                                if (houseCounter == 1) {
                                    fields[3][3] = "200";
                                } else if (houseCounter == 2) {
                                    fields[3][3] = "600";
                                } else if (houseCounter==3) {
                                    fields[3][3] = "1400";
                                } else if (houseCounter==4) {
                                    fields[3][3] = "1700";
                                }
                            }
                        }

                    }
                }
            }
        } else {
            switch (buildHouseEnabled.get(0)) {

            }
        }
    }
}
