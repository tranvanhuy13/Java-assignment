import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        switch(n){
            case 5:
                System.out.println("Five");
            case 4:
                System.out.println("Four");
            case 3 :
                System.out.println("Three");
            case 2:
                System.out.println("Two");
            case 1:
                System.out.println("One");
            default:
                System.out.println("N/A");
        }

    }
}
