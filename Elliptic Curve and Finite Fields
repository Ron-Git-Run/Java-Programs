package ModCalc;
import java.util.*;
import java.lang.Math;
import java.math.*;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class ModuloCalculator {
	public static void main(String[] args) {
		int i;
		int j;
		BigInteger[] x = new BigInteger[20];
		BigInteger[] y = new BigInteger[20];
		for (i = 0; i <= 19; i++) {
	        int a = 0 + i;
	        int b = 19;
	        int c = 3;
	        BigInteger big = BigInteger.valueOf(a);
	        //BigInteger bigy = BigInteger.valueOf(ycord);
	        big = big.pow(c);
	        //(bigy = bigy.mod(BigInteger.valueOf(b));
	        int big1 = (5 * a) + 6;
	        BigInteger gig = BigInteger.valueOf(big1);
	        big = big.add(gig);
	        //System.out.println(big);
	        big = big.mod(BigInteger.valueOf(b));
	        x[i] = big;
	        //System.out.println(Arrays.toString(x));
	        big = big.subtract(big);
		    for (j = 0; j <= 19; j++) {
				int ycord = 0 + j;
				int po = 2;
				BigInteger bigy = BigInteger.valueOf(ycord);
				bigy = bigy.pow(po);
		        bigy = bigy.mod(BigInteger.valueOf(b));
		        y[j] = bigy;
		    }
		}
	    System.out.println(Arrays.toString(x));
    	System.out.println(Arrays.toString(y));
    	int k;
    	int m;
    	for (k = 0; k <= 19; k++) {
    		for (m = 0; m <= 19; m++) {
    			if (x[k] == y[m]) {
    		    	System.out.println((k) + "," + (m));
    			}
    		}
    	}
	}
}
