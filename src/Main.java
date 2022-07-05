public class Main {
    public static int startMenu() {
        System.out.print("How many Players are going to play->");

        return MethodsPlayer.checkPlayerCount();
    }

    public static void main(String[] args) {
        System.out.println("        Welcome to Monopoly :)");
        System.out.print("How many Players are going to play->");
        int playerCount = MethodsPlayer.checkPlayerCount();

        String[][] fields = MethodsField.initializeFieldsNamesAndOwners();
        String[][] communityChest = MethodsField.communityChest();
        String[] chanceCards = MethodsField.chanceCards();
        String[] players = MethodsPlayer.initializePlayersNames(playerCount);
        int[] money = MethodsPlayer.initializePlayersMoney(playerCount);
        int[] position = MethodsPlayer.initializePlayersPosition(playerCount);
        int[] playersJailTimeCounter = MethodsPlayer.initializePlayersJailTimeCounter(playerCount);
        String[] fieldsInitialPrices=MethodsField.fieldsInitialPrices();
        boolean[] isPlayerActive=MethodsPlayer.isPlayerActive(players);

        PlayGame.startGame(fields, communityChest, chanceCards, players, money, position, playersJailTimeCounter,fieldsInitialPrices,isPlayerActive);
    }
}