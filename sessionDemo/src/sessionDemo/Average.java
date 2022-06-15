package sessionDemo;

import java.util.Scanner;

public class Average {
	public int Calculate(int num1,int num2,int num3) {
		int avrg=(num1+num2+num3)/3;
		return avrg;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st number");
		
		int n1=sc.nextInt();
		
		System.out.println("Enter 2st number");
		
		int n2=sc.nextInt();
		
		System.out.println("Enter 3st number");
		
		int n3=sc.nextInt();
		
		
		System.out.println("## Average Number ##");
		
		Average avg=new Average();
		int result = avg.Calculate(n1, n2, n3);
		
		System.out.println(result);
		
		
	}
}
