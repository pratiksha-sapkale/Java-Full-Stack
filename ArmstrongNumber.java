package com.example.math;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int num, dc=0,digit,sum=0;
			System.out.println("Program to check the given number is Armstrong");
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter number");
			num = scanner.nextInt();
			int num1=num;
			//count the number of digits
			while(num!=0) {
				dc++;
				num=num/10;
			}
			num=num1;
			
			while(num!=0) {
				digit = num%10;
				sum+=Math.pow(digit, dc);
				num=num/10;
			}
			
			if(sum==num1) {
				System.out.println(num1+" is armstrong number");
			}else {
				System.out.println(num1+" is not armstrong number");
			}

	}
}

