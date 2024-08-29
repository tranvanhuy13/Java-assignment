import java.util.Scanner;
public class array {
    public static float[] importData(float[] arrays) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrays[i] = sc.nextFloat();
        }
        return arrays;
    }
    public static void printElement(float[] arrays) {
        System.out.print("Array elements: ");
        for (float element : arrays) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static float findMax2(float[] arrays) {
        float max1 = Float.NEGATIVE_INFINITY, max2 = Float.NEGATIVE_INFINITY;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }
    public static float[] deleteOddNumber(float[] arrays) {
        int count = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                count++;
            }
        }
        float[] newArray = new float[count];
        int index = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        float[] arrays = new float[size];
        arrays = importData(arrays);
        printElement(arrays);
        float max2 = findMax2(arrays);
        System.out.println("The second largest element in the array is: " + max2);
        float[] evenArray = deleteOddNumber(arrays);
        System.out.print("Array after deleting odd elements: ");
        printElement(evenArray);
    }
}
