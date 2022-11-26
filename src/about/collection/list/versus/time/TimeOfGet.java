package about.collection.list.versus.time;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfGet {
    public static void main(String[] args) {
        System.out.println("Get - ArrayList: " + getTimeMsOfGet(fill(new ArrayList<>())));
        System.out.println("Get - LinkedList: " + getTimeMsOfGet(fill(new LinkedList<>())));
    }

    public static long getTimeMsOfGet(List list) {
        Date startTime = new Date();
        getItems(list);
        Date endTime = new Date();

        return endTime.getTime() - startTime.getTime();
    }

    public static List fill(List list) {
        for (int iteration = 0; iteration < 10000; iteration++) {
            list.add(new Object());
        }
        return list;
    }

    public static void getItems(List list) {
        int index = list.size() / 2;
//        int index = list.size() - 1;

        for (int iteration = 0; iteration < 10000; iteration++) {
            list.get(index);
        }
    }
}
