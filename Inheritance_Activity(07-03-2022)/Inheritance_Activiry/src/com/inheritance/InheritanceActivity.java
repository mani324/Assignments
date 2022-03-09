package com.inheritance;
public class InheritanceActivity  {
	public static void main(String[] args) {
		 Manager mg=new Manager(126534, "Peter", "Chennai India", 237844l, 65000d,15d);
         Trainee t =new Trainee(29846,"Jack","Mumbai India",442085l,45000d,10d);
	     System.out.println("Salary of Trainee :"+t.calculateSalary());
	     System.out.println("Salary of the Manager :"+mg.calculateSalary());
		 System.out.println("TransportAllowance for a Manager :"+mg.calculateTransportAllowance());
		 System.out.println("TransportAllowance for a trainee :"+t.calculateTransportAllowance());
	}

}
