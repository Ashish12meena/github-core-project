package Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {



        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);

        // list.remove(1);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // list1.remove(Integer.valueOf(1));
        // System.out.println(list);
        // System.out.println(list1);
        // ArrayList<String> arraylist = new ArrayList<>();
        // arraylist.add("ashish");
        // arraylist.add("rohan");
        // arraylist.add("mahesh");
        // arraylist.remove("rohan");

        // System.out.println(arraylist);

        // arraylist.add(1, "viki");

        // System.out.println(arraylist);  
        // ArrayList<String> arrayList1 = new ArrayList<>();
        // arrayList1.add("second array");
        // arrayList1.addAll(0,arraylist);
        // System.out.println(arrayList1);

        
        Integer[] obj  =   list1.toArray(new Integer[0]);
       for (Integer obj2 : obj) {
          System.out.println(obj2);
       }
        
    }
}
