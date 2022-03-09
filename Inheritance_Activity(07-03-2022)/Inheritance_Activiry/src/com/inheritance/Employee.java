package com.inheritance;
	class Employee 
	{
		long employeeId;
		String employeeName;
		String employeeAddress;
		long employeePhone;
		double basicSalary;
		double specialAllowance=250.60d;
		double hra=1000.50d;
		double transportAllowance;
		
		public Employee (long id, String Name, String address, long phone) 
		{
			super();
			this.employeeId = id;
			this.employeeName = Name;
			this.employeeAddress = address;
			this.employeePhone = phone;
		}
		public double calculateSalary()
		{   
			
			double salary;
			salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
			return salary;
		}
		public double calculateTransportAllowance()
		{  
		
			return transportAllowance;
			
		}

		
	    public Employee() {
			super();
		}
	}
	class Manager extends Employee 
	{
		public Manager(long id, String Name, String address, long phone,double basicSalary,double tAllowance) 
		{
			super(id, Name, address, phone);
			this.basicSalary=basicSalary;
			this.transportAllowance=(tAllowance/100)*basicSalary;
	    }

	}
	class Trainee extends Employee
	{
		public Trainee(long id, String Name, String address, long phone,double basicSalary,double tAllowance) 
		{
			super(id, Name, address, phone);
			this.basicSalary=basicSalary;
			this.transportAllowance=(tAllowance/100)*basicSalary;
			
		}

	}


