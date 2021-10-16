
public class C1_Q4 {
	public static int newfibonacci(int n) {
		if (n < 4) return 1;
		else return newfibonacci(n-3) + newfibonacci(n-1);
	}
	public static void main(String[] args) {
		System.out.println(newfibonacci(10));
	}
}
