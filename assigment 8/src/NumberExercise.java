import java.util.ArrayList;
import java.util.Scanner;

public class NumberExercise {

    public static ArrayList<Integer> importData() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrays = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrays.add(sc.nextInt());
        }
        return arrays;
    }

    public static void printElement(ArrayList<Integer> arrays) {
        System.out.print("Array elements: ");
        for (int element : arrays) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int findMax2(ArrayList<Integer> arrays) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }

    public static ArrayList<Integer> deleteOddNumber(ArrayList<Integer> arrays) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int num : arrays) {
            if (num % 2 == 0) {
                newArray.add(num);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

    }
}
