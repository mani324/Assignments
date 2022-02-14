package collections;
class Recursion {
	
		public static void Reversing(int num)
		{
			if (num < 10) {
				System.out.println(num);
				return;
			}
			else {
		// print the First digit 
				System.out.print(num % 10);
		// calling function for remaining number other than 1st digit
				Reversing(num / 10);
			}
		}
		// driver code
		public static void main(String args[])
		{
		// number to be reversed
			int num = 65435;
			System.out.print("Reversed Number: ");
	    //calling recursive function to print the number in reversed form
	         Reversing(num);   
		}
	}



