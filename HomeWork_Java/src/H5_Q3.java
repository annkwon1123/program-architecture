import java.util.Scanner;

public class H5_Q3 {
	public static void main(String[] args) {
		int grade;
		int numStudents = 0;
		int numPass = 0;
		int numFail = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first score (negative to exit)");
		grade = scan.nextInt();
		System.out.println();
		
		while (grade >= 0) {
			numStudents++;
			if (grade >= 60) numPass++;
			else numFail++;
			
			System.out.print("Enter the next score (negative to exit)");
			grade = scan.nextInt();
			System.out.println();
		}
		
		System.out.println("numStudents: " + numStudents);
		System.out.println("numPass: " + numPass);
		System.out.println("numFail: " + numFail);
	}
}
