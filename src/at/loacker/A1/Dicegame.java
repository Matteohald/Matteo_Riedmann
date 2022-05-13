package at.loacker.A1;

import java.util.Random;

public class Dicegame {
    public class Wuerfelspiel {
        public static void main(String[] args) {


            Random random = new Random();
            int a = random.nextInt(6) + 1; ;
            int b = random.nextInt(6) + 1;;
            if (a == b) {
                System.out.println("Du hast eine " + a + " gewürfelt " + "dein Gegner hat eine " + b + " gwürfelt --> Gleichstand");
            }
            else if (a<b) {
                System.out.println("Du hast eine " + a + " gewürfelt " + "dein Gegner hat eine " + b + " gwürfelt --> Dein Gegner gewinnt");
            }

            else if (a>b) {
                System.out.println("Du hast eine " + a + " gewürfelt " + "dein Gegner hat eine " + b + " gwürfelt --> Du gewinnnst");
            }


        }

    }
}
