public class DataTypes {
    public static void main(String[] args) {
        /** Primitive Data Types **/
        byte b = -128; // Bit size - 8. Min - -128, Max - 127. Wrapper class - Byte.
        short s = -32768; // Bit size - 8 * 2 = 16. Min - -32768, Max - 32767. Wrapper class - Short.
        int i = -2147483648; // Bit size - 8 * 2 * 2 = 32. Min - -2147483648, Max - 2147483647. Wrapper class - Integer.
        long l = -9223372036854775808L; // Bit size - 8 * 2 * 2 * 2 = 64. Min - -9223372036854775808L,
        // Max - 9223372036854775807L. Wrapper class - Long.

        float f = 2.43345323f; // Bit size - 32. // Range from 1.4e-45f to 3.4e+38f. Wrapper class - Float.
        double d = 2.43343543232; // Bit size - 64. Range from 4.9e-324 to 1.7e+308. Wrapper class - Double.

        char c = 'a'; // unsigned integer representing a UTF-16 character (letters and numbers). Wrapper class - Character.

        boolean bool = true; // boolean data type stores "true" or "false". Wrapper class - Boolean.


        /** Feference Data Type **/
        /**
         * Reference types are all other types: classes, enumerations, and interfaces,
         * such as those declared in the Java Standard Library, as well as arrays.
        **/
        String string = "Hello!";


        /** Wrapper classes **/
        String number = "25";
        System.out.println(Integer.parseInt(number) + 2);
    }
}
