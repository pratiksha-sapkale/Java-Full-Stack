package Nov_6;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[]=new int[5];
				int []a=new int[5];
				int sum=0;
				
				//Input array elements
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter array elements");
				
				for(int i=0;i<a.length;i++) {
					a[i]=scanner.nextInt();
				}
				
				//display array elements
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
				}
				
				//find the sum of all array elements
				
				for(int i=0;i<a.length;i++) {
					sum=sum+a[i];
				}
				
				System.out.println("sum of all array elements "+sum);
				//average
				//max elements
				//min element
				
			}
		
	}


