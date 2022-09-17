import java.util.Scanner;
import java.util.Random;
 public class RPS_Game
 {
     public static void main(String[] args)
     {
         int upperbound = 3;
         int  i,x=0,y=0;
         Random RAN =new Random();
         Scanner SC =new Scanner(System.in);
         System.out.println("WELCOME TO ROCK,PAPER,SCISSOR GAME");
         System.out.println("ENTER THE NO. OF MATCHES ->");
         int a =SC.nextInt();
         for (i=1;i<=a;i++) {
             System.out.println("ENTER 0(FOR ROCK),1(FOR PAPER) or 2(FOR SCISSOR)");
             int j = SC.nextInt();
             int k = RAN.nextInt(upperbound);
             if (j == k) {
                 System.out.println("IT'S A DRAW");
             } else if (j == 0 && k == 1) {
                 System.out.println("YOU WON");
                 x++;
             } else if (j == 0 && k == 2) {
                 System.out.println("CPU WON");
                 y++;
             } else if (j == 1 && k == 0) {
                 System.out.println("YOU WON");
                 x++;
             } else if (j == 1 && k == 2) {
                 System.out.println("CPU WON");
                 y++;
             } else if (j == 2 && k == 0) {
                 System.out.println("CPU WON");
                 y++;
             } else if (j == 2 && k == 1) {
                 System.out.println("YOU WON");
                 x++;
             } else {
                 System.out.println("ENTERED WRONG OPTION");
             }
         }


             if(x>y)
             {
                 System.out.println("USER WON THE SERIES OF " +a+" MATCHES WITH " +x+"-"+y);
             }
             else if(y>x)
             {
                 System.out.println("CPU WON THE SERIES OF " +a+" MATCHES WITH " +y+"-"+x);
             }
             else
             {
                 System.out.println("THE SERIES OF "+a+ " MATCHES IS DRAW WITH " +x+"-"+y);
             }

     }
}
