package javapractice;//method overloading
class Symbol1
{
	 Symbol1()
	{
	System.out.println("***********");
	}
	 Symbol1(int a)//passing parameters
	 {
		 System.out.println("###############");
	 }
}
class Symbol2 extends Symbol1
{
	 Symbol2(int a)
	 {
		 System.out.println("#############");
	 }
}
public class Overloading {
	public static void main(String[] args) {
	Symbol1 give=new Symbol1();
	Symbol1 give2=new Symbol2(6);//calling function//passing arguments
	
	

	}

}
