
public class Q4 {

	public static String reverseString (String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result; 
	}
	public static int countPalindrome (String s) {
		int result = 0; 
		// fill here! 
		for(int i = 0; i < s.length()/2; i++) {
			if(s.substring(i, s.length() - i).equals(reverseString(s).substring(i, s.length() - i))){
			result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(countPalindrome("abcba")); // 2
		System.out.println(countPalindrome("abcdcba")); // 3
	}
}
