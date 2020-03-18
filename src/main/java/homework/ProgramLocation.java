package homework;

import java.util.Scanner;

public class ProgramLocation {
    public static void main(String[] args) {
//topaz = scanner to read input.
        //While boolean (lolz) will ask "Are we there yet?", if user inputs on next line "Yes" or "No" question is answered & becomes false.
        Scanner topaz = new Scanner(System.in);
        boolean lolz = true;

        while(lolz){
            System.out.println("Are we there yet?");
            String whatUserSays = topaz.nextLine();
            if(whatUserSays.equalsIgnoreCase("Yes") || whatUserSays.equalsIgnoreCase("No")){
                System.out.println(whatUserSays);
                lolz = false;
            }
        }
    }
}
