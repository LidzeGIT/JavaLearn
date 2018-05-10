package ru.specialist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		//int[] nums = new int[3];
		//nums[0] = 10;
		//nums[1] = 15;
		//int[] nums = new int[] {10, 15, 0};
		int[] nums = {10, 15, 0};
		System.out.println(nums.length);
		
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		for(int i=0; i < nums.length; i++)
			System.out.println(nums[i]);
		
		
		String[] names = new String[] 
				{ "Сергей", "Наталия", "Костя", "Саша" };

		
		//System.out.println( names[0].length() );
		for(int i=0; i < names.length; i++)
			System.out.printf("%s ", names[i]);
		System.out.println();
		Arrays.sort(names);
		//for(int i=0; i < names.length; i++)
		//	System.out.printf("%s ", names[i]);
		for(String name : names)
			System.out.println(name);
		
		
		System.out.println();
		
		// 1 2 3
		// 4 5 6
		
		int[][] matrix = new int[][] {
			{1,2,3},
			{4,5}
		};
		
		System.out.println(matrix.length);
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j < matrix[i].length; j++)
				System.out.printf("%4d", matrix[i][j]);
			System.out.println();
		}
		
		//Collection<String> persons = new LinkedList<String>();
		List<String> persons = new ArrayList<String>();
		
		System.out.println( persons.size() );
		persons.add( "Сергей" );
		persons.add( "Наталия" );
		persons.add( "Даша" );
		persons.add( "Глаша" );
		System.out.println( persons.size() );
		//persons.remove(2);
		persons.remove("Сергей");
		//persons.set(1, "Анна");
		
		
		
		//for(int i=0; i < persons.size(); i++)
		//	System.out.println(persons.get(i));
		
		/*Iterator<String> iter = persons.iterator();
		while (iter.hasNext()) {
			String p = iter.next();
			System.out.println(p);
		}*/
		
		Collections.sort(persons);
		
		for(String p : persons)
			System.out.println(p);
		
		

	}

}
