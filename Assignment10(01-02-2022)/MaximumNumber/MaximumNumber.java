package javapractice;
class Num
{
	public void setArray(int array[])
	{
		int max=array[0];//fixing index position to compare
		for(int i=1;i<array.length;i++)
		{
			if(array[i] > max)  //check max number
	               max = array[i];  
			System.out.println("The Maximum Number of Array is :"+max);
		}
	}
}
public class MaximumNumber {
	public static void main(String args[]) {
Num opt=new Num();
opt.setArray(new int[]{80,9,10,6});//passing arguments 
}
}
