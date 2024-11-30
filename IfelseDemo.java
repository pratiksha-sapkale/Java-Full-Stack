import java.util.Scanner;

public class IfelseDemo {

	 int no,no1,no2,no3;
	 Scanner sc=new 
			 Scanner(System.in);
	 void posNeg()
	 {
		 System.out.println("Enter no : ");
		 no=sc.nextInt();
		 if(no>0)
		 {
			 System.out.println(no +" is a positive number");
		 }
		 else 
		 {
			 System.out.println(no +" is a negative number");
		 }
	 }
	 void evenOdd() {
	 System.out.println("Enter no : ");
	 no=sc.nextInt();
	 if(no%2==0) 
	 {
		 System.out.println(no +" is a even number");
	 }
	 else 
	 {
		 System.out.println(no +" is a odd number");
	 }

	}
	 public static void main (String []args) {
		 IfelseDemo demo = new IfelseDemo();
		 demo.posNeg();
		 demo.evenOdd();
		 
	 }
}

