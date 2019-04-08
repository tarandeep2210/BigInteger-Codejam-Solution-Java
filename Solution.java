import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

import java.lang.*;
import java.math.BigInteger; 
class Solution1{
    public static void main(String args[] ) throws Exception {
       
       
       Scanner s = new Scanner(System.in);
        // read the name from the input 
        int testCase = s.nextInt();
        
        for(int i=1; i<=testCase ; i++){
            
        	BigInteger n = new BigInteger(s.next());
//        			s.nextLong();
        	BigInteger m=n;
//        	String a = n.toString().length();
        	BigInteger k= new BigInteger("0");
        	BigInteger sum= new BigInteger("0");
        	BigInteger zero= new BigInteger("0");
        	long len= n.toString().length();
//        	long ab = 10000000000000000;
        	for(long j=0;j<=2*len*len*len;j++) {
        		k = new BigInteger("0");
        		BigInteger	ten = new BigInteger("10");
        		BigInteger	four = new BigInteger("4");
        		if(n.mod(ten).equals(four)) {
        			String ma = Long.toString((long)Math.pow(10, j));
        			k= new BigInteger(ma);
        			
//        			System.out.println("YES");
        		}
        		n=n.divide(ten);
        		
        		sum= sum.add(k);
//        		System.out.println(sum);
        		if(n.equals(zero)){
        		    break;
        		}
        	}
            System.out.print("Case #"+i+": ");
            System.out.print(m.subtract(sum));
            System.out.print(" ");
            System.out.println(sum);
            
        }
//        System.out.println(n);
    }
    
}
