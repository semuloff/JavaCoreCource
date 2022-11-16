package AboutObject;


public class Main {
    public static void main(String[] args) {
        AboutObject objOne = new AboutObject();
        System.out.println("Class: " + objOne.getClass().getName() + "\n" + "Hash code: " + objOne.hashCode());
        System.out.println("toString: " + objOne.toString() + "\n");

        AboutObject objTwo = new AboutObject();
        System.out.println("Class: " + objTwo.getClass().getName() + "\n" + "Hash code: " + objTwo.hashCode());
        System.out.println("toString: " + objTwo.toString());

        System.out.println("Equals: " + objOne.equals(objTwo));
    }
}
