package codex;

import java.math.BigInteger;

public class ques16 {

	

			public static void main(String[] args) {
				BigInteger n = new BigInteger("2").pow(1000);
				String s = n+"";
				long sum = 0;
				for(int i = 0 ; i < s.length() ;i++) {
					sum += Long.parseLong(s.charAt(i)+"");
				}
				System.out.println(sum);

	}

}
