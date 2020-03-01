package techy.java.hw.two;

import java.util.Scanner;

public class HolyDayHWthree {


    public static void main(String[] args) {

        switchh();

        // Reversing an integer....

        Scanner input = new Scanner(System.in);

        int num, sum = 0, t, r;

        System.out.println("Enter Numbers");
        num = input.nextInt();
        t = num;

        while (t != 0) {

            r = t % 10;
            sum = sum * 10 + r;
            t = t / 10;
        }
        System.out.println("Reverse = " + sum);
    }


    // Methord Switch....

    public static void switchh() {

        int bestPlayer = 2;
        switch (bestPlayer) {
            case 1:
                System.out.println("Tamim Iqbal");
                break;
            case 2:
                System.out.println("Shakib al Hasan");
                break;
                case 3:
                    System.out.println("Liton Das");


        }
    }
}

