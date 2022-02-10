package collections;

import java.util.ArrayList;
import java.util.Collections;
class Sort
{
	void display()
	{
	ArrayList<Integer>value=new ArrayList<Integer>();
	value.add(30);
	value.add(50);
	value.add(10);
	value.add(49);
	value.add(60);
	System.out.println(value);
	//reverseOrder() method to sort in descending order
	Collections.sort(value, Collections.reverseOrder());
	System.out.println("List After Using Reverse Order "+value);
	}
}
public class Sorting {
	public static void main(String[] args) {
		Sort s=new Sort();
		s.display();
	}
}
