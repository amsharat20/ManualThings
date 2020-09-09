import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerEx {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		List<Integer> lt = new ArrayList<Integer>();
		lt.add(2);
		
		List<int[]> lt2 = Arrays.asList(a);
		
		for(int[] ah : lt2 ){
			System.out.println(ah.toString());
		}
		
		
	}
}
