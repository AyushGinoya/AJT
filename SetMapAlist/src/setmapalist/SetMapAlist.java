/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setmapalist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ginoy
 */
public class SetMapAlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("<----------------------------SET---------------------------->");

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(20);
        set.add(30);

        System.out.println(set);

        if (set.contains(0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println(set.size());

        set.remove(2);

        System.out.println(set);

        System.out.println("<----------------------------Map---------------------------->");

        Map<Integer, Integer> m = new HashMap<>();

        //student id,marks
        m.put(1, 29);
        m.put(2, 20);
        m.put(3, 30);
        m.put(4, 34);

        System.out.println(m);

        boolean k = m.containsKey(4);
        boolean v = m.containsValue(4);

        System.out.println(k + "  " + v);

        System.out.println(m.get(5));

        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
        System.out.println();
        Set<Integer> s = m.keySet();

        for (Integer key : s) {
            System.out.println(key + "=" + m.get(key));
        }

        System.out.println("<----------------------------ArrayList---------------------------->");

        List<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        list.add(3, 4);
        System.out.println(list);

        System.out.println(list.get(6));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "    ");
        }
        System.out.println();

        ArrayList<ArrayList<Integer>> listoflist = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            //initialization of inner ArrayList for each row
            listoflist.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                listoflist.get(i).add(j * i + i + j);
            }
        }

        System.out.println(listoflist);
        List list1 = new ArrayList<String>();
        list1.add("Sun");
        list1.add("moon");
        list1.add(911);

        System.out.println(list1);
    }

}
