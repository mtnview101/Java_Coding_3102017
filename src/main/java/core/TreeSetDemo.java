package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	Set<String> set=new TreeSet();
	set.add("222");
	set.add("1");
	set.add("2");
	set.add("3");
	set.add("4");
	set.add("1960");
	set.add("21");
	System.out.println(set);
	
	System.out.println(set.contains("196"));
}
}

