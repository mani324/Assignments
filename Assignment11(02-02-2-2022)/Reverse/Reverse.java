package javapractice;
import java.util.Iterator;
import java.util.LinkedList;
public class Reverse {
	public static void main(String[] args) {
		LinkedList<String> value = new LinkedList<String>();
		value.add("One");
		value.add("Two");
		value.add("Three");
		value.add("Four");
		value.add("Five");
		Iterator<String> iterator=value.descendingIterator();//to get end of the iterator
		while(iterator.hasNext())//hasNext() will tell if previous element is available or not
			
		System.out.println(iterator.next());//with descending iterator will return the previous element
	}
}
