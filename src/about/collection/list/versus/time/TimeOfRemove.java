package about.collection.list.versus.time;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfRemove {
    public static void main(String[] args) {
        System.out.println("Remove - ArrayList: " + addTimeMsOfGet(fill(new ArrayList<>())));
        System.out.println("Remove - LinkedList: " + addTimeMsOfGet(fill(new LinkedList<>())));
    }

    public static long addTimeMsOfGet(List list) {
        Date startTime = new Date();
        remove100000(list);
        Date endTime = new Date();

        return endTime.getTime() - startTime.getTime();
    }

    public static List fill(List list) {
        for (int iteration = 0; iteration < 100000; iteration++) {
            list.add(new Object());
        }

        return list;
    }

    public static void remove100000(List list) {
        for (int iteration = 0; iteration < 100000; iteration++) {
            list.remove(0);
//            list.remove((list.size() - 1) / 2);
        }
    }
}
