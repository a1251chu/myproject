package com.tom;

public class GraduateStudent extends Student {
	int thesis;
	static int pass = 70;
	public GraduateStudent(int chinese, int english, int math, int thesis) {
		super(chinese, english, math);
		this.thesis = thesis;
	}
	public GraduateStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}
	
	@Override
	public void print()
	{
		super.print();
		if(getAverage()<pass)
		{
			System.out.print("*");
		}
		System.out.println("\t" + thesis+((thesis<70)?"*" : ""));
		
	}

}
