package app;

public class App {
    public static void main(String[] args) {

        int intreger = 1;
        // \/< change value | set int and value >/\
        intreger = 2;

        byte superSmallInt = 127; //8 bit max (127)
        short shortInt = 32000; //16 bit max (32,000)
        long longInt = 1000000000;
        double decimal = 1.192347;
        float smallDecimal = 1.732f;
        char unicodeCharacter = 'y';
        boolean trueFalse = true;



        /* use sysout and tab to make a System.out
        \/< Removing warning for not using myNumber
        */
        System.out.println(intreger);
        System.out.println(shortInt);
        System.out.println(longInt);
        System.out.println(decimal);
        System.out.println(smallDecimal);
        System.out.println(unicodeCharacter);
        System.out.println(trueFalse);
        System.out.println(superSmallInt);

    }
}