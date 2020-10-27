package app;
import java.util.Scanner;

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
        char unicodeCharacter = 'a';
        boolean trueFalse = true;
        String text = "text";


        /*
        Boolean operators
        ! Not
        == Equal To
        != Not Equal to
        &&  And
        || Or
        ^ Exclusive Or
        */


        int placeholder = 1;
        if(placeholder ==  1){  
        }

        if(placeholder == 1){  
        }
        else{ 
        }

        if(placeholder !=82){
        }
        else if(placeholder == 1){
        }
        else{
        }

        for(int i = 1; i == 1; i++){
            break; 
        }

        for(int i = 1; i == 1; i--){
            break; 
        }

        for(int i = 1; i == 1;){
            break; 
        }

        while(placeholder == 1){
            break;
        }

        do {
            break; //runs through code once then checks to repeat
        }while(placeholder == 1);
        //break; stops  loop

        //add import java.util.Scanner; on 2nd line
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String inputString = input.nextLine();
        System.out.println("Line entered: " + inputString);


        /* use sysout and tab to make a System.out
        \/< Removing warning for not using myNumber */
        System.out.println(intreger);
        System.out.println(shortInt);
        System.out.println(longInt);
        System.out.println(decimal);
        System.out.println(smallDecimal);
        System.out.println(unicodeCharacter);
        System.out.println(trueFalse);
        System.out.println(superSmallInt);
        System.out.println(text);

    }
}