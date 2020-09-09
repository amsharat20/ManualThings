import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PredicateEmpMain {

	public static void main(String[] args) {

		PredicateEmp e1 = new PredicateEmp(1,23,"M");
		PredicateEmp e2 = new PredicateEmp(2,13,"F");

		List<PredicateEmp> employees = new ArrayList<PredicateEmp>();
		employees.addAll(Arrays.asList(new PredicateEmp[]{e1,e2}));
		
		PredicateEmpImpl e = new PredicateEmpImpl();

		System.out.println( e.filterEmployees(employees, e.isAdultMale()) );

		//System.out.println( filterEmployees(employees, isAdultFemale()) );

		//System.out.println( filterEmployees(employees, isAgeMoreThan(35)) );





	}

}
