package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer> ();
		hs.add(100);
		hs.add(500);
		hs.add(400);
		hs.add(200);
		hs.add(300);
		System.out.println(hs);
		hs.add(100);
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
		
		
		System.out.println(hs.hashCode());
		String s1 = new String("JAVA");
		String s2 = new String("Python");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
