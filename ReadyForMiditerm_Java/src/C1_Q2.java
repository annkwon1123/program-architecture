class Triangle {
	public int side1, side2, side3;
	public boolean isRightAngled() {
		if (side1*side1 == side2*side2 + side3*side3)
			return true;
		else
			return false;
	}
	public boolean isTwoEqualSided() {
		if (side1 == side2 || side2 == side3)
			return true;
		else
			return false;
	}
	public boolean isAllEqualSided() {
		if (side1 == side2 && side2 == side3)
			return true;
		else
			return false;
	}
	public boolean isAcute() {
		if (side1*side1 < side2*side2 + side3*side3)
		return true;
	else
		return false;
	}
	public boolean isObtuse() {
		if (side1*side1 > side2*side2 + side3*side3)
			return true;
		else
			return false;
	}
    public Triangle(int v1, int v2, int v3) {
    	if (v1 >= v2 && v1 >= v3) {
    		side1 = v1;
    		if (v2 >= v3) {
    			side2 = v2;
    			side3 = v3;
    		}
    		else {
    			side2 = v3;
    			side3 = v2;
    		}
    	}
    	else if (v2 >= v1 && v2 >= v3) {
    		side1 = v2;
    		if (v1 >= v3) {
    			side2 = v1;
    			side3 = v3;
    		}
    		else {
    			side2 = v3;
    			side3 = v1;
    		}
    	}
    	else {
    		side1 = v3;
    		if (v1 >= v2) {
    			side2 = v1;
    			side3 = v2;
    		}
    		else {
    			side2 = v2;
    			side3 = v1;
    		}
    	}
    	
	}

}

public class C1_Q2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3,5,4);
		System.out.println(t1.isRightAngled());
		System.out.println(t1.isObtuse());
		System.out.println(t1.isAllEqualSided());
		Triangle t2 = new Triangle(10,3,4);
		System.out.println(t2.isRightAngled());
		System.out.println(t2.isObtuse());
		System.out.println(t2.isAllEqualSided());
	}
}