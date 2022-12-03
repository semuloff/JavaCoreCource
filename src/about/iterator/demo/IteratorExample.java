package about.iterator.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> arrayList = new LinkedList<>();

        arrayList.add("examle one");
        arrayList.add("examle two");
        arrayList.add("examle three");
        arrayList.add("examle four");

        /** First method. **/
//        Iterator<String> iteratorOne = arrayList.iterator(); // init Iterator.
//
//        while (iteratorOne.hasNext()) {
//            System.out.println("Element: " + iteratorOne.next());
//            iteratorOne.remove();
//        }
//
//        System.out.println(arrayList);


        /** Second method **/
        for (Iterator iteratorTwo = arrayList.iterator(); iteratorTwo.hasNext(); ) {
            String element = (String) iteratorTwo.next();
            System.out.println("Element: " + element);
        }

        System.out.println();

        // Short iterator version.
        for (String element : arrayList) {
            System.out.println("Element: " + element);
        }
    }
}
