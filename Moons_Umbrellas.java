/**
 * Cody-Jamal is working on his latest piece of abstract art: a mural consisting of a row of waning moons and closed umbrellas.
 * Unfortunately, greedy copyright trolls are claiming that waning moons look like an uppercase C and closed umbrellas look like a J,
 * and they have a copyright on CJ and JC. Therefore, for each time CJ appears in the mural, Cody-Jamal must pay X, and for each
 * time JC appears in the mural, he must pay Y.
 * Cody-Jamal is unwilling to let them compromise his art, so he will not change anything already painted.
 * He decided, however, that the empty spaces he still has could be filled strategically, to minimize the copyright expenses.
 * For example, if CJ?CC? represents the current state of the mural, with C representing a waning moon, J representing a closed
 * umbrella, and ? representing a space that still needs to be painted with either a waning moon or a closed umbrella, he could finish
 * the mural as CJCCCC, CJCCCJ, CJJCCC, or CJJCCJ. The first and third options would require paying X+Y in copyrights, while
 * the second and fourth would require paying 2⋅X+Y.
 * Given the costs X and Y and a string representing the current state of the mural, how much does Cody-Jamal need to pay in copyrights
 * if he finishes his mural in a way that minimizes that cost?
 * */

import java.util.*;
/**
 * The sample input
 * 4
 * 2 3 CJ?CC?
 * 4 2 CJCJ
 * 1 3 C?J
 * 2 5 ??J???
 * */
/**
 * The sample output
 * Case #1: 5
 * Case #2: 10
 * Case #3: 1
 * Case #4: 0
 * */
class Moons_Umbrellas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //CJ --- x; JC --- y;
        int t, x, y;
        String s;
        t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            x = sc.nextInt();
            y = sc.nextInt();
            s = sc.next();
            String s2 = s;
            int pay_C = 0, pay_J = 0;
            try {
                //CCJ
                s.replace("?", "C");
                //CJJ
                s2.replace("?", "J");
            } catch (Exception e){
                continue;
            }
            //pay_C = x + y;
            //pay_J = 2x + y

            for (int j = 0; j < s.length() - 1; j++) {
                if ((s.substring(j, j + 2)).equals("CJ"))
                    pay_C += x;
                else if ((s.substring(j, j + 2)).equals("JC"))
                    pay_C += y;
                if ((s2.substring(j, j + 2)).equals("CJ"))
                    pay_J += x;
                else if ((s2.substring(j, j + 2)).equals("JC"))
                    pay_J += y;
            }
            if (pay_C > pay_J)
                System.out.println("Case #" + i + ": " + pay_J);
            else if (pay_C < pay_J)
                System.out.println("Case #" + i + ": " + pay_C);
            else if (pay_C == pay_J)
                System.out.println("Case #" + i + ": " + pay_C);
        }
    }
}