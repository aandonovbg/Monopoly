import java.util.ArrayList;
import java.util.Scanner;

public class Houses {

    public static int checkHouseCounter(String[][] fields, int houseCounter) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("How many houses you want to build?");
            houseCounter = sc.nextByte();
        } while (houseCounter > (4 - Integer.parseInt(fields[5][1])));
        return houseCounter;
    }

    public static ArrayList<String> createdNeighborhoods(String[][] fields, String[] playersName, int iteration) {
        ArrayList<String> buildHouseEnabled = new ArrayList<>();

        if (fields[1][1].equals(playersName[iteration]) && fields[1][3].equals(playersName[iteration])) {
            buildHouseEnabled.add("Brown");
            System.out.println();
            System.out.println(playersName[iteration] + " can build houses on \"Brown\" Neighborhood");
        }
        if (fields[1][6].equals(playersName[iteration]) && fields[1][8].equals(playersName[iteration]) && fields[1][9].equals(playersName[iteration])) {
            buildHouseEnabled.add("Light Blue");
            System.out.println(playersName[iteration] + " can build houses on \"Light Blue\" Neighborhood");
        }
        if (fields[1][11].equals(playersName[iteration]) && fields[1][13].equals(playersName[iteration]) && fields[1][14].equals(playersName[iteration])) {
            buildHouseEnabled.add("Pink");
            System.out.println(playersName[iteration] + " can build houses on \"Pink\" Neighborhood");
        }
        if (fields[1][16].equals(playersName[iteration]) && fields[1][18].equals(playersName[iteration]) && fields[1][19].equals(playersName[iteration])) {
            buildHouseEnabled.add("Orange");
            System.out.println(playersName[iteration] + " can build houses on \"Orange\" Neighborhood");
        }
        if (fields[1][21].equals(playersName[iteration]) && fields[1][23].equals(playersName[iteration]) && fields[1][24].equals(playersName[iteration])) {
            buildHouseEnabled.add("Red");
            System.out.println(playersName[iteration] + " can build houses on \"Red\" Neighborhood");
        }
        if (fields[1][26].equals(playersName[iteration]) && fields[1][27].equals(playersName[iteration]) && fields[1][29].equals(playersName[iteration])) {
            buildHouseEnabled.add("Yellow");
            System.out.println(playersName[iteration] + " can build houses on \"Yellow\" Neighborhood");
        }
        if (fields[1][31].equals(playersName[iteration]) && fields[1][32].equals(playersName[iteration]) && fields[1][34].equals(playersName[iteration])) {
            buildHouseEnabled.add("Green");
            System.out.println(playersName[iteration] + " can build houses on \"Green\" Neighborhood");
        }
        if (fields[1][37].equals(playersName[iteration]) && fields[1][38].equals(playersName[iteration])) {
            buildHouseEnabled.add("Blue");
            System.out.println(playersName[iteration] + " can build houses on \"Blue\" Neighborhood");
        }
        return buildHouseEnabled;
    }

    public static void checkIfNeighborHoodIsEnabled(ArrayList<String> buildHouseEnabled, String[][] fields, String[] playersName, int[] playersMoney, int iteration) {
        if (!(buildHouseEnabled.isEmpty())) {

            System.out.println("Do you want to build houses?");
            System.out.print("Yes/No-> ");
            Scanner sc = new Scanner(System.in);
            String q = sc.next().toLowerCase();
            switch (q) {
                case "yes" -> {
                    buildHouses(buildHouseEnabled, fields, playersName, playersMoney, iteration);
                }
                case "no" -> {
//      HAVE TO FILL IN NO
                    System.out.println();
                }
                default ->
                        checkIfNeighborHoodIsEnabled(buildHouseEnabled, fields, playersName, playersMoney, iteration);
            }
        }
    }

    public static void buildHouses(ArrayList<String> buildHouseEnabled, String[][] fields, String[] playersName, int[] playersMoney, int iteration) {
        Scanner sc = new Scanner(System.in);
        int houseCounter = 0;
        if (buildHouseEnabled.size() > 1) {
            System.out.print("choose neighborhood-> ");
            String q = sc.nextLine().toLowerCase();

            switch (q) {
                case "brown" -> {
                    System.out.println("1.\"" + fields[0][1] + "\"-> " + fields[5][1] + " houses, can build " + (4 - Integer.parseInt(fields[5][1])) + " houses;");
                    System.out.println("2.\"" + fields[0][3] + "\"-> " + fields[5][3] + " houses, can build " + (4 - Integer.parseInt(fields[5][3])) + " houses;");
                    System.out.println();
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 50) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 50) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][1] + "\"-> " + fields[5][1] + " houses, can build " + (4 - Integer.parseInt(fields[5][1])) + " houses;");
                        System.out.println("2.\"" + fields[0][3] + "\"-> " + fields[5][3] + " houses, can build " + (4 - Integer.parseInt(fields[5][3])) + " houses;");
                        System.out.print("Choose number 1 or 2-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][1]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][1])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][1] = String.valueOf(Integer.parseInt(fields[5][1]) + houseCounter);
                                if (Integer.parseInt(fields[5][1]) == 1) {
                                    fields[3][1] = "10";
                                } else if (Integer.parseInt(fields[5][1]) == 2) {
                                    fields[3][1] = "30";
                                } else if (Integer.parseInt(fields[5][1]) == 3) {
                                    fields[3][1] = "90";
                                } else if (Integer.parseInt(fields[5][1]) == 4) {
                                    fields[3][1] = "160";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][1] + "\" is now increased to " + fields[3][1] + "$ -> " + Integer.parseInt(fields[5][1]) + " houses");

                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][3]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][3])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][3] = String.valueOf(Integer.parseInt(fields[5][3]) + houseCounter);
                                if (Integer.parseInt(fields[5][3]) == 1) {
                                    fields[3][3] = "20";
                                } else if (Integer.parseInt(fields[5][3]) == 2) {
                                    fields[3][3] = "60";
                                } else if (Integer.parseInt(fields[5][3]) == 3) {
                                    fields[3][3] = "180";
                                } else if (Integer.parseInt(fields[5][3]) == 4) {
                                    fields[3][3] = "320";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][3] + "\" is now increased to " + fields[3][3] + " -> " + Integer.parseInt(fields[5][3]) + " houses");

                            }
                        }
                    }
                }
                case "light blue" -> {
                    System.out.println("1.\"" + fields[0][6] + "\"-> " + fields[5][6] + " houses, can build " + (4 - Integer.parseInt(fields[5][6])) + " houses;");
                    System.out.println("2.\"" + fields[0][8] + "\"-> " + fields[5][8] + " houses, can build " + (4 - Integer.parseInt(fields[5][8])) + " houses;");
                    System.out.println("3.\"" + fields[0][9] + "\"-> " + fields[5][9] + " houses, can build " + (4 - Integer.parseInt(fields[5][9])) + " houses;");
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 50) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 50) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][6] + "\"-> " + fields[5][6] + " houses, can build " + (4 - Integer.parseInt(fields[5][6])) + " houses;");
                        System.out.println("2.\"" + fields[0][8] + "\"-> " + fields[5][8] + " houses, can build " + (4 - Integer.parseInt(fields[5][8])) + " houses;");
                        System.out.println("3.\"" + fields[0][9] + "\"-> " + fields[5][9] + " houses, can build " + (4 - Integer.parseInt(fields[5][9])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][6]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][6])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][6] = String.valueOf(Integer.parseInt(fields[5][6]) + houseCounter);
                                if (Integer.parseInt(fields[5][6]) == 1) {
                                    fields[3][6] = "30";
                                } else if (Integer.parseInt(fields[5][6]) == 2) {
                                    fields[3][6] = "90";
                                } else if (Integer.parseInt(fields[5][6]) == 3) {
                                    fields[3][6] = "270";
                                } else if (Integer.parseInt(fields[5][6]) == 4) {
                                    fields[3][6] = "400";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][6] + "\" is now increased to " + fields[3][6] + " -> " + Integer.parseInt(fields[5][6]) + " houses");

                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][8]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][8])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][8] = String.valueOf(Integer.parseInt(fields[5][8]) + houseCounter);
                                if (Integer.parseInt(fields[5][8]) == 1) {
                                    fields[3][8] = "30";
                                } else if (Integer.parseInt(fields[5][8]) == 2) {
                                    fields[3][8] = "90";
                                } else if (Integer.parseInt(fields[5][8]) == 3) {
                                    fields[3][8] = "270";
                                } else if (Integer.parseInt(fields[5][8]) == 4) {
                                    fields[3][8] = "400";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][8] + "\" is now increased to " + fields[3][8] + " -> " + Integer.parseInt(fields[5][8]) + " houses");

                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][9]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][9])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][9] = String.valueOf(Integer.parseInt(fields[5][9]) + houseCounter);
                                if (Integer.parseInt(fields[5][9]) == 1) {
                                    fields[3][9] = "40";
                                } else if (Integer.parseInt(fields[5][9]) == 2) {
                                    fields[3][9] = "100";
                                } else if (Integer.parseInt(fields[5][9]) == 3) {
                                    fields[3][9] = "300";
                                } else if (Integer.parseInt(fields[5][9]) == 4) {
                                    fields[3][9] = "450";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][9] + "\" is now increased to " + fields[3][9] + " -> " + Integer.parseInt(fields[5][9]) + " houses");
                            }
                        }
                    }
                }
                case "pink" -> {
                    System.out.println("1.\"" + fields[0][11] + "\"-> " + fields[5][11] + " houses, can build " + (4 - Integer.parseInt(fields[5][11])) + " houses;");
                    System.out.println("2.\"" + fields[0][13] + "\"-> " + fields[5][13] + " houses, can build " + (4 - Integer.parseInt(fields[5][13])) + " houses;");
                    System.out.println("3.\"" + fields[0][14] + "\"-> " + fields[5][14] + " houses, can build " + (4 - Integer.parseInt(fields[5][14])) + " houses;");
                    System.out.println("The price of 1 House is 100$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 100) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 100) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][11] + "\"-> " + fields[5][11] + " houses, can build " + (4 - Integer.parseInt(fields[5][11])) + " houses;");
                        System.out.println("2.\"" + fields[0][13] + "\"-> " + fields[5][13] + " houses, can build " + (4 - Integer.parseInt(fields[5][13])) + " houses;");
                        System.out.println("3.\"" + fields[0][14] + "\"-> " + fields[5][14] + " houses, can build " + (4 - Integer.parseInt(fields[5][14])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][11]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][11])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][11] = String.valueOf(Integer.parseInt(fields[5][11]) + houseCounter);
                                if (Integer.parseInt(fields[5][11]) == 1) {
                                    fields[3][11] = "50";
                                } else if (Integer.parseInt(fields[5][11]) == 2) {
                                    fields[3][11] = "150";
                                } else if (Integer.parseInt(fields[5][11]) == 3) {
                                    fields[3][11] = "450";
                                } else if (Integer.parseInt(fields[5][11]) == 4) {
                                    fields[3][11] = "625";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][11] + "\" is now increased to " + fields[3][11] + " -> " + Integer.parseInt(fields[5][11]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][13]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][13])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][13] = String.valueOf(Integer.parseInt(fields[5][13]) + houseCounter);
                                if (Integer.parseInt(fields[5][13]) == 1) {
                                    fields[3][13] = "50";
                                } else if (Integer.parseInt(fields[5][13]) == 2) {
                                    fields[3][13] = "150";
                                } else if (Integer.parseInt(fields[5][13]) == 3) {
                                    fields[3][13] = "450";
                                } else if (Integer.parseInt(fields[5][13]) == 4) {
                                    fields[3][13] = "625";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][13] + "\" is now increased to " + fields[3][13] + " -> " + Integer.parseInt(fields[5][13]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][14]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][14])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][14] = String.valueOf(Integer.parseInt(fields[5][14]) + houseCounter);
                                if (Integer.parseInt(fields[5][14]) == 1) {
                                    fields[3][14] = "60";
                                } else if (Integer.parseInt(fields[5][14]) == 2) {
                                    fields[3][14] = "180";
                                } else if (Integer.parseInt(fields[5][14]) == 3) {
                                    fields[3][14] = "500";
                                } else if (Integer.parseInt(fields[5][14]) == 4) {
                                    fields[3][14] = "700";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][14] + "\" is now increased to " + fields[3][14] + " -> " + Integer.parseInt(fields[5][14]) + " houses");
                            }
                        }
                    }
                }
                case "orange" -> {
                    System.out.println("1.\"" + fields[0][16] + "\"-> " + fields[5][16] + " houses, can build " + (4 - Integer.parseInt(fields[5][16])) + " houses;");
                    System.out.println("2.\"" + fields[0][18] + "\"-> " + fields[5][18] + " houses, can build " + (4 - Integer.parseInt(fields[5][18])) + " houses;");
                    System.out.println("3.\"" + fields[0][19] + "\"-> " + fields[5][19] + " houses, can build " + (4 - Integer.parseInt(fields[5][19])) + " houses;");
                    System.out.println("The price of 1 House is 100$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 100) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 100) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][16] + "\"-> " + fields[5][16] + " houses, can build " + (4 - Integer.parseInt(fields[5][16])) + " houses;");
                        System.out.println("2.\"" + fields[0][18] + "\"-> " + fields[5][18] + " houses, can build " + (4 - Integer.parseInt(fields[5][18])) + " houses;");
                        System.out.println("3.\"" + fields[0][19] + "\"-> " + fields[5][19] + " houses, can build " + (4 - Integer.parseInt(fields[5][19])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][16]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][16])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][16] = String.valueOf(Integer.parseInt(fields[5][16]) + houseCounter);
                                if (Integer.parseInt(fields[5][16]) == 1) {
                                    fields[3][16] = "70";
                                } else if (Integer.parseInt(fields[5][16]) == 2) {
                                    fields[3][16] = "200";
                                } else if (Integer.parseInt(fields[5][16]) == 3) {
                                    fields[3][16] = "550";
                                } else if (Integer.parseInt(fields[5][16]) == 4) {
                                    fields[3][16] = "750";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][16] + "\" is now increased to " + fields[3][16] + " -> " + Integer.parseInt(fields[5][16]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][18]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][18])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][18] = String.valueOf(Integer.parseInt(fields[5][18]) + houseCounter);
                                if (Integer.parseInt(fields[5][18]) == 1) {
                                    fields[3][18] = "70";
                                } else if (Integer.parseInt(fields[5][18]) == 2) {
                                    fields[3][18] = "200";
                                } else if (Integer.parseInt(fields[5][18]) == 3) {
                                    fields[3][18] = "550";
                                } else if (Integer.parseInt(fields[5][18]) == 4) {
                                    fields[3][18] = "750";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][18] + "\" is now increased to " + fields[3][18] + " -> " + Integer.parseInt(fields[5][18]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][19]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][19])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][19] = String.valueOf(Integer.parseInt(fields[5][19]) + houseCounter);
                                if (Integer.parseInt(fields[5][19]) == 1) {
                                    fields[3][19] = "70";
                                } else if (Integer.parseInt(fields[5][19]) == 2) {
                                    fields[3][19] = "200";
                                } else if (Integer.parseInt(fields[5][19]) == 3) {
                                    fields[3][19] = "550";
                                } else if (Integer.parseInt(fields[5][19]) == 4) {
                                    fields[3][19] = "750";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][19] + "\" is now increased to " + fields[3][19] + " -> " + Integer.parseInt(fields[5][19]) + " houses");
                            }
                        }
                    }
                }
                case "red" -> {
                    System.out.println("1.\"" + fields[0][21] + "\"-> " + fields[5][21] + " houses, can build " + (4 - Integer.parseInt(fields[5][21])) + " houses;");
                    System.out.println("2.\"" + fields[0][23] + "\"-> " + fields[5][23] + " houses, can build " + (4 - Integer.parseInt(fields[5][23])) + " houses;");
                    System.out.println("3.\"" + fields[0][24] + "\"-> " + fields[5][24] + " houses, can build " + (4 - Integer.parseInt(fields[5][24])) + " houses;");
                    System.out.println("The price of 1 House is 150$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 150) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 150) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][21] + "\"-> " + fields[5][21] + " houses, can build " + (4 - Integer.parseInt(fields[5][21])) + " houses;");
                        System.out.println("2.\"" + fields[0][23] + "\"-> " + fields[5][23] + " houses, can build " + (4 - Integer.parseInt(fields[5][23])) + " houses;");
                        System.out.println("3.\"" + fields[0][24] + "\"-> " + fields[5][24] + " houses, can build " + (4 - Integer.parseInt(fields[5][24])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][21]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][21])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][21] = String.valueOf(Integer.parseInt(fields[5][21]) + houseCounter);
                                if (Integer.parseInt(fields[5][21]) == 1) {
                                    fields[3][21] = "90";
                                } else if (Integer.parseInt(fields[5][21]) == 2) {
                                    fields[3][21] = "250";
                                } else if (Integer.parseInt(fields[5][21]) == 3) {
                                    fields[3][21] = "700";
                                } else if (Integer.parseInt(fields[5][21]) == 4) {
                                    fields[3][21] = "875";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][21] + "\" is now increased to " + fields[3][21] + " -> " + Integer.parseInt(fields[5][21]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][23]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][23])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][23] = String.valueOf(Integer.parseInt(fields[5][23]) + houseCounter);
                                if (Integer.parseInt(fields[5][23]) == 1) {
                                    fields[3][23] = "90";
                                } else if (Integer.parseInt(fields[5][23]) == 2) {
                                    fields[3][23] = "250";
                                } else if (Integer.parseInt(fields[5][23]) == 3) {
                                    fields[3][23] = "700";
                                } else if (Integer.parseInt(fields[5][23]) == 4) {
                                    fields[3][23] = "875";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][23] + "\" is now increased to " + fields[3][23] + " -> " + Integer.parseInt(fields[5][23]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][24]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][24])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][23] = String.valueOf(Integer.parseInt(fields[5][24]) + houseCounter);
                                if (Integer.parseInt(fields[5][24]) == 1) {
                                    fields[3][24] = "90";
                                } else if (Integer.parseInt(fields[5][24]) == 2) {
                                    fields[3][24] = "250";
                                } else if (Integer.parseInt(fields[5][24]) == 3) {
                                    fields[3][24] = "700";
                                } else if (Integer.parseInt(fields[5][24]) == 4) {
                                    fields[3][24] = "875";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][24] + "\" is now increased to " + fields[3][24] + " -> " + Integer.parseInt(fields[5][24]) + " houses");
                            }
                        }
                    }
                }
                case "yellow" -> {
                    System.out.println("1.\"" + fields[0][26] + "\"-> " + fields[5][26] + " houses, can build " + (4 - Integer.parseInt(fields[5][26])) + " houses;");
                    System.out.println("2.\"" + fields[0][27] + "\"-> " + fields[5][27] + " houses, can build " + (4 - Integer.parseInt(fields[5][27])) + " houses;");
                    System.out.println("3.\"" + fields[0][29] + "\"-> " + fields[5][29] + " houses, can build " + (4 - Integer.parseInt(fields[5][29])) + " houses;");
                    System.out.println("The price of 1 House is 150$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 150) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 150) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][26] + "\"-> " + fields[5][26] + " houses, can build " + (4 - Integer.parseInt(fields[5][26])) + " houses;");
                        System.out.println("2.\"" + fields[0][27] + "\"-> " + fields[5][27] + " houses, can build " + (4 - Integer.parseInt(fields[5][27])) + " houses;");
                        System.out.println("3.\"" + fields[0][29] + "\"-> " + fields[5][29] + " houses, can build " + (4 - Integer.parseInt(fields[5][29])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][26]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][26])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][26] = String.valueOf(Integer.parseInt(fields[5][26]) + houseCounter);
                                if (Integer.parseInt(fields[5][26]) == 1) {
                                    fields[3][26] = "110";
                                } else if (Integer.parseInt(fields[5][26]) == 2) {
                                    fields[3][26] = "330";
                                } else if (Integer.parseInt(fields[5][26]) == 3) {
                                    fields[3][26] = "800";
                                } else if (Integer.parseInt(fields[5][26]) == 4) {
                                    fields[3][26] = "975";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][26] + "\" is now increased to " + fields[3][26] + " -> " + Integer.parseInt(fields[5][26]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][27]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][27])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][27] = String.valueOf(Integer.parseInt(fields[5][27]) + houseCounter);
                                if (Integer.parseInt(fields[5][27]) == 1) {
                                    fields[3][27] = "110";
                                } else if (Integer.parseInt(fields[5][27]) == 2) {
                                    fields[3][27] = "330";
                                } else if (Integer.parseInt(fields[5][27]) == 3) {
                                    fields[3][27] = "800";
                                } else if (Integer.parseInt(fields[5][27]) == 4) {
                                    fields[3][27] = "975";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][27] + "\" is now increased to " + fields[3][27] + " -> " + Integer.parseInt(fields[5][27]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][29]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][29])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][29] = String.valueOf(Integer.parseInt(fields[5][29]) + houseCounter);
                                if (Integer.parseInt(fields[5][29]) == 1) {
                                    fields[3][29] = "120";
                                } else if (Integer.parseInt(fields[5][29]) == 2) {
                                    fields[3][29] = "360";
                                } else if (Integer.parseInt(fields[5][29]) == 3) {
                                    fields[3][29] = "850";
                                } else if (Integer.parseInt(fields[5][29]) == 4) {
                                    fields[3][29] = "1025";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][29] + "\" is now increased to " + fields[3][29] + " -> " + Integer.parseInt(fields[5][29]) + " houses");
                            }
                        }
                    }
                }
                case "green" -> {
                    System.out.println("1.\"" + fields[0][31] + "\"-> " + fields[5][31] + " houses, can build " + (4 - Integer.parseInt(fields[5][31])) + " houses;");
                    System.out.println("2.\"" + fields[0][32] + "\"-> " + fields[5][32] + " houses, can build " + (4 - Integer.parseInt(fields[5][32])) + " houses;");
                    System.out.println("3.\"" + fields[0][34] + "\"-> " + fields[5][34] + " houses, can build " + (4 - Integer.parseInt(fields[5][34])) + " houses;");
                    System.out.println("The price of 1 House is 200$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 200) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 200) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][31] + "\"-> " + fields[5][31] + " houses, can build " + (4 - Integer.parseInt(fields[5][31])) + " houses;");
                        System.out.println("2.\"" + fields[0][32] + "\"-> " + fields[5][32] + " houses, can build " + (4 - Integer.parseInt(fields[5][32])) + " houses;");
                        System.out.println("3.\"" + fields[0][34] + "\"-> " + fields[5][34] + " houses, can build " + (4 - Integer.parseInt(fields[5][34])) + " houses;");
                        System.out.println("The price of 1 House is 200$");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][31]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][31])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][31] = String.valueOf(Integer.parseInt(fields[5][31]) + houseCounter);
                                if (Integer.parseInt(fields[5][31]) == 1) {
                                    fields[3][31] = "130";
                                } else if (Integer.parseInt(fields[5][31]) == 2) {
                                    fields[3][31] = "390";
                                } else if (Integer.parseInt(fields[5][31]) == 3) {
                                    fields[3][31] = "900";
                                } else if (Integer.parseInt(fields[5][31]) == 4) {
                                    fields[3][31] = "1100";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][31] + "\" is now increased to " + fields[3][31] + " -> " + Integer.parseInt(fields[5][31]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][32]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][32])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][32] = String.valueOf(Integer.parseInt(fields[5][32]) + houseCounter);
                                if (Integer.parseInt(fields[5][32]) == 1) {
                                    fields[3][32] = "130";
                                } else if (Integer.parseInt(fields[5][32]) == 2) {
                                    fields[3][32] = "390";
                                } else if (Integer.parseInt(fields[5][32]) == 3) {
                                    fields[3][32] = "900";
                                } else if (Integer.parseInt(fields[5][32]) == 4) {
                                    fields[3][32] = "1100";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][32] + "\" is now increased to " + fields[3][32] + " -> " + Integer.parseInt(fields[5][32]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][34]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][34])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][34] = String.valueOf(Integer.parseInt(fields[5][34]) + houseCounter);
                                if (Integer.parseInt(fields[5][34]) == 1) {
                                    fields[3][34] = "150";
                                } else if (Integer.parseInt(fields[5][34]) == 2) {
                                    fields[3][34] = "450";
                                } else if (Integer.parseInt(fields[5][34]) == 3) {
                                    fields[3][34] = "1000";
                                } else if (Integer.parseInt(fields[5][34]) == 4) {
                                    fields[3][34] = "1200";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][34] + "\" is now increased to " + fields[3][34] + " -> " + Integer.parseInt(fields[5][34]) + " houses");
                            }
                        }
                    }
                }
                case "blue" -> {
                    System.out.println("1.\"" + fields[0][37] + "\"-> " + fields[5][37] + " houses, can build " + (4 - Integer.parseInt(fields[5][37])) + " houses;");
                    System.out.println("2.\"" + fields[0][39] + "\"-> " + fields[5][39] + " houses, can build " + (4 - Integer.parseInt(fields[5][39])) + " houses;");
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 200) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 200) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][37] + "\"-> " + fields[5][37] + " houses, can build " + (4 - Integer.parseInt(fields[5][37])) + " houses;");
                        System.out.println("2.\"" + fields[0][39] + "\"-> " + fields[5][39] + " houses, can build " + (4 - Integer.parseInt(fields[5][39])) + " houses;");
                        System.out.print("Choose number 1 or 2-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][37]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][37])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][37] = String.valueOf(Integer.parseInt(fields[5][37]) + houseCounter);
                                if (Integer.parseInt(fields[5][37]) == 1) {
                                    fields[3][37] = "175";
                                } else if (Integer.parseInt(fields[5][37]) == 2) {
                                    fields[3][37] = "500";
                                } else if (Integer.parseInt(fields[5][37]) == 3) {
                                    fields[3][37] = "1100";
                                } else if (Integer.parseInt(fields[5][37]) == 4) {
                                    fields[3][37] = "1300";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][37] + "\" is now increased to " + fields[3][37] + " -> " + Integer.parseInt(fields[5][37]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][39]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][39])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][39] = String.valueOf(Integer.parseInt(fields[5][39]) + houseCounter);
                                if (Integer.parseInt(fields[5][39]) == 1) {
                                    fields[3][39] = "175";
                                } else if (Integer.parseInt(fields[5][39]) == 2) {
                                    fields[3][39] = "500";
                                } else if (Integer.parseInt(fields[5][39]) == 3) {
                                    fields[3][39] = "1100";
                                } else if (Integer.parseInt(fields[5][39]) == 4) {
                                    fields[3][39] = "1300";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][39] + "\" is now increased to " + fields[3][39] + " -> " + Integer.parseInt(fields[5][39]) + " houses");
                            }
                        }

                    }
                }
            }
        } else {
            switch (buildHouseEnabled.get(0)) {
                case "Brown" -> {
                    System.out.println("1.\"" + fields[0][1] + "\"-> " + fields[5][1] + " houses, can build " + (4 - Integer.parseInt(fields[5][1])) + " houses;");
                    System.out.println("2.\"" + fields[0][3] + "\"-> " + fields[5][3] + " houses, can build " + (4 - Integer.parseInt(fields[5][3])) + " houses;");
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 50) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 50) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][1] + "\"-> " + fields[5][1] + " houses, can build " + (4 - Integer.parseInt(fields[5][1])) + " houses;");
                        System.out.println("2.\"" + fields[0][3] + "\"-> " + fields[5][3] + " houses, can build " + (4 - Integer.parseInt(fields[5][3])) + " houses;");
                        System.out.print("Choose number 1 or 2-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][1]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][1])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][1] = String.valueOf(Integer.parseInt(fields[5][1]) + houseCounter);
                                if (Integer.parseInt(fields[5][1]) == 1) {
                                    fields[3][1] = "10";
                                } else if (Integer.parseInt(fields[5][1]) == 2) {
                                    fields[3][1] = "30";
                                } else if (Integer.parseInt(fields[5][1]) == 3) {
                                    fields[3][1] = "90";
                                } else if (Integer.parseInt(fields[5][1]) == 4) {
                                    fields[3][1] = "160";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][1] + "\" is now increased to " + fields[3][1] + "$ -> " + Integer.parseInt(fields[5][1]) + " houses");

                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][3]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][3])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][1] = String.valueOf(Integer.parseInt(fields[5][1]) + houseCounter);
                                if (Integer.parseInt(fields[5][3]) == 1) {
                                    fields[3][3] = "20";
                                } else if (Integer.parseInt(fields[5][3]) == 2) {
                                    fields[3][3] = "60";
                                } else if (Integer.parseInt(fields[5][3]) == 3) {
                                    fields[3][3] = "180";
                                } else if (Integer.parseInt(fields[5][3]) == 4) {
                                    fields[3][3] = "320";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][3] + "\" is now increased to " + fields[3][3] + " -> " + Integer.parseInt(fields[5][3]) + " houses");
                            }
                        }

                    }
                }
                case "Light Blue" -> {
                    System.out.println("1.\"" + fields[0][6] + "\"-> " + fields[5][6] + " houses, can build " + (4 - Integer.parseInt(fields[5][6])) + " houses;");
                    System.out.println("2.\"" + fields[0][8] + "\"-> " + fields[5][8] + " houses, can build " + (4 - Integer.parseInt(fields[5][8])) + " houses;");
                    System.out.println("3.\"" + fields[0][9] + "\"-> " + fields[5][9] + " houses, can build " + (4 - Integer.parseInt(fields[5][9])) + " houses;");
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 50) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 50) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][6] + "\"-> " + fields[5][6] + " houses, can build " + (4 - Integer.parseInt(fields[5][6])) + " houses;");
                        System.out.println("2.\"" + fields[0][8] + "\"-> " + fields[5][8] + " houses, can build " + (4 - Integer.parseInt(fields[5][8])) + " houses;");
                        System.out.println("3.\"" + fields[0][9] + "\"-> " + fields[5][9] + " houses, can build " + (4 - Integer.parseInt(fields[5][9])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][6]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][6])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][6] = String.valueOf(Integer.parseInt(fields[5][6]) + houseCounter);
                                if (Integer.parseInt(fields[5][6]) == 1) {
                                    fields[3][6] = "30";
                                } else if (Integer.parseInt(fields[5][6]) == 2) {
                                    fields[3][6] = "90";
                                } else if (Integer.parseInt(fields[5][6]) == 3) {
                                    fields[3][6] = "270";
                                } else if (Integer.parseInt(fields[5][6]) == 4) {
                                    fields[3][6] = "400";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][6] + "\" is now increased to " + fields[3][6] + " -> " + Integer.parseInt(fields[5][6]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][8]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][8])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][8] = String.valueOf(Integer.parseInt(fields[5][8]) + houseCounter);
                                if (Integer.parseInt(fields[5][8]) == 1) {
                                    fields[3][8] = "30";
                                } else if (Integer.parseInt(fields[5][8]) == 2) {
                                    fields[3][8] = "90";
                                } else if (Integer.parseInt(fields[5][8]) == 3) {
                                    fields[3][8] = "270";
                                } else if (Integer.parseInt(fields[5][8]) == 4) {
                                    fields[3][8] = "400";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][8] + "\" is now increased to " + fields[3][8] + " -> " + Integer.parseInt(fields[5][8]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][9]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][9])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][9] = String.valueOf(Integer.parseInt(fields[5][9]) + houseCounter);
                                if (Integer.parseInt(fields[5][9]) == 1) {
                                    fields[3][9] = "40";
                                } else if (Integer.parseInt(fields[5][9]) == 2) {
                                    fields[3][9] = "100";
                                } else if (Integer.parseInt(fields[5][9]) == 3) {
                                    fields[3][9] = "300";
                                } else if (Integer.parseInt(fields[5][9]) == 4) {
                                    fields[3][9] = "450";
                                }
                                playersMoney[iteration] -= houseCounter * 50;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][9] + "\" is now increased to " + fields[3][9] + " -> " + Integer.parseInt(fields[5][9]) + " houses");
                            }
                        }

                    }
                }
                case "Pink" -> {
                    System.out.println("1.\"" + fields[0][11] + "\"-> " + fields[5][11] + " houses, can build " + (4 - Integer.parseInt(fields[5][11])) + " houses;");
                    System.out.println("2.\"" + fields[0][13] + "\"-> " + fields[5][13] + " houses, can build " + (4 - Integer.parseInt(fields[5][13])) + " houses;");
                    System.out.println("3.\"" + fields[0][14] + "\"-> " + fields[5][14] + " houses, can build " + (4 - Integer.parseInt(fields[5][14])) + " houses;");
                    System.out.println("The price of 1 House is 100$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 100) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 100) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][11] + "\"-> " + fields[5][11] + " houses, can build " + (4 - Integer.parseInt(fields[5][11])) + " houses;");
                        System.out.println("2.\"" + fields[0][13] + "\"-> " + fields[5][13] + " houses, can build " + (4 - Integer.parseInt(fields[5][13])) + " houses;");
                        System.out.println("3.\"" + fields[0][14] + "\"-> " + fields[5][14] + " houses, can build " + (4 - Integer.parseInt(fields[5][14])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][11]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][11])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][11] = String.valueOf(Integer.parseInt(fields[5][11]) + houseCounter);
                                if (Integer.parseInt(fields[5][11]) == 1) {
                                    fields[3][11] = "50";
                                } else if (Integer.parseInt(fields[5][11]) == 2) {
                                    fields[3][11] = "150";
                                } else if (Integer.parseInt(fields[5][11]) == 3) {
                                    fields[3][11] = "450";
                                } else if (Integer.parseInt(fields[5][11]) == 4) {
                                    fields[3][11] = "625";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][11] + "\" is now increased to " + fields[3][11] + " -> " + Integer.parseInt(fields[5][11]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][13]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][13])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][13] = String.valueOf(Integer.parseInt(fields[5][13]) + houseCounter);
                                if (Integer.parseInt(fields[5][13]) == 1) {
                                    fields[3][13] = "50";
                                } else if (Integer.parseInt(fields[5][13]) == 2) {
                                    fields[3][13] = "150";
                                } else if (Integer.parseInt(fields[5][13]) == 3) {
                                    fields[3][13] = "450";
                                } else if (Integer.parseInt(fields[5][13]) == 4) {
                                    fields[3][13] = "625";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][13] + "\" is now increased to " + fields[3][13] + " -> " + Integer.parseInt(fields[5][13]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][14]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][14])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][14] = String.valueOf(Integer.parseInt(fields[5][14]) + houseCounter);
                                if (Integer.parseInt(fields[5][14]) == 1) {
                                    fields[3][14] = "60";
                                } else if (Integer.parseInt(fields[5][14]) == 2) {
                                    fields[3][14] = "180";
                                } else if (Integer.parseInt(fields[5][14]) == 3) {
                                    fields[3][14] = "500";
                                } else if (Integer.parseInt(fields[5][14]) == 4) {
                                    fields[3][14] = "700";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][14] + "\" is now increased to " + fields[3][14] + " -> " + Integer.parseInt(fields[5][14]) + " houses");
                            }
                        }
                    }
                }
                case "Orange" -> {
                    System.out.println("1.\"" + fields[0][16] + "\"-> " + fields[5][16] + " houses, can build " + (4 - Integer.parseInt(fields[5][16])) + " houses;");
                    System.out.println("2.\"" + fields[0][18] + "\"-> " + fields[5][18] + " houses, can build " + (4 - Integer.parseInt(fields[5][18])) + " houses;");
                    System.out.println("3.\"" + fields[0][19] + "\"-> " + fields[5][19] + " houses, can build " + (4 - Integer.parseInt(fields[5][19])) + " houses;");
                    System.out.println("The price of 1 House is 100$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 100) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 100) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][16] + "\"-> " + fields[5][16] + " houses, can build " + (4 - Integer.parseInt(fields[5][16])) + " houses;");
                        System.out.println("2.\"" + fields[0][18] + "\"-> " + fields[5][18] + " houses, can build " + (4 - Integer.parseInt(fields[5][18])) + " houses;");
                        System.out.println("3.\"" + fields[0][19] + "\"-> " + fields[5][19] + " houses, can build " + (4 - Integer.parseInt(fields[5][19])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][16]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][16])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][16] = String.valueOf(Integer.parseInt(fields[5][16]) + houseCounter);
                                if (Integer.parseInt(fields[5][16]) == 1) {
                                    fields[3][16] = "70";
                                } else if (Integer.parseInt(fields[5][16]) == 2) {
                                    fields[3][16] = "200";
                                } else if (Integer.parseInt(fields[5][16]) == 3) {
                                    fields[3][16] = "550";
                                } else if (Integer.parseInt(fields[5][16]) == 4) {
                                    fields[3][16] = "750";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][16] + "\" is now increased to " + fields[3][16] + " -> " + Integer.parseInt(fields[5][16]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][18]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][18])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][18] = String.valueOf(Integer.parseInt(fields[5][18]) + houseCounter);
                                if (Integer.parseInt(fields[5][18]) == 1) {
                                    fields[3][18] = "70";
                                } else if (Integer.parseInt(fields[5][18]) == 2) {
                                    fields[3][18] = "200";
                                } else if (Integer.parseInt(fields[5][18]) == 3) {
                                    fields[3][18] = "550";
                                } else if (Integer.parseInt(fields[5][18]) == 4) {
                                    fields[3][18] = "750";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][18] + "\" is now increased to " + fields[3][18] + " -> " + Integer.parseInt(fields[5][18]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][19]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][19])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][19] = String.valueOf(Integer.parseInt(fields[5][19]) + houseCounter);
                                if (Integer.parseInt(fields[5][19]) == 1) {
                                    fields[3][19] = "80";
                                } else if (Integer.parseInt(fields[5][19]) == 2) {
                                    fields[3][19] = "220";
                                } else if (Integer.parseInt(fields[5][19]) == 3) {
                                    fields[3][19] = "600";
                                } else if (Integer.parseInt(fields[5][19]) == 4) {
                                    fields[3][19] = "800";
                                }
                                playersMoney[iteration] -= houseCounter * 100;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][19] + "\" is now increased to " + fields[3][19] + " -> " + Integer.parseInt(fields[5][19]) + " houses");
                            }
                        }
                    }
                }
                case "Red" -> {
                    System.out.println("1.\"" + fields[0][21] + "\"-> " + fields[5][21] + " houses, can build " + (4 - Integer.parseInt(fields[5][21])) + " houses;");
                    System.out.println("2.\"" + fields[0][23] + "\"-> " + fields[5][23] + " houses, can build " + (4 - Integer.parseInt(fields[5][23])) + " houses;");
                    System.out.println("3.\"" + fields[0][24] + "\"-> " + fields[5][24] + " houses, can build " + (4 - Integer.parseInt(fields[5][24])) + " houses;");
                    System.out.println("The price of 1 House is 150$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 150) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 150) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][21] + "\"-> " + fields[5][21] + " houses, can build " + (4 - Integer.parseInt(fields[5][21])) + " houses;");
                        System.out.println("2.\"" + fields[0][23] + "\"-> " + fields[5][23] + " houses, can build " + (4 - Integer.parseInt(fields[5][23])) + " houses;");
                        System.out.println("3.\"" + fields[0][24] + "\"-> " + fields[5][24] + " houses, can build " + (4 - Integer.parseInt(fields[5][24])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][21]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][21])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][21] = String.valueOf(Integer.parseInt(fields[5][21]) + houseCounter);
                                if (Integer.parseInt(fields[5][21]) == 1) {
                                    fields[3][21] = "90";
                                } else if (Integer.parseInt(fields[5][21]) == 2) {
                                    fields[3][21] = "250";
                                } else if (Integer.parseInt(fields[5][21]) == 3) {
                                    fields[3][21] = "700";
                                } else if (Integer.parseInt(fields[5][21]) == 4) {
                                    fields[3][21] = "875";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][21] + "\" is now increased to " + fields[3][21] + " -> " + Integer.parseInt(fields[5][21]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][23]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][23])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][23] = String.valueOf(Integer.parseInt(fields[5][23]) + houseCounter);
                                if (Integer.parseInt(fields[5][23]) == 1) {
                                    fields[3][23] = "90";
                                } else if (Integer.parseInt(fields[5][23]) == 2) {
                                    fields[3][23] = "250";
                                } else if (Integer.parseInt(fields[5][23]) == 3) {
                                    fields[3][23] = "700";
                                } else if (Integer.parseInt(fields[5][23]) == 4) {
                                    fields[3][23] = "875";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][23] + "\" is now increased to " + fields[3][23] + " -> " + Integer.parseInt(fields[5][23]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][24]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][24])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][24] = String.valueOf(Integer.parseInt(fields[5][24]) + houseCounter);
                                if (Integer.parseInt(fields[5][24]) == 1) {
                                    fields[3][24] = "100";
                                } else if (Integer.parseInt(fields[5][24]) == 2) {
                                    fields[3][24] = "300";
                                } else if (Integer.parseInt(fields[5][24]) == 3) {
                                    fields[3][24] = "750";
                                } else if (Integer.parseInt(fields[5][24]) == 4) {
                                    fields[3][24] = "925";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][24] + "\" is now increased to " + fields[3][24] + " -> " + Integer.parseInt(fields[5][24]) + " houses");
                            }
                        }
                    }
                }
                case "Yellow" -> {
                    System.out.println("1.\"" + fields[0][26] + "\"-> " + fields[5][26] + " houses, can build " + (4 - Integer.parseInt(fields[5][26])) + " houses;");
                    System.out.println("2.\"" + fields[0][27] + "\"-> " + fields[5][27] + " houses, can build " + (4 - Integer.parseInt(fields[5][27])) + " houses;");
                    System.out.println("3.\"" + fields[0][29] + "\"-> " + fields[5][29] + " houses, can build " + (4 - Integer.parseInt(fields[5][29])) + " houses;");
                    System.out.println("The price of 1 House is 150$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 150) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 150) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][26] + "\"-> " + fields[5][26] + " houses, can build " + (4 - Integer.parseInt(fields[5][26])) + " houses;");
                        System.out.println("2.\"" + fields[0][27] + "\"-> " + fields[5][27] + " houses, can build " + (4 - Integer.parseInt(fields[5][27])) + " houses;");
                        System.out.println("3.\"" + fields[0][29] + "\"-> " + fields[5][29] + " houses, can build " + (4 - Integer.parseInt(fields[5][29])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][26]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][26])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][26] = String.valueOf(Integer.parseInt(fields[5][26]) + houseCounter);
                                if (Integer.parseInt(fields[5][26]) == 1) {
                                    fields[3][26] = "110";
                                } else if (Integer.parseInt(fields[5][26]) == 2) {
                                    fields[3][26] = "330";
                                } else if (Integer.parseInt(fields[5][26]) == 3) {
                                    fields[3][26] = "800";
                                } else if (Integer.parseInt(fields[5][26]) == 4) {
                                    fields[3][26] = "975";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][26] + "\" is now increased to " + fields[3][26] + " -> " + Integer.parseInt(fields[5][26]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][27]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][27])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][27] = String.valueOf(Integer.parseInt(fields[5][27]) + houseCounter);
                                if (Integer.parseInt(fields[5][27]) == 1) {
                                    fields[3][27] = "110";
                                } else if (Integer.parseInt(fields[5][27]) == 2) {
                                    fields[3][27] = "330";
                                } else if (Integer.parseInt(fields[5][27]) == 3) {
                                    fields[3][27] = "800";
                                } else if (Integer.parseInt(fields[5][27]) == 4) {
                                    fields[3][27] = "975";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][27] + "\" is now increased to " + fields[3][27] + " -> " + Integer.parseInt(fields[5][27]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][29]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][29])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][29] = String.valueOf(Integer.parseInt(fields[5][29]) + houseCounter);
                                if (Integer.parseInt(fields[5][29]) == 1) {
                                    fields[3][29] = "110";
                                } else if (Integer.parseInt(fields[5][29]) == 2) {
                                    fields[3][29] = "330";
                                } else if (Integer.parseInt(fields[5][29]) == 3) {
                                    fields[3][29] = "800";
                                } else if (Integer.parseInt(fields[5][29]) == 4) {
                                    fields[3][29] = "975";
                                }
                                playersMoney[iteration] -= houseCounter * 150;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][29] + "\" is now increased to " + fields[3][29] + " -> " + Integer.parseInt(fields[5][29]) + " houses");
                            }
                        }
                    }
                }
                case "Green" -> {
                    System.out.println("1.\"" + fields[0][31] + "\"-> " + fields[5][31] + " houses, can build " + (4 - Integer.parseInt(fields[5][31])) + " houses;");
                    System.out.println("2.\"" + fields[0][32] + "\"-> " + fields[5][32] + " houses, can build " + (4 - Integer.parseInt(fields[5][32])) + " houses;");
                    System.out.println("3.\"" + fields[0][34] + "\"-> " + fields[5][34] + " houses, can build " + (4 - Integer.parseInt(fields[5][34])) + " houses;");
                    System.out.println("The price of 1 House is 200$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 200) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 200) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][31] + "\"-> " + fields[5][31] + " houses, can build " + (4 - Integer.parseInt(fields[5][31])) + " houses;");
                        System.out.println("2.\"" + fields[0][32] + "\"-> " + fields[5][32] + " houses, can build " + (4 - Integer.parseInt(fields[5][32])) + " houses;");
                        System.out.println("3.\"" + fields[0][34] + "\"-> " + fields[5][34] + " houses, can build " + (4 - Integer.parseInt(fields[5][34])) + " houses;");
                        System.out.print("Choose number 1 or 3-> ");
                        int n = sc.nextInt();
                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][31]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][31])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][31] = String.valueOf(Integer.parseInt(fields[5][31]) + houseCounter);
                                if (Integer.parseInt(fields[5][31]) == 1) {
                                    fields[3][31] = "130";
                                } else if (Integer.parseInt(fields[5][31]) == 2) {
                                    fields[3][31] = "390";
                                } else if (Integer.parseInt(fields[5][31]) == 3) {
                                    fields[3][31] = "900";
                                } else if (Integer.parseInt(fields[5][31]) == 4) {
                                    fields[3][31] = "1100";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][31] + "\" is now increased to " + fields[3][31] + " -> " + Integer.parseInt(fields[5][31]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][32]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][32])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][32] = String.valueOf(Integer.parseInt(fields[5][32]) + houseCounter);
                                if (Integer.parseInt(fields[5][32]) == 1) {
                                    fields[3][32] = "130";
                                } else if (Integer.parseInt(fields[5][32]) == 2) {
                                    fields[3][32] = "390";
                                } else if (Integer.parseInt(fields[5][32]) == 3) {
                                    fields[3][32] = "900";
                                } else if (Integer.parseInt(fields[5][32]) == 4) {
                                    fields[3][32] = "1100";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][32] + "\" is now increased to " + fields[3][32] + " -> " + Integer.parseInt(fields[5][32]) + " houses");
                            }
                            case 3 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][34]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][34])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][34] = String.valueOf(Integer.parseInt(fields[5][34]) + houseCounter);
                                if (Integer.parseInt(fields[5][34]) == 1) {
                                    fields[3][34] = "150";
                                } else if (Integer.parseInt(fields[5][34]) == 2) {
                                    fields[3][34] = "450";
                                } else if (Integer.parseInt(fields[5][34]) == 3) {
                                    fields[3][34] = "1000";
                                } else if (Integer.parseInt(fields[5][34]) == 4) {
                                    fields[3][34] = "1200";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][34] + "\" is now increased to " + fields[3][34] + " -> " + Integer.parseInt(fields[5][34]) + " houses");
                            }
                        }
                    }
                }
                case "Blue" -> {
                    System.out.println("1.\"" + fields[0][37] + "\"-> " + fields[5][37] + " houses, can build " + (4 - Integer.parseInt(fields[5][37])) + " houses;");
                    System.out.println("2.\"" + fields[0][39] + "\"-> " + fields[5][39] + " houses, can build " + (4 - Integer.parseInt(fields[5][39])) + " houses;");
                    System.out.println("The price of 1 House is 50$");
                    System.out.println("You have " + playersMoney[iteration] + "$ left in your Bank Account.");

                    System.out.println("How many houses you want to build?");
                    houseCounter = sc.nextInt();

                    if (playersMoney[iteration] < houseCounter * 50) {
                        System.out.println(playersName[iteration] + " you don't have enough money!");
                    } else if (playersMoney[iteration] > houseCounter * 50) {
                        System.out.println("Which property you want to build House on?");
                        System.out.println("1.\"" + fields[0][37] + "\"-> " + fields[5][37] + " houses, can build " + (4 - Integer.parseInt(fields[5][37])) + " houses;");
                        System.out.println("2.\"" + fields[0][39] + "\"-> " + fields[5][39] + " houses, can build " + (4 - Integer.parseInt(fields[5][39])) + " houses;");
                        System.out.print("Choose number 1 or 2-> ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][37]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][37])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][37] = String.valueOf(Integer.parseInt(fields[5][37]) + houseCounter);
                                if (Integer.parseInt(fields[5][37]) == 1) {
                                    fields[3][37] = "175";
                                } else if (Integer.parseInt(fields[5][37]) == 2) {
                                    fields[3][37] = "500";
                                } else if (Integer.parseInt(fields[5][37]) == 3) {
                                    fields[3][37] = "1100";
                                } else if (Integer.parseInt(fields[5][37]) == 4) {
                                    fields[3][37] = "1300";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][37] + "\" is now increased to " + fields[3][37] + " -> " + Integer.parseInt(fields[5][37]) + " houses");
                            }
                            case 2 -> {
                                if (houseCounter > (4 - Integer.parseInt(fields[5][39]))) {
                                    System.out.println("You can build " + (4 - Integer.parseInt(fields[5][39])) + " houses MAX");
                                    houseCounter = checkHouseCounter(fields, houseCounter);
                                }
                                fields[5][39] = String.valueOf(Integer.parseInt(fields[5][39]) + houseCounter);
                                if (Integer.parseInt(fields[5][39]) == 1) {
                                    fields[3][39] = "200";
                                } else if (Integer.parseInt(fields[5][39]) == 2) {
                                    fields[3][39] = "600";
                                } else if (Integer.parseInt(fields[5][39]) == 3) {
                                    fields[3][39] = "1400";
                                } else if (Integer.parseInt(fields[5][39]) == 4) {
                                    fields[3][39] = "1700";
                                }
                                playersMoney[iteration] -= houseCounter * 200;
                                System.out.println(playersName[iteration] + " has " + playersMoney[iteration] + " left in Bank Account.");
                                System.out.println("Rent price of \"" + fields[0][39] + "\" is now increased to " + fields[3][39] + " -> " + Integer.parseInt(fields[5][39]) + " houses");
                            }
                        }

                    }
                }
            }
        }
    }
}
