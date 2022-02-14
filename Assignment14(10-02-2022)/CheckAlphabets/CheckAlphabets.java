package collections;
import java.util.Scanner;
class InputCharactors
{
	void data()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Charactor :");
	char letter=input.next().charAt(0);//Storing data from the user
	if(letter>='a'&&letter<='z')
	{
		System.out.println("This is an LowerCase Letter");
	}
	else if(letter>='A'&&letter<='Z')
	{
		System.out.println("This is an UpperCase Letter");
	}
	else
	{
		System.out.println("This is Not a Charactor");
	}
	}
}
public class CheckAlphabets {
	public static void main(String[] args) {
		InputCharactors ipc=new InputCharactors();
		ipc.data();
	}
}
