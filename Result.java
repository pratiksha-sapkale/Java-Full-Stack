
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks = 96;
        if (marks >= 90) 
        { 
        	System.out.println("Grade: A+ ");
        }
        else if(marks>=80) 
        {
        	System.out.println("Grade: A ");
        }
        else if(marks>=70)
        {
        	System.out.println("Grade: B");
        }
        else if(marks>=60) 
        {
        	System.out.println("Grade: C");
        }
        else if(marks>=50) 
        {
        	System.out.println("Grade: D");
        }
        else {
        	System.out.println("Fail");
        }
	}

}
