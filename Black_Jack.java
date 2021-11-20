import java.util.*;
import java.io.*;

public class Black_Jack {
    void logic(int s_pl, int s_co) {
        if (s_pl <= 21 && s_pl > s_co) {
            System.out.println("You Win!");
        } else if (s_co <= 21 && s_pl < s_co) {
            System.out.println("Computer Wins!");
        } else if (s_co == s_pl) {
            System.out.println("Draw!");
        } else if (s_pl >= 21) {
            System.out.println("You Loose!");
        } else {
            System.out.println("You Win!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Black_Jack obj = new Black_Jack();
        char ch = ' ';
        while (ch != 'n') {
            System.out.println("Press y to play and n to quit : ");
            ch = sc.next().trim().charAt(0);
            switch (ch) {
                case 'y':
                    int p1 = (int)(Math.random() * 10) + 1;
                    int p2 = (int)(Math.random() * 10) + 1;
                    int p3 = (int)(Math.random() * 10) + 1;
                    int c1 = (int)(Math.random() * 10) + 1;
                    int c2 = (int)(Math.random() * 10) + 1;
                    System.out.printf("Your cards are %d, %d\n", p1, p2);
                    System.out.printf("Computer's card is %d\n", c1);
                    System.out.println("Press h to hit s to stand : ");
                    char play = sc.next().trim().charAt(0);
                    if (play == 'h') {
                        System.out.printf("Your cards are %d, %d, %d\n", p1, p2, p3);
                        int s_pl = p1 + p2 + p3;
                        System.out.printf("Computer's cards are %d, %d\n", c1, c2);
                        int s_co = c1 + c2;
                        obj.logic(s_pl, s_co);
                    } else {
                        System.out.printf("Your cards are %d, %d\n", p1, p2);
                        int s_pl = p1 + p2;
                        System.out.printf("Computer's cards are %d, %d\n", c1, c2);
                        int s_co = c1 + c2;
                        obj.logic(s_pl, s_co);
                    }
                    break;
                default :
                    break;
            }
        }
    }
}