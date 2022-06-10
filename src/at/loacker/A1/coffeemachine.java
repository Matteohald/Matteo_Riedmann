package at.loacker.A1;

import java.util.Scanner;

public class coffeemachine {

    boolean onornot = false;
    int water = 1000;
    int beans = 50;

        while(!onornot){
        System.out.println("1 On");
        System.out.println("2 Coffee-size");
        System.out.println("3 Refill water");
        System.out.println("4 refill beans");
        System.out.println("5 give me a coffee!");
        System.out.println("6 Off");

        Scanner scanner = new Scanner(System.in);
        int pressed = scanner.nextInt();

        if (pressed == 1) {
            onornot = true;

        }
        else if (pressed == 2) {
            if (onornot = true){
                System.out.println("Choose a coffee size");
                System.out.println("Small 40ml");
                System.out.println("Medium 100ml");
                System.out.println("Big 200ml");


            }
        }
        else if (pressed == 3) {
            water = 1000;
            System.out.println("done");
        }
        else if (pressed == 4){
            beans = 50;
            System.out.println("done");
        }
        else if (pressed == 5) {
            Scanner scan = new Scanner(System.in);
            String size = scanner.nextLine();
            if (size == "S") {
                water = water - 40;
            } else if (size == "M") {
                water = water - 100;
            } else if (size == "B"){
                water = water - 200;
            }
            beans = beans - 2;
            System.out.println("Enjoy your coffee!");
        }

        else if (pressed == 6) {
            onornot = false;
        }
    }
}
