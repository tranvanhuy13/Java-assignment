import java.util.Random;
import java.util.Scanner;

public class slide37 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int error = 0;
        int score = 0;
        do {
            int num = rand.nextInt(4) + 2;
            int r = rand.nextInt(10)+1;
            int sum = r;
            System.out.print(r);
            for (int i =1;i<num;i++){
                r  = rand.nextInt(10)+1;
                sum+= r;
                System.out.print(" + "+r);
            }
            System.out.print(" = ");
            int ans = scanner.nextInt();
            if (ans == sum ){
                ++score;
            }else{
                System.out.println("Wrong answer was "+sum);
                ++error;
            }
        }while (error <3);
        System.out.println("You earned "+ score +" in total points.");
    }
}
