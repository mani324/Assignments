package javapractice;
class Semester1                                       //Multilevel inheritance
{
	        int sub1=87,sub2=98,sub3=99,sub4=79,sub5=90;
	void sem1avg()
	{
	System.out.println("Semester 1 average: "+((sub1+sub2+sub3+sub4+sub5))/5);
}
}
class Semester2 extends Semester1
{
	 int sub1=87,sub2=98,sub3=89,sub4=80,sub5=90;
		void sem2avg()
		{
			System.out.println("Semester 2 average: "+((sub1+sub2+sub3+sub4+sub5)/5));
		}
}
class Semester3 extends Semester2
{
int sub1=87, sub2=78;int sub3=89;int sub4=99;int sub5=90;
void sem3avg()
{
	System.out.println("Semester 3 average: "+((sub1+sub2+sub3+sub4+sub5)/5));
}
}
class Semester4 extends Semester3
{
	int sub1=87; int sub2=78;int sub3=89;int sub4=89;int sub5=90;
	void sem4avg()
	{
		System.out.println("Semester 4 average: "+((sub1+sub2+sub3+sub4+sub5)/5));
	}
}
public class Semester {  //Main class
	public static void main(String[] args) {
    Semester4 sem=new Semester4();//calling function
    sem.sem1avg();
    sem.sem2avg();
    sem.sem3avg();
    sem.sem4avg();
	}
}
