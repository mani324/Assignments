package collections;
class LargestNumber {
public static int getLargest(int[] a, int total)
{  
int data;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    data = a[i];  
                    a[i] = a[j];  
                    a[j] = data;  
                }  
            }  
        }  
       return a[total-1];  
}
	public static void main(String[] args) {
		int a[]={7,9,0,4,2};  
		int b[]={12,3,5,7,8};  
		System.out.println("Largest: "+getLargest(a,3));  
		System.out.println("Largest: "+getLargest(b,2));  
	}
}

 
 