import java.util.Scanner;

public class while_loop{
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while(num != -1){
            sum+=num;
            System.out.println("Enter a number (-1 to quit): ");
            num = scanner.nextInt();
        }
        System.out.println("Sum = "+sum);
    }
}
