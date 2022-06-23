

public class Main {
    public static int startMenu() {
        System.out.print("How many Players are going to play->");

        return MethodsPlayer.checkPlayerCount();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Monopoly :)");
        System.out.print("How many Players are going to play->");
        int playerCount = MethodsPlayer.checkPlayerCount();

        String[][] fields = MethodsField.initializeFieldsNamesAndOwners();
        String[][] communityChest = MethodsField.communityChest();
        String[][] chanceCards=MethodsField.chanceCards();
        String[] players = MethodsPlayer.initializePlayersNames(playerCount);
        int[] money = MethodsPlayer.initializePlayersMoney(playerCount);
        int[] position = MethodsPlayer.initializePlayersPosition(playerCount);
        boolean[] playersInJail = MethodsPlayer.initializePlayersInJail(playerCount);
        int[] playersJailTimeCounter = MethodsPlayer.initializePlayersJailTimeCounter(playerCount);

        PlayGame.startGame(fields, communityChest,chanceCards, players, money, position, playersInJail, playersJailTimeCounter);
    }
}