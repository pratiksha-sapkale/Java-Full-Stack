package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("JFS", 250);
		hm.put("PFS", 220);
		hm.put("MEAN", 150);
		hm.put("MERN", 150);
		System.out.println(hm);
		hm.put("JFS", 300);
		System.out.println(hm);
	} 

	}
