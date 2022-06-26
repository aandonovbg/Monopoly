import java.util.Scanner;

public class MethodsPlayer {
    public static int checkPlayerCount() {
        Scanner sc = new Scanner(System.in);
        int playerCount = sc.nextByte();
        if (playerCount < 1 || playerCount > 4) {
            System.out.println("Players range can be from 1 to 4");
            return Main.startMenu();
        }
        return playerCount;
    }

    public static String[] initializePlayersNames(int n) {
        String[] players = new String[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Player " + (i + 1) + " name->");
            players[i] = sc.nextLine();
        }
        return players;
    }

    public static int[] initializePlayersMoney(int n) {
        int[] playersMoney = new int[n];
        for (int i = 0; i < n; i++) {
            playersMoney[i] = 1000;
        }
        return playersMoney;
    }

    public static int[] initializePlayersPosition(int n) {
        int[] playersPosition = new int[n];
        for (int i = 0; i < n; i++) {
            playersPosition[i] = 0;
        }
        return playersPosition;
    }

    public static boolean[] initializePlayersInJail(int n) {
        boolean[] playersInJail = new boolean[n];
        for (int i = 0; i < n; i++) {
            playersInJail[i] = false;
        }
        return playersInJail;
    }

    public static int[] initializePlayersJailTimeCounter(int n) {
        int[] playersJailTimeCounter = new int[n];
        for (int i = 0; i < n; i++) {
            playersJailTimeCounter[i] = 0;
        }
        return playersJailTimeCounter;
    }


    public static String getPlayerName(String[] playersNames, int iteration) {
        return playersNames[iteration];
    }

    public static void setPlayerName(String[] playersNames, int iteration, String name) {
        playersNames[iteration] = name;
    }

    public static int getPlayerMoney(int[] playersMoney, int iteration) {
        return playersMoney[iteration];
    }

    public static void setPlayerMoney(int[] playersMoney, int n, int money) {
        playersMoney[n] = money;
    }

    public static int getPlayerPosition(int[] playersPosition, int iteration) {
        return playersPosition[iteration];
    }

    public static void setPlayerPosition(int[] playersPosition, int[] playersMoney, int iteration, int diceSum) {
        if (playersPosition[iteration]+diceSum > 39) {
            playersMoney[iteration] += 200;
            System.out.println("You passed \"GO\" and collect 200$");
            playersPosition[iteration] = (playersPosition[iteration]+diceSum) - 39;
        }else {
            playersPosition[iteration] += diceSum;
        }
    }

    public static boolean getPlayerInJail(int n, boolean[] playersInJail) {
        return playersInJail[n];
    }

    public static void setPlayerInJail(int n, boolean[] playersInJail, boolean isInJail) {
        playersInJail[n] = isInJail;
    }

    public static int getPlayerJailTimeCounter(int n, int[] playersJailTimeCounter) {
        return playersJailTimeCounter[n];
    }

    public static void setPlayerJailTimeCounter(int n, int[] playersJailTimeCounter, int counter) {
        playersJailTimeCounter[n] = counter;
    }
    public static void promptEnterKey(){
        System.out.println();
        System.out.println("Row Dices");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
