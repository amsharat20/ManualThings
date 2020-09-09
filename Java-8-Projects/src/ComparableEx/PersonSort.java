package ComparableEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Sharat", "Naik", 27),
				new Person("Lohit", "Zaik", 32),
				new Person("Jenny", "Aaik", 27),
				new Person("Christie", "Baik", 27)
				);

		Collections.sort(people, (p1,p2) -> p1.getLastname().compareTo(p1.getLastname()));
		System.out.println("Java 8 ");
		for(Person p : people ){
			if(p.getLastname().startsWith("B")){
				System.out.println(p);
			}
		}
		System.out.println("\n");
		
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});

		printall(people);
		
		System.out.println("\n");

		printConditionally(people);
		
		printConditionallyInterface(people, new Condition(){
			@Override
			public boolean test(Person p) {
				return p.getLastname().startsWith("A");
			}
		});
		
		System.out.println("java 8-9-n");
		printConditionallyInterface(people, p -> p.getLastname().startsWith("Z"));
	}
	
	
	
	private static void printConditionallyInterface(List<Person> people, Condition condition) {
		for(Person p : people ){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}

	private static void printConditionally(List<Person> people) {
		for(Person p : people ){
			if(p.getLastname().startsWith("A")){
				System.out.println(p);
			}
		}
	}

	private static void printall(List<Person> people) {
		for(Person p : people ){
			System.out.println(p);
		}
	}
}


