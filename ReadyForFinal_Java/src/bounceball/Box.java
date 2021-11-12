package bounceball;

public class Box {
	private int BOX_SIZE;
	
	public boolean inHorizontalContact(int x_position) {
		boolean result = false;
		if ( x_position < BOX_SIZE) result = true;
		return result;
	}
	
	public boolean inVerticalContact(int y_position) {
		boolean result = false;
		if (y_position < BOX_SIZE) result = true;
		return result;
	}
}
