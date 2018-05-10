package ru.specialist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Èìÿ: ");
			String name = sc.nextLine().trim();
			if (name.isEmpty()) break;
			else names.add(name);
		}
		
		Collections.sort(names);
		
		for(String name : names)
			System.out.println(name);

	}

}
