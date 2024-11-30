package Nov12;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=2,c;
		int a1[]= {7,5,4,3};
		System.out.println("Before division");
		try {
			c=a/b;
			System.out.println(a1[6]);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}




