import java.util.ArrayList;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrays = new ArrayList<>();
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Import array data");
            System.out.println("2. Print array elements");
            System.out.println("3. Find the second largest element");
            System.out.println("4. Delete odd elements");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arrays = NumberExercise.importData();
                    break;
                case 2:
                    if (arrays.isEmpty()) {
                        System.out.println("Please import the array first (Option 1).");
                    } else {
                        NumberExercise.printElement(arrays);
                    }
                    break;
                case 3:
                    if (arrays.isEmpty()) {
                        System.out.println("Please import the array first (Option 1).");
                    } else {
                        int max2 = NumberExercise.findMax2(arrays);
                        System.out.println("The second largest element in the array is: " + max2);
                    }
                    break;
                case 4:
                    if (arrays == null) {
                        System.out.println("Please import the array first (Option 1).");
                    } else {
                        ArrayList<Integer> evenArray = NumberExercise.deleteOddNumber(arrays);
                        System.out.print("Array after deleting odd elements: ");
                        for (int element : evenArray) {
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
