package codex;

public class ques5 {

	public static void main(String args[])
	{
		int n=20;
		long ans = 1;
		for(long i=2;i<=n;i++) {
			ans =lcm(ans,i);
		}
		System.out.println(ans);
			}
		public static long gcd(long a , long b) {
			if(b==0)
				return a;
			return gcd(b,a%b);
		}
		public static long lcm(long a , long b) {
			return (a*b)/gcd(a,b);
		}
		}		