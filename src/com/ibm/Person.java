package com.ibm;

import java.util.Scanner;

public class Person {
	String name;
	float weight;
	float height;

	public Person(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}
	
	public Person()
	{
		
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	public float bmi() {
		float bmi = weight / (height * height);
		bmi = ((int) (bmi * 100)) / 100.0f;
		return bmi;
	}

	public String advise() {
		float bmi = bmi();
		String msg;

		if (bmi < 16) {
			msg = "please eat more!";
		} else if (bmi > 25) {
			msg = "please eat less!";
		} else {
			msg = "It is good!";
		}
		return msg;
	}

	public void sayHello() {
		System.out.println("HELLO");
	}

	public static void main(String[] args) {
		Lottery539 lot = new Lottery539();
		lot.generate();
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input weight");
		float w = scanner.nextFloat();
		System.out.print("please input height");
		float h = scanner.nextFloat();
		Person p = new Person(w, h);

		// int n=5;
		// int m=8;
		// System.out.println(n++);
		// p.sayHello();
		// p.weight = 65.6f;
		// p.height = 1.7f;
		System.out.println(p.bmi());
		System.out.println(p.advise());
		
	}
}
