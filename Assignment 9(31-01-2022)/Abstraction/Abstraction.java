package javapractice;
abstract class Number
{
	abstract void text();
}
class Print1 extends Number
{
	public void text()
	{
		System.out.println("FIRST");
	}
}
class Print2 extends Print1
{
	public void text()
	{
		System.out.println("SECOND");
	}
}
class Print3 extends Print2
{
	public void text()
    {
		System.out.println("THIRD");
	}
}
public class Abstraction {
	
	public static void main(String[] args) {
	Number value=new Print1();
	Number value1=new Print3();
	Number value2=new Print2();
	
     value.text();
     value1.text();
     value2.text();
     value.text();
     value1.text();
     value1.text();
	}
}
