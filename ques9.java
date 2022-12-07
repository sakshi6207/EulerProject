package codex;

public class ques9 {

	public static void main(String[] args) {
		
		
		
		int res=1;
		int sum=1000;
		for( int a=1;a<=sum/3;a++) {
			for( int b=a+1;b<=sum/2;b++) {
			int	c=sum-a-b;
					if(((a*a)+(b*b)==(c*c)) && ((a+b+c)==1000))
					res=a*b*c;
				}
			}
		
		System.out.println(res);

	}

}
