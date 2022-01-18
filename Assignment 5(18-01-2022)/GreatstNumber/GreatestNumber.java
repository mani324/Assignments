import java.util.Scanner;
public class GreatestNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int number1=input.nextInt();
		System.out.println("Enter the Second Number: ");
		int number2=input.nextInt();
		System.out.println("Enter the Third Number: ");
		int number3=input.nextInt();
		if(number1>number2){
		if(number1>number3)
			System.out.println("The Greatest Number is: "+number1);
		}
		if(number2>number1){
			if(number2>number3)
				System.out.println("The Greatest Number is: "+number2);
		}
		if(number3>number2){
			if(number3>number1)
				System.out.println("The Greatest Number is: "+number3);
		}
	}
}
		
		