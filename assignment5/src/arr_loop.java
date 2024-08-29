import java.util.Arrays;

public class arr_loop {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i;
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}