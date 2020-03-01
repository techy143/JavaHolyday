package techy.java.hw.one;

public class HolyDayHWone {

    public static void main(String[] args) {


        // Displaying My Name...

        System.out.println("Tauhid Elahi Chowdhury");

        dataTypes();
        aritheticOperators();
        unaryOperators();
        ifElsee();


        // Method int....

        int x = 5;
        int y = 10;

        System.out.println(x + y);

        int a = 100;
        int b = 80;

        System.out.println(a - b);

        int c = 10;
        int d = 5;

        System.out.println(c * d);

        // Method string....

        String bdCricket = "Bangladesh Cricket team is the 2nd best team in Asia ";

        System.out.println(bdCricket);
    }

    private static void lloop() {
    }

    // Method DataType....

    public static void dataTypes() {


        int e = 12;
        byte f = 35;
        short g = 40;
        long h = 50l;
        float i = 150f;
        double j = 100d;
        char k = 'T';
        boolean p = true;

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(p);


    }

    // Method Arithmetic Operators...

    public static void aritheticOperators() {


        // + Additive operator

        int tNumOne = 110;
        int tNumTwo = 20;

        // - Subtraction operator

        int tNumthree = 50;
        int tNumFour = 30;

        // * Multiplication operator

        int tNumfive = 4;
        int tNumSix = 6;

        // / Division operator

        int tNumseven = 10;
        int tNumEight = 5;

        // % Remainder operator

        int tNumNine = 15;
        int tNumTen = 10;


        System.out.println(tNumOne + tNumTwo);
        System.out.println(tNumthree - tNumFour);
        System.out.println(tNumfive * tNumSix);
        System.out.println(tNumseven / tNumEight);
        System.out.println("Remainder :-" + " " + tNumNine % tNumTen);

    }


    // Unary Operators Method

    public static void unaryOperators() {


        // ++ Increment operator

        int tVal = 20;

        tVal++;

        // -- Decrement operator

        int tValtwo = 20;

        tValtwo--;

        // ! Logical complement operator

        boolean tValu = !false;


        System.out.println(tVal);
        System.out.println(tValtwo);
        System.out.println(!tValu);
    }


    // Method if Else....

    public static void ifElsee() {

        int time = 30;
        if (time < 7) {
            System.out.println("Nice morning.");
        } else if (time > 23) {
            System.out.println("Nice day.");
        } else {
            System.out.println("Bad day.");
        }
    }
}




