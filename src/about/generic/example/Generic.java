package about.generic.example;

import java.util.ArrayList;
import java.util.List;

import about.generic.model.BaseObject;
import about.generic.model.ChildObject;
import about.generic.model.User;

/** "Don't use raw types in new code" **/

public class Generic {
    public static void main(String[] args) {
        /** Situation without generics (type parametrizations). **/
        List itemsOne = new ArrayList();

        itemsOne.add(45);
        itemsOne.add("String");
        itemsOne.add(new User());
        itemsOne.add(32.3f);
        itemsOne.add(365);
        itemsOne.add(551);

        System.out.println("Sum of all integer: " + getSumExOne(itemsOne) + "\n");


        /** Situation with generics (type parametrizations). **/
        List<Integer> itemsTwo = new ArrayList<>();

        itemsTwo.add(45);
//        itemsTwo.add("String");
//        itemsTwo.add(new User());
//        itemsTwo.add(32.3f);
        itemsTwo.add(365);
        itemsTwo.add(551);

        System.out.println("Sum of all integer: " + getSumExTwo(itemsTwo) + "\n");


        /** Own class with generics. **/
        ExampleOne<User> exampleOne = new ExampleOne<>();

        System.out.println(exampleOne.get());
        exampleOne.set(new User());
        System.out.println(exampleOne.get() + "\n");

        ExampleTwo<User> exampleTwo = ExampleTwo.init(new User());
        System.out.println(exampleTwo);
        System.out.println(exampleTwo.get());
        exampleTwo.set(new User("Alex", 23, 185.4f));
        System.out.println(exampleTwo.get() + "\n");

        /** Wildcards **/
        List<BaseObject> list4 = new ArrayList<>();
        List<User> list5 = new ArrayList<>();
        List<ChildObject> list6 = new ArrayList<>();

        exampleOne(list4);
        exampleOne(list5);
        exampleOne(list6);

//        exampleTwo(list4);
        exampleTwo(list5);
        exampleTwo(list6);

        exampleThree(list4);
        exampleThree(list5);
//        exampleThree(list6);

        /** Generic method example. **/
        System.out.println("Result: " + Generic.<Integer>genericMethodExample(21));
    }

    public static int getSumExOne(List items) {
        int sum = 0;

        for (Object item : items) {
            if (item instanceof Integer) {
                System.out.println("This is integer: " + item);
                sum += (int) item; // explicit casting.
            }
        }

        return sum;
    }

    public static int getSumExTwo(List<Integer> items) {
        int sum = 0;

        for (Integer item : items) {
            System.out.println("This is integer: " + item);
            sum += item; // implicit casting.
        }

        return sum;
    }

    // Generic method.
    public static <T> T genericMethodExample(Object object) {
        return (T) object;
    }

    // Wildcards.
    public static void exampleOne(List<?> list) {
    }

    public static void exampleTwo(List<? extends User> list) {
    }

    public static void exampleThree(List<? super User> list) {
    }
}
