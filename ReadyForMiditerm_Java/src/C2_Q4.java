
public class C2_Q4 {
	public static String toKary(int n, int k) {
		if(n < k) return ""+n;
		else {
			//(n/k) % k
			return "" + toKary(n/k, k)+ n%k;
		}
	}
	public static void main(String[] args) {
		System.out.println(toKary(15,2));
		System.out.println(toKary(15,3));
	}
}
