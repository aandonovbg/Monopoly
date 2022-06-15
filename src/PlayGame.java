public class PlayGame {
public static void startGame(String[]playersNames,int[]playersMoney,int[]playersPosition,boolean[]playersInJail,int[]playersJailTimeCounter){
    for (int i = 0; i < playersPosition.length; i++) {
        int dice1=Dice.throwDice1();
        int dice2=Dice.throwDice2();
        System.out.println(playersNames[i]+" throw Dice "+dice1+" and "+dice2);
        MethodsPlayer.setPlayerPosition(playersPosition,i,dice1+dice2);
    }
}
}
