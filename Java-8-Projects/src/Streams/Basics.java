package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {

	public static void main(String[] args) {

		Stream<String> streamEmpty = Stream.empty();
		
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		
		List<String> elements =
				  Stream.of("a", "b", "c").filter(element -> element.contains("b"))
				    .collect(Collectors.toList());
	    Optional<String> anyElement = elements.stream().findAny();
		Optional<String> firstElement = elements.stream().findFirst();
		
		System.out.println(anyElement);
		
		
	}

}
