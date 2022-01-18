public class SeperateInt{
	public static void main(String args[]){
		int sixDigitNum=123456;
		int n1=(sixDigitNum)/100000%10;
		int n2=(sixDigitNum)/10000%10;
		int n3=(sixDigitNum)/1000%10;
		int n4=(sixDigitNum)/100%10;
		int n5=(sixDigitNum)/10%10;
		int n6=(sixDigitNum)%10;
		System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}
}
