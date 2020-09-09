package AdapterPattern;

public class PenAdapter implements Pen {

	
	PilotPen pilot = new PilotPen();
	
	@Override
	public void write(String str) {
		pilot.mark(str);
	}
}
