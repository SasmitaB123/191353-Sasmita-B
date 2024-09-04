package com.eg;

public class FibonacciSeries {
	
public static void main(String args[]) {
	
	int i=0;
	int j=1;
	
	System.out.println(i+" ");
	//System.out.println(j+ " ");
	
	for(int n=1; n<=20; n++) {
		
	int m=i+j;
	System.out.println(m + " ");
	j=i;
	i=m;
		
	}
}

}
