package collections;
import java.util.Scanner;
 class DataIn
 {
	 void getData()
	 {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first Value");
		int number_1=input.nextInt();//Stores first input
		System.out.println("Enter the Second Value");
		int number_2=input.nextInt();//Stores Second input
		System.out.println((number_1<number_2) +" : number_1<number_2");
		System.out.println((number_1>number_2) +" : number_1>number_2");
		System.out.println((number_1<=number_2) +" : number_1<=number_2");
		System.out.println((number_1>=number_2) +" : number_1>=number_2");
		System.out.println((number_1==number_2) +" : number_1==number_2");
		System.out.println((number_1!=number_2) +" : number_1!=number_2");
	 }

	
}
class RelationalOperators {

	public static void main(String[] args) {
		DataIn di=new DataIn();
		di.getData();

	}

}
