import java.util.Scanner;

public class H5_Q5 {
	public static void main(String[] args) {
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		n = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0 && i != j) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		return;
	}
}
