package about.collection;

import java.util.*;

/**
 * - Iterable:
 *      - Collections:
 *          - List.
 *          - Set.
 *          - Queue.
 * - Map.
 **/

public class DefinitionAndFamiliarity {
    public static void main(String[] args) {
        // Array.
        int arr[] = new int[5]; // final size.
        System.out.println("Size: " + arr.length);


        // Collections.
        System.out.println("\nCollections:");

        // List.
        List<String> list = new ArrayList<>(); // list contains data of parameterized type (generics) - String.
        list.add("Auto");
        list.add("AutoTwo");
        list.add("AutoThree");
        System.out.println(list);

        // Generics not set.
        List listTwo = new ArrayList(); // It can store any type of data. Essentially stores only objects.
        listTwo.add("Auto");
        listTwo.add(123);
        listTwo.add(12.34f);
        System.out.println(listTwo);

        // Set.
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);

        // Map.
        Map<String, Integer> map = new HashMap<>();
        map.put("Algor", 19);
        map.put("Guf", 45);
        System.out.println(map);
    }
}
