package org.test;

public class Student3 extends Student {
public void sql()
{
	System.out.println("sql");
}
public void selenium()
{
	System.out.println("selenium");
}
public static void main(String[] args) {
	
	Student3 obj = new Student3();
	obj.tamil();
	obj.english();
	//obj.match();
	//obj.science();
	//obj.social();
	//obj.java();
	obj.sql();
	obj.selenium();
	
}
}
