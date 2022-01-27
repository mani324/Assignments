package javapractice;
class print//sub-class
{
	int number1=50;
	void value() 
	{
		System.out.println("First Number :"+number1);
	}
}
public class SingleInheritance extends print//main class
{
	int number2=30;
	public static void main(String[] args) {
		SingleInheritance opn=new SingleInheritance();
         opn.value();
         System.out.println("Second Value :"+opn.number2);
	}
}
