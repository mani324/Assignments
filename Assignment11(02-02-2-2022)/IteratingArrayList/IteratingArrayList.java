package javapractice;
import java.util.ArrayList;
public class IteratingArrayList {
	public static void main(String[] args) {
		ArrayList<String> subject=new ArrayList<String>();
		subject.add("English");
		subject.add("Maths");
		subject.add("Computer");
		subject.add("Physics");
		subject.add("hemistry");
		System.out.println("ArrayList :"+subject);//prints elements presented in array
		for(int i=0;i<subject.size();i++) 
		{
			System.out.print(subject.get(i)+",");//prints elements presented in the array one by one
		}
	}

}
