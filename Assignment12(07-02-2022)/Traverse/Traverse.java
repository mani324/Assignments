package javawork;
import java.util.*;
class Traverse {
	public static void main(String[] args) {
		      HashSet<String> hashSet = new HashSet<String>();
		      hashSet.add("Tvs");
		      hashSet.add("Yamaha");
		      hashSet.add("Ktm");
		      hashSet.add("Honda");
		      hashSet.add("Hero");
		      Iterator<String> iterator = hashSet.iterator();
		      System.out.println("HashSet elements are :"+hashSet);
		      while(iterator.hasNext()) {//checks more element presented and returns true
		         System.out.println(iterator.next());//returns next element in the iteration
		      }
		   }
		}

