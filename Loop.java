package org.loop;

public class Loop {
public static void main(String[] args) {
	
	for (int i = 1; i<=100; i++) {
		System.out.println(i);
		int sum=i/2;
		sum=sum+i;
		if(sum%2==0) {
		System.out.println(sum);
		}



	}
	}	
}
