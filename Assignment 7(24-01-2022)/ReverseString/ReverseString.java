package javapractice;
public class ReverseString {
	public static void main(String[] args) {
		String input="manikandan v";
		int length=input.length();//To find Length of the String
		for(int i=0;i<length;i++) {//To increment the character of the String
			System.out.print(input.charAt(input.length()-i-1));//Reversing String
		}
	}

}
