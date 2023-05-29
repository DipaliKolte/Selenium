package javagrooming;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee 
{


public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee1> empdata=new ArrayList<>();
	System.out.println("Enter no. of Employee:");
	int num=sc.nextInt();
	
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee name");
		String name=sc.next();
		
		System.out.println("Enter Employee salary");
		double sal=sc.nextDouble();
		
		empdata.add(new Employee1(id,name,sal));
	}
	System.out.println(empdata.toString());
}
}
