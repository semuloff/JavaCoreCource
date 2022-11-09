public class Methods {
    public static void main(String args[]) {
        /** minimize repetitive code.
         * minimize repetitive code.
         * break a monolithic application into parts.
         * **/

        System.out.print("The hard life ");
        System.out.println("of a programmer :(");

        System.out.println("This is number: " + getNumber(123));

        /** access modifiers: public, protected, default (package-private) and private **/
    }

    private static int number = 1435;

    public static int getNumber(int _number) {
        return number + sum(_number);
    }

    public static int sum(int _number) {
        return _number + 100;
    }
}
