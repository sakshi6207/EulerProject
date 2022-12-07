package codex;

public class ques10 {

	
		 public static boolean isPrime(long n) {  
		       if (n <= 1) {  
		           return false;  
		       }  
		       for (int i=2;i<=Math.sqrt(n);i++) {  
		           if (n % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		   }

		public static void main(String[] args) {
			long total=0;
			for(long i=2;i<1000000;i++) {
				if(isPrime(i)==true)
					total=total+i;
			}
			System.out.println(total);
		}
}