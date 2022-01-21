package javapractice;
class Output{
	String name;
	int rollno;
}
public class Student {
	public static void main(String[] args) {
		Output stu=new Output();
		stu.name="john";
		stu.rollno=2;
		System.out.println("Name of the Student is: "+stu.name+"\n"+"Roll No: "+stu.rollno);
	}
}
