import java.util.*;

public class H5_Q6 {
	public static void main(String[] args) {
		String correct_pw = "hyin";
		String input_pw = "";
		
		Scanner scan = new Scanner(System.in);
		
	    for(int i = 0; i < 3; i++ ) {
			System.out.print("암호를 입력하세요.");
			input_pw = scan.nextLine();
			if (input_pw.equals(correct_pw) ) {
				System.out.println("환영합니다.");
				return;
			}
			else {
				System.out.println("암호가 틀립니다.");
			}
		}
	    System.out.println("접속을 거부합니다.");
		return;
	}
}
