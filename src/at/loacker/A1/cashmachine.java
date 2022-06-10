package at.loacker.A1;

import java.util.Scanner;

public class cashmachine {
    public static void main(String[] args) {

        int total = 0;
        boolean isFinished = false;
        while (!isFinished) {

            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            Scanner scanner = new Scanner(System.in);
            int pressed = scanner.nextInt();
            if (pressed == 1) {
                Scanner scanner1 = new Scanner(System.in);
                double deposit = scanner1.nextDouble();
                double plus = deposit;
                System.out.println("Ihr Kontostand beträgt " + deposit + " €");
                total += plus;
            } else if (pressed == 2) {
                Scanner scanner2 = new Scanner(System.in);
                double abheben = scanner2.nextInt();
                var minus = abheben;
                System.out.println("Ihr Kontostand beträgt " + abheben + " €");
                total -= minus;
            }else if (pressed == 3) {
                System.out.println("Ihr Kontostand beträgt " + total + " €");
            }else if (pressed == 4) {
                isFinished = true;
            }

        }

    }
}
