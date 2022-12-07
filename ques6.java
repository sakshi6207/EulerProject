package codex;

import java.util.Scanner;

public class ques6 {

	public static void main(String[] args) {
		System.out.println("Enter the num1");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum1,sum2;
		sum1=(n*(n+1)*(n+2))/6;
		sum2=(n*(n+1))/2;
		sum2=(int) Math.pow(sum2, 2);
		int total=Math.abs(sum1-sum2);
		System.out.println(total);
		
		
		

	}

}
