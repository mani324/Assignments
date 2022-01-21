package javapractice;
class Input{
	int a,b,c;
	int perimeter() {
		return (a+b+c)/2;
	}
	public double area() {
		double s;
		s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
public class Triangle {
	public static void main(String args[]) {
		Input tri=new Input();
		tri.a=3;
		tri.b=4;
		tri.c=5;
		System.out.println("Perimeter of the Triangle is: "+tri.perimeter()+"\n"+"Area of the Triangle :"+tri.area());
	}

}
