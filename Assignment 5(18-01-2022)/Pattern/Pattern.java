import java.util.Scanner;
public class Pattern{
	public static void main(String args[]){
   int a,b,c;
   System.out.print("Input number of rows : ");
 Scanner input = new Scanner(System.in);
		    c = input.nextInt();

   for(a=1;a<=c;a++)
   {
   for(b=1;b<=a;b++)
       System.out.print(b);

       System.out.println();
    }
}
}


		
		