package javapractice;

	class Input{
		String name;
		int rollno;
	}
	public class Student {
	public static void main(String[] args) {
	Input stu=new Input();
	stu.name="john";
	stu.rollno=2;
	System.out.println("Name of the Student is: "+stu.name+"\n"+"Roll No is :"+stu.rollno);
	}
}
