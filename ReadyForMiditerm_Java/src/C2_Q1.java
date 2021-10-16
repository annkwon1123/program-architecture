import java.util.Scanner;
public class C2_Q1 {
	public static void main(String[] args) {
		String name;
		int number;
		int numsq;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Your name: ");
		name = scan.next();
		System.out.print("Your favorite number: ");
		number = scan.nextInt();
		numsq = number*number;
		System.out.println(name +", the sqare of your favorite number = "+numsq);
		scan.close();
	}
}
