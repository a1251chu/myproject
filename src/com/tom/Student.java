package com.tom;

public class Student {
	int chinese;
	int english;
	int math;
	static int pass = 60;
	
	public Student(int chinese,int english,int math){
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	
	public Student()
	{
		
	}
	
	public Student(int english)
	{
//		this.english = english;
		this(0,english,0);
	}
	
	public float getAverage()
	{
		float avg = (this.math+this.english+this.chinese)/3;
		return avg;
	}
	
	public void print()
	{
		System.out.print(math + "\t" + chinese + "\t" + english + "\t" +getAverage());
		if(getAverage()<pass)
		{
			System.out.println("*"); 
		}
		else
		{
			System.out.println("");
		}
	}
	public static void printhello()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Student st = new Student(60, 70, 80);
		Student st1 = new Student(30, 30, 30);
		Student st2 = new Student(30);
//		Student.printhello();
		Student.pass = 50;
//		st.print();
//		st1.print();
//		st2.print();
		GraduateStudent gstu = new GraduateStudent(10, 10, 80, 90);
		gstu.print();
	}
}
