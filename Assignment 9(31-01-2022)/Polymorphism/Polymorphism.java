package javapractice;
class Language//parent class
{
	public void output()//method over riding
	{
		System.out.println("Common English Language");
	}
}
class JavaLanguage extends Language//child class
{
	public void output()//method over riding
	{
		System.out.println("Java Programmig Language");
	}
}
public class Polymorphism {
	public static void main(String[] args) 
	{
		Language out=new Language();
		Language out1=new JavaLanguage();//object creation
        out.output();
        out1.output();//calling function
	}
}
