import java.util.Scanner;

public class Main {
    public static int startMenu() {
        System.out.print("How many Players are going to play->");

        return MethodsPlayer.checkPlayerCount();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Monopoly :)");
        System.out.print("How many Players are going to play->");
        int n = MethodsPlayer.checkPlayerCount();

        String[][] communityChest=MethodsField.communityChest();
        String[][] fields=MethodsField.initializeFieldsNamesAndOwners();
        String[] players = MethodsPlayer.initializePlayersNames(n);
        int []money=MethodsPlayer.initializePlayersMoney(n);
        int [] position=MethodsPlayer.initializePlayersPosition(n);
        boolean [] playersInJail=MethodsPlayer.initializePlayersInJail(n);
        int [] playersJailTimeCounter=MethodsPlayer.initializePlayersJailTimeCounter(n);
        PlayGame.startGame(fields,players,money,position,playersInJail,playersJailTimeCounter);
    }
}