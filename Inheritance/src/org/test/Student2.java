package org.test;

public class Student2 extends Student {
	public void social()
	{
		System.out.println("social");
	}
	public void java()
	{
		System.out.println("java");
	}
	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.tamil();
		obj.english();
		//obj.match();
		//obj.science();
		obj.social();
		obj.java();
		
	}

}
