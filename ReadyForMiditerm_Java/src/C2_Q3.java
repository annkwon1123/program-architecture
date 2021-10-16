
public class C2_Q3 {
	public static int getCRT(int p1, int p2, int r1, int r2) {
		int result = -1;
		for(int i = 0; i < p1*p2; i++) {
			for(int j = 0; j < p1; j++) {
				if(p1*j+r1 == p2*i+r2) result = p1*j+r1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getCRT(5, 7, 3, 4));
	}
}
