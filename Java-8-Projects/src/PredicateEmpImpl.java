import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEmpImpl {

	public static Predicate<PredicateEmp> isAdultMale() {
		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}

	public static List<PredicateEmp> filterEmployees (List<PredicateEmp> employees,
			Predicate<PredicateEmp> predicate)
	{
		return employees.stream()
				.filter( predicate )
				.collect(Collectors.<PredicateEmp>toList());
	}

}
