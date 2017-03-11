package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Abc {

    public static void main(String[] args) {
     
              Map hm = new HashMap();
              hm.put(18, "28");
              hm.put(2, "2");
              hm.put(69, "29");
              hm.put(27, "Alex");
              hm.put(56, "Christina");
              hm.put(25, "Nikita");
              hm.put(44, "Zoia");
              hm.put(23, "Elena");
              hm.put(32, "Svetlana");
              hm.put(21, "Mike");

              System.out.println("Before Sorting:");
              System.out.println(hm);
              
              System.out.println("\nSorted Map......By Key");
              Map treeMap = new TreeMap(hm);
              System.out.println(treeMap);
              
/*              Set set = hm.entrySet();
              Iterator iterator = set.iterator();
              while(iterator.hasNext()) {
                    Map.Entry me = (Map.Entry)iterator.next();
                    System.out.print(me.getKey() + ": ");
                    System.out.println(me.getValue());
              }
              Map<Integer, String> map = new TreeMap<Integer, String>(hm); 
              System.out.println("After Sorting:");
             
              Set set2 = map.entrySet();
              Iterator  iterator2 = set2.iterator();
              while(iterator2.hasNext()) {
                   Map.Entry me2 = (Map.Entry)iterator2.next();
                   System.out.print(me2.getKey() + ": ");
                   System.out.println(me2.getValue());
              }*/
         }

    }

