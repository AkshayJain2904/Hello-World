package assignmentdaytwo;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	private double percentage;
	
	
	public Student() {
		super();
	}
	public Student(int rollno, String name, double percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public void display() 
	{
		System.out.println("Roll no is:-"+rollno+" Name is:-"+name+" and Percentage is"+percentage);
	}
	public String toString()
	{
		return rollno+" "+name+" "+percentage;
	}

}
class Main
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		Student stdArray[] = new Student[5]; //array of objects
		for(int i=0; i<stdArray.length;i++)
			stdArray[i]=new Student();
		
		String strName= " ";
		int temp=0;
		double temp2=0;
		
		for (int i = 0; i < stdArray.length; i++) {
			
			System.out.println("Enter user "+(i+1)+" details");
			
			strName= scanner.next();
			
			temp=scanner.nextInt();
			temp2=scanner.nextDouble();
			
			stdArray[i].setRollno(temp);
			stdArray[i].setName(strName);
			stdArray[i].setPercentage(temp2);
			
		}
		
		for (Student  student : stdArray) {
			student .display();
		}
		
		
		stdArray[0].display();
		stdArray[1].setRollno(101);
		stdArray[1].setName("Bansal");
		stdArray[1].setPercentage(60);
		System.out.println(stdArray[1].getRollno()+" ");
		System.out.print(stdArray[1].getName()+" ");
		System.out.print(stdArray[1].getPercentage());
		
		
}
}
