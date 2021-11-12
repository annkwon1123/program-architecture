package bounceball;

public class MovingBall {
	private int x_pos, y_pos;
	private int radius;
	private int x_velocity, y_velocity;
	private Box container;
	
	public MovingBall(int x_initial, int y_initial, int r, Box box) {
		x_pos = x_initial;
		y_pos = y_initial;
		radius = r;
		container = box;
	}
	
	public void move(int time_units) {
		x_pos = x_pos + x_velocity * time_units;
		if(container.inHorizontalContact(x_pos)) 
			x_velocity = -x_velocity;
		y_pos = y_pos + y_velocity * time_units;
		if(container.inHorizontalContact(y_pos)) 
			y_velocity = -y_velocity;
		return;
	}
	
	public int getX_pos(){
		return x_pos;
	}
	public int getY_pos(){
		return y_pos;
	}
	public int getRadius(){
		return radius;
	}
}
