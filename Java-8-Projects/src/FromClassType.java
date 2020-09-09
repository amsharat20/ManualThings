import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FromClassType {
	
	
	public static void main(String[] args) {
		
		List<String> lt = Arrays.asList("please","help");
		
		List<String> sorted  = lt.
				                  stream()
				                  .sorted((s1,s2) -> s1.compareTo(s2))
				                  .collect(Collectors.toList());
		System.out.println(sorted);
		
		List<String> ltalt = lt.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(ltalt);
				                
		
		
		
	}

}
