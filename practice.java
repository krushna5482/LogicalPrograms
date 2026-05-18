package com.Qualifier.Collection;
import java.util.*;
public class practice {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 5);
		int first=map.get(1);
		map.put(1, 6);
		int second=map.get(1);
		System.out.println(first+second);
		

	}

}
