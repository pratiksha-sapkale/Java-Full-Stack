package collection;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String [] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(100);
		al.add(200);		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add("Java");
		al.add("Python");
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(0, 999);
		System.out.println(al);
		System.out.println(al.size());
		
		al.set(0, 555);
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(100);
		System.out.println(al);
		System.out.println(al.size());
		
		//Generic version of ArrayList 
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("JFS");
		courses.add("PFS");
		courses.add("MEAN");
		courses.add("MERN");
		//courses.add(1001); //CE
		System.out.println(courses);
	}
/*
1. ArrayList is growable in nature
2. Duplicates are allowed
3. Maintained insertion order
*/
	}

