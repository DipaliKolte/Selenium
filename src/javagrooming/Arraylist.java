package javagrooming;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Dipali");
	al.add("Aniket");
	al.add("Revansh");
	System.out.println(al);
	//for(String data:al)
	//{
		//if(al.contains("Dipali"))
		//{
			//al.remove("Dipali");
		//}
	//}
	Iterator<String> itr=al.iterator();
while(itr.hasNext())
{
	if(itr.next().equals("Aniket"))
	{
		itr.remove();
	}
	
}
System.out.println(al);
}
}
