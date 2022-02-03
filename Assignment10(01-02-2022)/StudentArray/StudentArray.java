package javapractice;
class StudentArray
{
	public static void main(String args[])
	{
String names[] = { "Student 1", "Student 2", "Student 3", "Student 4", "Student 5" };
int marks[] = { 98, 78, 83, 77, 93 };
char sections[] = { 'A', 'B', 'A', 'A', 'B' };

for(int i = 0; i < names.length; i++)//to increment student names
{
    System.out.println( names[i] + " in section " + sections[i] + " got " + marks[i] + " marks." );
}    
}
}
	