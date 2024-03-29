import java.util.ArrayList;
import java.util.Scanner;

public class MethodsField {
    public static String[][] initializeFieldsNamesAndOwners() {
        //[0][0]=fieldsNames
        //[1][0]=fieldsOwners
        //[2][0]=fieldsPrice
        //[3][0]=fieldsRent
        //[4][0]=fieldColor
        //[5][0]=houseCount
        String[][] fieldsNamesAndOwners = new String[6][40];

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
        fieldsNamesAndOwners[1][1] = "Todor";
        fieldsNamesAndOwners[1][2] = "Community Chest";
        fieldsNamesAndOwners[1][3] = "Todor";
        fieldsNamesAndOwners[1][4] = "Income Tax";
        fieldsNamesAndOwners[1][5] = "Todor";
        fieldsNamesAndOwners[1][6] = "Todor";
        fieldsNamesAndOwners[1][7] = "Chance";
        fieldsNamesAndOwners[1][8] = "Todor";
        fieldsNamesAndOwners[1][9] = "Todor";
        fieldsNamesAndOwners[1][10] = "Jail";
        fieldsNamesAndOwners[1][11] = "Todor";
        fieldsNamesAndOwners[1][12] = "Todor";
        fieldsNamesAndOwners[1][13] = "Todor";
        fieldsNamesAndOwners[1][14] = "Todor";
        fieldsNamesAndOwners[1][15] = "Todor";
        fieldsNamesAndOwners[1][16] = "Todor";
        fieldsNamesAndOwners[1][17] = "Community Chest";
        fieldsNamesAndOwners[1][18] = "Todor";
        fieldsNamesAndOwners[1][19] = "Todor";
        fieldsNamesAndOwners[1][20] = "Free Parking";
        fieldsNamesAndOwners[1][21] = "Todor";
        fieldsNamesAndOwners[1][22] = "Chance";
        fieldsNamesAndOwners[1][23] = "Todor";
        fieldsNamesAndOwners[1][24] = "Todor";
        fieldsNamesAndOwners[1][25] = "Todor";
        fieldsNamesAndOwners[1][26] = "Todor";
        fieldsNamesAndOwners[1][27] = "Todor";
        fieldsNamesAndOwners[1][28] = "Todor";
        fieldsNamesAndOwners[1][29] = "Todor";
        fieldsNamesAndOwners[1][30] = "Go To Jail";
        fieldsNamesAndOwners[1][31] = "Todor";
        fieldsNamesAndOwners[1][32] = "Todor";
        fieldsNamesAndOwners[1][33] = "Community Chest";
        fieldsNamesAndOwners[1][34] = "Todor";
        fieldsNamesAndOwners[1][35] = "Todor";
        fieldsNamesAndOwners[1][36] = "Chance";
        fieldsNamesAndOwners[1][37] = "Todor";
        fieldsNamesAndOwners[1][38] = "Luxury Tax";
        fieldsNamesAndOwners[1][39] = "Todor";

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

        fieldsNamesAndOwners[5][0] = "GO";
        fieldsNamesAndOwners[5][1] = "0";
        fieldsNamesAndOwners[5][2] = "Community Chest";
        fieldsNamesAndOwners[5][3] = "0";
        fieldsNamesAndOwners[5][4] = "Income Tax";
        fieldsNamesAndOwners[5][5] = "0";
        fieldsNamesAndOwners[5][6] = "0";
        fieldsNamesAndOwners[5][7] = "Chance";
        fieldsNamesAndOwners[5][8] = "0";
        fieldsNamesAndOwners[5][9] = "0";
        fieldsNamesAndOwners[5][10] = "Jail";
        fieldsNamesAndOwners[5][11] = "0";
        fieldsNamesAndOwners[5][12] = "0";
        fieldsNamesAndOwners[5][13] = "0";
        fieldsNamesAndOwners[5][14] = "0";
        fieldsNamesAndOwners[5][15] = "0";
        fieldsNamesAndOwners[5][16] = "0";
        fieldsNamesAndOwners[5][17] = "Community Chest";
        fieldsNamesAndOwners[5][18] = "0";
        fieldsNamesAndOwners[5][19] = "0";
        fieldsNamesAndOwners[5][20] = "Free Parking";
        fieldsNamesAndOwners[5][21] = "0";
        fieldsNamesAndOwners[5][22] = "Chance";
        fieldsNamesAndOwners[5][23] = "0";
        fieldsNamesAndOwners[5][24] = "0";
        fieldsNamesAndOwners[5][25] = "0";
        fieldsNamesAndOwners[5][26] = "0";
        fieldsNamesAndOwners[5][27] = "0";
        fieldsNamesAndOwners[5][28] = "0";
        fieldsNamesAndOwners[5][29] = "0";
        fieldsNamesAndOwners[5][30] = "Go To Jail";
        fieldsNamesAndOwners[5][31] = "0";
        fieldsNamesAndOwners[5][32] = "0";
        fieldsNamesAndOwners[5][33] = "Community Chest";
        fieldsNamesAndOwners[5][34] = "0";
        fieldsNamesAndOwners[5][35] = "0";
        fieldsNamesAndOwners[5][36] = "Chance";
        fieldsNamesAndOwners[5][37] = "0";
        fieldsNamesAndOwners[5][38] = "Luxury Tax";
        fieldsNamesAndOwners[5][39] = "0";

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

    public static String[] fieldsInitialPrices() {
        String[] fieldsInitialPrices = new String[40];
        fieldsInitialPrices[0] = "";
        fieldsInitialPrices[1] = "60";
        fieldsInitialPrices[2] = "Community Chest";
        fieldsInitialPrices[3] = "60";
        fieldsInitialPrices[4] = "Income Tax";
        fieldsInitialPrices[5] = "200";
        fieldsInitialPrices[6] = "100";
        fieldsInitialPrices[7] = "Chance";
        fieldsInitialPrices[8] = "100";
        fieldsInitialPrices[9] = "120";
        fieldsInitialPrices[10] = "Jail";
        fieldsInitialPrices[11] = "140";
        fieldsInitialPrices[12] = "150";
        fieldsInitialPrices[13] = "140";
        fieldsInitialPrices[14] = "160";
        fieldsInitialPrices[15] = "200";
        fieldsInitialPrices[16] = "180";
        fieldsInitialPrices[17] = "Community Chest";
        fieldsInitialPrices[18] = "180";
        fieldsInitialPrices[19] = "200";
        fieldsInitialPrices[20] = "";
        fieldsInitialPrices[21] = "220";
        fieldsInitialPrices[22] = "Chance";
        fieldsInitialPrices[23] = "220";
        fieldsInitialPrices[24] = "240";
        fieldsInitialPrices[25] = "200";
        fieldsInitialPrices[26] = "260";
        fieldsInitialPrices[27] = "260";
        fieldsInitialPrices[28] = "150";
        fieldsInitialPrices[29] = "280";
        fieldsInitialPrices[30] = "Go To Jail";
        fieldsInitialPrices[31] = "300";
        fieldsInitialPrices[32] = "300";
        fieldsInitialPrices[33] = "Community Chest";
        fieldsInitialPrices[34] = "320";
        fieldsInitialPrices[35] = "200";
        fieldsInitialPrices[36] = "Chance";
        fieldsInitialPrices[37] = "350";
        fieldsInitialPrices[38] = "Luxury Tax";
        fieldsInitialPrices[39] = "400";

        return fieldsInitialPrices;
    }
}


