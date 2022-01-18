public class SignedAndUnsigned{
	public static void main(String args[]){
		int number1=Integer.MIN_VALUE;
		int number2=Integer.MAX_VALUE;
		System.out.println("Signed integers:"+number1+","+number2);
		int compareSigned=Integer.compare(number1,number2);
		System.out.println("Comparing Signed integers: "+compareSigned);
		int compareUnsignednum = Integer.compareUnsigned(number1, number2);
        System.out.println("comparing unsigned numbers: " + compareUnsignednum);
	}
}

		
		
		
		