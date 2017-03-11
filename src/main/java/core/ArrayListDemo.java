package core;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(null);
	list.add("Dima");
	list.add("Nakhabtsev");
	list.add("is");
	list.add("the great Java developer");
	list.add(true);
	list.add(1960);
	System.out.println(list);
	System.out.println(list.get(4));
}
}
