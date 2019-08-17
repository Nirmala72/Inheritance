package org.test;

public class Student1 extends Student {
	public void match()
	{
		System.out.println("match");
	}
	public void science()
	{
	System.out.println("science");
	}
	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		obj.tamil();
		obj.english();
		obj.match();
		obj.science();
	}

}
