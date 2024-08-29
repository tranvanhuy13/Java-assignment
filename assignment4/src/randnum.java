import java.util.Random;
import java.util.Scanner;
public class randnum {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100)+1;
        System.out.println("The lucky number is: "+n);
    }
}

