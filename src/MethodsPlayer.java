import java.util.Arrays;
import java.util.Scanner;

public class MethodsPlayer {
    public static int checkPlayerCount() {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        try
        {
            Integer.parseInt(x);
            if (Integer.parseInt(x) < 2 || Integer.parseInt(x) > 4) {
                System.out.println("Players range can be from 2 to 4");
                return Main.startMenu();
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid choice! Enter Digit from 2 to 4");
            System.out.println();
            return Main.startMenu();
        }

        return Integer.parseInt(x);
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
            playersMoney[i] = 10;
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

    public static int[] initializePlayersJailTimeCounter(int n) {
        int[] playersJailTimeCounter = new int[n];
        for (int i = 0; i < n; i++) {
            playersJailTimeCounter[i] = 0;
        }
        return playersJailTimeCounter;
    }

    public static void setPlayerPosition(int[] playersPosition, int[] playersMoney, int iteration, int diceSum) {
        if (playersPosition[iteration] + diceSum > 39) {
            playersMoney[iteration] += 200;
            System.out.println("You passed \"GO\" and collect 200$");
            System.out.println("You have " + playersMoney[iteration] + " left in Bank Account.");
            playersPosition[iteration] = (playersPosition[iteration] + diceSum) - 39;
        } else {
            playersPosition[iteration] += diceSum;
        }
    }
    public static boolean[] isPlayerActive(String[]playersName){
        boolean [] isPlayerActive=new boolean[playersName.length];
        Arrays.fill(isPlayerActive, true);
        return isPlayerActive;
    }
}
