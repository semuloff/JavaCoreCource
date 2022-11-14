import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        int number;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // input to array.
        System.out.println("INPUT: ");
        for (int i = 0; i < 10; i++) {
            number = Integer.parseInt(reader.readLine());
            arr[i] = number;
        }

        Arrays.sort(arr);

        // output.
        System.out.println("OUTPUT: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
