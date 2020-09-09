package AdapterPattern;

public class School {
	
	
	// The adapter pattern converts the interface of a class into another interface the clients expects.
	// Adapter allows to reuse existing coding without changing it, 
	// as the adapter ensures the conversion between the different interfaces.
	
	public static void main(String[] args) {
		
		Pen p = new PenAdapter();
		AssignmentWork assign = new AssignmentWork();
		assign.setP(p);
		assign.writeAssignment("Not completed");
		
	}
}
