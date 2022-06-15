
import java.util.Scanner;

public class MethodsPlayer {
    public static int checkPlayerCount() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        if (n < 1 || n > 4) {
            System.out.println("Players range can be from 1 to 4");
            return Main.startMenu();
        }
        return n;
    }

    public static String[] initializePlayersNames(int n) {
        Scanner sc = new Scanner(System.in);
        String[] players = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Player " + (i + 1) + " name->");
            players[i]= sc.nextLine();
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

    public static int getPlayerMoney(int n, int[] playersMoney) {
        return playersMoney[n];
    }

    public static void setPlayerMoney(int n, int[] playersMoney, int money) {
        playersMoney[n] = money;
    }

    public static int getPlayerPosition(int n, int[] playersPosition) {
        return playersPosition[n];
    }

    public static void setPlayerPosition(int[] playersPosition, int iteration,int position) {
        playersPosition[iteration] += position;
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
}