package com.java.handson;

import java.util.Arrays;

public class EqualityOfArray {
	public void getArray(int[] a,int[] b)
	{
		System.out.println("Array a is :"+Arrays.toString(a));
		System.out.println("Array b is :"+Arrays.toString(a));
		boolean compare=Arrays.equals(a,b);
		if(compare==true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		}
	}
public static void main(String args[])
{
  EqualityOfArray ea=new EqualityOfArray();
  int[] array1= {2,4,5,7,3,6};
  int[] array2= {2,4,5,7,3,6};
  ea.getArray(array1, array2);
}
}
