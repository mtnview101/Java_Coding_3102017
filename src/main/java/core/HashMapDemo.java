package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapDemo {
	
public static void main(String[] args) {
	Map map=new HashMap();
	map.put(3,"3");
	map.put(2,"2");
	map.put(4,"4");
	map.put(1,null);
	map.put(11,"4");
	map.put(20,"4");
	map.put(19,"4");	
	map.put(18,"4");	
	map.put(17,"4");
	map.put(16,"4");
	map.put(15,"4");
	map.put(14,"4");
    map.put(31, "z");
    map.put(30, "b");
    map.put(29, "a");
    map.put(28, "c");
    map.put(27, "d");
    map.put(26, "e");
    map.put(25, "y");
    map.put(24, "n");
    map.put(23, "j");
    map.put(22, "m");
    map.put(21, "f");

        System.out.println("Unsort Map......");
        System.out.println(map);
        //printMap(map);

        System.out.println("\nSorted Map......By Key");
        Map treeMap = new TreeMap(map);
        System.out.println(treeMap);
        //printMap(treeMap);
	

	//System.out.println(map);
	//System.out.println(set.get(4));
}
}
