package javawork;
import java.util.ArrayList;
public class ListToArray {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("four");
		list.add("Five");
		System.out.println("Contents in the list :"+list);
		String[] newArray=new String[list.size()];
		list.toArray(newArray);//converts list to Array
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println("Element Presented in array"+newArray[i]);
		}
	}
	}
		