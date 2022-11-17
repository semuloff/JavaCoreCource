package about.generic.model;

import java.util.ArrayList;
import java.util.List;

import about.generic.example.ExampleOne;
import about.generic.example.ExampleTwo;

/** "Don't use raw types in new code" **/

public class Generic {
    public static void main(String[] args) {
        List<User> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        List<Integer> listThree = new ArrayList<>();

        ExampleOne<User> exampleOne = new ExampleOne<>();
        System.out.println(exampleOne.get());
        exampleOne.set(new User());
        System.out.println(exampleOne.get());

        ExampleTwo<User> exampleTwo = ExampleTwo.init(new User());
        System.out.println(exampleTwo);
        System.out.println(exampleTwo.get());
        exampleTwo.set(new User("Alex", 23, 185.4f));
        System.out.println(exampleTwo.get());

        List<BaseObject> list4 = new ArrayList<>();
        List<User> list5 = new ArrayList<>();
        List<ChildObject> list6 = new ArrayList<>();

//        exampleOne(list4);
//        exampleTwo(list4);
//        exampleThree(list4);
//
//        exampleOne(list5);
//        exampleTwo(list5);
//        exampleThree(list5);
//
//        exampleOne(list6);
//        exampleTwo(list6);
//        exampleThree(list6);
    }

    // Wildcards.
    public static void exampleOne(List<?> list) {
    }

    public static void exampleTwo(List<? extends User> list) {
    }

    public static void exampleThree(List<? super User> list) {
    }
}
