package core;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Add_Get_Remove {
public static void main(String[] args) {
	List list=new ArrayList();
	long startTime=System.nanoTime();
	for(int i=0;i<100000;i++){list.add(i);}
	long endTime=System.nanoTime();
	long duration=endTime-startTime;
	System.out.println(list);
	System.out.println("ArrayList: \t"+duration/1000/1000+" mileseconds");

}
}

