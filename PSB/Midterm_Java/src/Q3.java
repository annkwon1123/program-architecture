
public class Q3 {

	public static boolean isCompleteNumber(int n) {
		// fill here!
		boolean result = false;
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		
		if(n == sum) result= true;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(isCompleteNumber(10)); // false
		System.out.println(isCompleteNumber(6)); // true
		System.out.println(isCompleteNumber(28)); // true
		System.out.println(isCompleteNumber(100)); // false
		System.out.println(isCompleteNumber(496)); // true
		System.out.println(isCompleteNumber(8128)); // true
	}
}
