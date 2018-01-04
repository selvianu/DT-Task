package day2.Q15;

public class StaticEx {
	int eid;
	int cgpa;
	static String collegeName = "XXX";//static variable

	void display() {
		System.out.println(eid);
		System.out.println(cgpa);
		System.out.println(collegeName);
	}
static void show()
{
	System.out.println(collegeName);
}
	public static void main(String args[]) {
		StaticEx s = new StaticEx();
		s.eid = 5;
		s.cgpa = 8;
		s.display();
		StaticEx.show();//static method - called without object

	}
}
