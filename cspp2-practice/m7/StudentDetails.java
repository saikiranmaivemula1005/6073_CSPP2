import java.util.*;

class StudentDetails{
		private String studentname;
		private int rollnumber;
		private float marks1, marks2, marks3;	
public StudentDetails(String studentname, int rollnumber, float marks1, float marks2, float marks3){
	this.studentname = studentname;
	this.rollnumber = rollnumber;
	this.marks1 = marks1;
	this.marks2 = marks2;
	this.marks3 = marks3;
}
	Double Gpa(){
		Double gpa;
		gpa = (marks1+marks2+marks3)/3.0D;
		return gpa;

	}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	int rollnumber = sc.nextInt();
	float marks1 = sc.nextFloat();
	float marks2 = sc.nextFloat();
	float marks3 = sc.nextFloat();
	StudentDetails s = new StudentDetails(name, rollnumber, marks1, marks2, marks3);
	System.out.format("%.1f", s.Gpa());

}
}
