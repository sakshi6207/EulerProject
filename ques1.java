package codex;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<1000;i++) {
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
System.out.println(sum);
	}

}
