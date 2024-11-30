package NOV12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int id;
		String name;
		float salary;
		
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);
		
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //br.readLine()->String
  //br.read()->ascii value
  
  System.out.println("Enter Id");
  id= Integer.parseInt(br.readLine());  //"45"
   System.out.println("Enter name ");
   name=br.readLine();
   System.out.println("enter salary");
   salary = Float.parseFloat(br.readLine());
   
   System.out.println("Name ="+name);
   System.out.println("ID = "+id);
   System.out.println("Salary ="+salary);
  
		
	}
}
