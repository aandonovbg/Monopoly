import java.util.Scanner;

public class Main {
    public static void askForPlayers(){

        System.out.println("���� ������� ���� ������ �� 1 �� 4");
        System.out.print("���� ������-> ");
    }
   public static String playersNames(String[]array,int playersCount){
        Scanner sc=new Scanner(System.in);
        int[] playersNames=new int[playersCount-1];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("�����"+i+"-> ");
            String Name= sc.nextLine();

        }
        System.out.println();
        int playersName = playersNames[i];
        return playersName;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        askForPlayers();
        int players= sc.nextInt();
        int strLength=players-1;
        if (players>=1&&players<=4){
            System.out.println("������� ����� �� ��������");
          String[] playersNames=new String[strLength];
            for (int i = 0; i <playersNames.length ; i++) {
                System.out.print("�����"+(i+1)+"-> ");
                playersNames[i] = sc.nextLine();
                System.out.println(playersNames[0]);
            }

        }else {
            System.out.println("��������� �����");
        }
    }
}