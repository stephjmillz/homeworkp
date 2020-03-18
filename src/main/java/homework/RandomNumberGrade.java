package homework;
import java.util.Random;

public class RandomNumberGrade {
    public static void main(String[] args) {
        //Range is between 1 - 100.
        int max = 100;
        int min = 1;

        Random gradeNum = new Random();
        int input = gradeNum.nextInt(max);

        System.out.println(input);

        if (input >= 90) {
            System.out.println("You got an A");

        } else if (input <= 89 && input >= 80) {
            System.out.println("You got a B");
        } else if (input <= 79 && input >= 70) {
            System.out.println("You got a C");
        } else if (input <= 69 && input >= 60) {
            System.out.println("You got a D");
        } else {
            System.out.println("You failed!");


        }

    }
}

