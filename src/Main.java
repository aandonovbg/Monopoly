import java.util.Scanner;

public class Main {
    public static int startMenu() {
        System.out.print("How many Players are going to play->");

        return MethodsPlayer.checkPlayerCount();
    }

    public static void main(String[] args) {
        MethodsField.initializeFieldsNamesAndOwners();

        System.out.println("Welcome to Monopoly :)");
        System.out.print("How many Players are going to play->");
        int n = MethodsPlayer.checkPlayerCount();

        String[] players = MethodsPlayer.initializePlayersNames(n);
        //MethodsPlayer.initializePlayersNames(n);
        int[] money=MethodsPlayer.initializePlayersMoney(n);
        int[]positions=MethodsPlayer.initializePlayersPosition(n);
        boolean[] PlayersInJail=MethodsPlayer.initializePlayersInJail(n);
        int[] PlayersJailTimeCounter=MethodsPlayer.initializePlayersJailTimeCounter(n);

        PlayGame.startGame(players,money,positions,PlayersInJail,PlayersJailTimeCounter);

    }
}