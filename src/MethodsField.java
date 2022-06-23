import java.util.Arrays;
import java.util.Random;

public class MethodsField {
    public static String[][] initializeFieldsNamesAndOwners() {
        //[0][0]=fieldsNames
        //[1][0]=fieldsOwners
        //[2][0]=fieldsPrice
        //[3][0]=fieldsRent
        String[][] fieldsNamesAndOwners = new String[4][40];

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

        Arrays.fill(fieldsNamesAndOwners[1], "");

        fieldsNamesAndOwners[2][0] = "GO";
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

        return fieldsNamesAndOwners;
    }

    public static String [][] chanceCards(){
        String [][] chanceCards=new String[2][13];
        chanceCards[0][0]="Advance to \"Boardwalk\".";
        chanceCards[0][1]="Advance to \"GO\". Collect $200.";
        chanceCards[0][2]="Advance to \"Illinois Avenue\". If you pass \"GO\", collect $200.";
        chanceCards[0][3]="Advance to \"St. Charles Place\". If you pass \"GO\", collect $200.";
        chanceCards[0][4]="Advance to the nearest \"Railroad\". If unowned, you may buy it from the Bank." +
                " If owned, pay owner twice the rental to which they are otherwise entitled.";
        chanceCards[0][5]="Advance to nearest \"Utility\". If unowned, you may buy it from the Bank." +
                " If owned, throw dice and pay owner a total ten times amount thrown.";
        chanceCards[0][6]="Bank pays you dividend of $50.";
        chanceCards[0][7]="Go back 3 spaces.";
        chanceCards[0][8]="Go to Jail. Go directly to Jail, do not pass \"GO\", do NOT collect $200.";
        chanceCards[0][9]="Speeding fine $15";
        chanceCards[0][10]="Take a trip to \"Reading Railroad\". If you pass \"GO\", collect $200.";
        chanceCards[0][1]="You have been elected Chairman of the Board. Pay each player $50";
        chanceCards[0][12]="Your building loan matures. Collect $150";

        chanceCards[1][0]="";
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
        //communityChest[1][7] special one must check it !!!!!!!
        communityChest[1][7] = "It is your birthday. Collect $10 from every player";
        communityChest[1][8] = "100";
        communityChest[1][9] = "100";
        communityChest[1][10] = "-50";
        communityChest[1][11] = "25";
        communityChest[1][12] = "10";
        communityChest[1][13] = "100";

        return communityChest;
    }

    public static void isFieldSpecial(String[][] fields, String[][] communityChest, String[] playersName, int[] playersMoney, int[] playersPosition, int iteration, int diceSum) {
        if (fields[1][playersPosition[iteration]].equals("Community Chest") ||
                fields[1][playersPosition[iteration]].equals("Income Tax") ||
                fields[1][playersPosition[iteration]].equals("Go To Jail") ||
                fields[1][playersPosition[iteration]].equals("Luxury Tax") ||
                fields[1][playersPosition[iteration]].equals("Free Parking")) {
            switch (fields[1][playersPosition[iteration]]) {
                case "Community Chest":
                    Random rand = new Random();
                    int index = rand.nextInt(14);
                    if (index == 8) {     //check if index is equal to [0][7]
                        System.out.println(communityChest[0][index - 1]);
                        for (int i = 0; i < playersMoney.length; i++) {
                            playersMoney[i] -= 10;      //deduct 10$ of every player
                        }
                        playersMoney[iteration] += playersMoney.length * 10; //add 10$ from every player to current player
                    } else {
                        System.out.println(communityChest[0][index - 1]);
                        playersMoney[iteration] += Integer.parseInt(communityChest[1][index - 1]);
                    }
                    break;
                case"Income Tax":
                    System.out.println("Pay 200$ Income TAX :)");
                    playersMoney[iteration]-=200;
                    break;
                case "Go To Jail":
                    System.out.println("Go straight to Jail");
                    playersPosition[iteration]=10;
                    break;
                case "Luxury Tax":
                    System.out.println("Pay 100$ Luxury TAX :)");
                    playersMoney[iteration]-=100;
                    break;
            }
        }

    }

    public static void setFieldOwner(String[][] fields, int iteration, String name) {
        fields[1][iteration] = name;
    }

    public static String getFieldOwner(String[][] fields, int[] playersPosition, int iteration, int diceSum) {
        String fieldOwner = fields[1][playersPosition[iteration] + diceSum];
        return fieldOwner;
    }

    public static int getFieldPrice(String[][] fields, int iteration) {
        return Integer.parseInt(fields[2][iteration]);
    }

    public static int getFieldRent(String[][] fields, int[] playersPosition, int iteration, int diceSum) {
        return Integer.parseInt(fields[3][(playersPosition[iteration] + diceSum)]);
    }
}
