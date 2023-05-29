package javagrooming;

import java.util.Scanner;

public class Amount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Amount");
	int amt=sc.nextInt();
	int rs500=0, rs200, rs100;
	rs500=amt/500;
	amt=amt%500;
	rs200=amt/200;
	amt=amt%200;
	rs100=amt/100;
	amt=amt%100;
	System.out.println(rs500+"\t"+rs200+"\t"+rs100);
}
}
