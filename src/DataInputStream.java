import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInputStream {

    public static void main(String[] args) throws IOException {
        /** The "read()" method reads a byte representation of a character from the input stream.
         * Latin characters are represented as one byte,
         * and Cyrillic - in the form of two. **/
        System.out.print("Enter the symbol: ");

        int data = System.in.read();
        System.out.println("Byte representationl: " + data);
        System.out.println("Symbol: " + (char) data);
        data = System.in.read(); // reads the character of the transfer to the next line - enter.


        /** At each iteration, the "read()" method returns only one byte of data,
         * therefore, this is not suitable for us to enter data from the console (especially for Cyrillic). **/
//        System.out.print("Enter the symbol: ");

        /** One byte is a character (sometimes 2 bytes), the next byte is a newline (enter) **/
//        while (true) {
//            data = System.in.read();
//            System.out.println("Byte representationl: " + data);
//            System.out.println("Symbol: " + (char) data);
//        }


        /** The InputStreamReader class gives us the ability to work correctly with multibyte characters. **/
//        InputStreamReader reader = new InputStreamReader(System.in);
//
//        while (true) {
//            data = reader.read();
//            System.out.println("Byte representationl: " + data);
//            System.out.println("Symbol: " + (char) data);
//        }


        /** The BufferedReader class is needed for high performance when reading data from the input stream. **/
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            data = buffReader.read();
//            System.out.println("Byte representationl: " + data);
//            System.out.println("Symbol: " + (char) data);
//        }


        /** The main advantage of BufferedReader is that it can read a string. **/
        System.out.print("Enter the line: ");
        String line = buffReader.readLine();
        System.out.println("\nYour entered line: " + line);
    }
}
