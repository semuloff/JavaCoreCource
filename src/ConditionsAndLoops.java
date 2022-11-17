import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionsAndLoops {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your hidden number: ");
        int hidNumber = Integer.parseInt(reader.readLine());

        int quess;

        while (true) {
            System.out.print("\nEnter your quess number: ");
            quess = Integer.parseInt(reader.readLine());

            if (quess == hidNumber) {
                System.out.print("\nFine! You quessed!");
                break;
            }

            System.out.print("\nMiss:) ");
        }
    }
}
