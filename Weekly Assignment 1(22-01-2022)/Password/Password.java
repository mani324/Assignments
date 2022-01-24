
package javapractice;
import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your Password Here :");
	String passcode=input.next();
	String passcode1="mani@123";
	if(passcode.equals(passcode1)) {
	    System.out.println("Entered Password is Correct");
	    System.out.println("Your Password is: "+passcode1);
	}
	else
	{
		System.out.println("Your Password is incorrect");
	}
	}
}  
