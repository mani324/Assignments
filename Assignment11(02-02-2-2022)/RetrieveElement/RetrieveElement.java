package javapractice;
import java.util.ArrayList;
public class RetrieveElement {
	public static void main(String[] args) {
		ArrayList<String>element=new ArrayList<String>();
		element.add("Apple");
		element.add("Orange");
		element.add("Mango");
		element.add("Grape");
		element.add("PineApple");
		System.out.println("list Of Array: "+element);
		String fruit=element.get(0);//to get the element at 0th index
        System.out.println("The First Element :"+fruit);
        fruit=element.get(1);//to get the element at 1st index 
        System.out.println("The Second Element :"+fruit);
	}
}
