package com.java.handson;

import java.util.ArrayList;

public class AddList {
	void add()
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("Element");
		list.add("in");
		list.add("first");
		list.add("position");
		list.add("of arraylist");
		list.add(1,"added");//adding the element at first index position
		System.out.println(list);		
	}	
	public static void main(String[] args) {
	   AddList a=new AddList();
	   a.add();
	}
}
