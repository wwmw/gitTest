package gitPrac;

import java.util.Scanner;

public class July16_Scanner {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input your age : ");
		int x = scan.nextInt();

		System.out.print("input your height : ");
		int y = scan.nextInt();
		
		System.out.println("\n\n--- INFORMATION ---");
		System.out.println("Age : " + x);
		System.out.println("Height : " + y);
		
		scan.close();
	}
}

// non-fast-forward Àç½ÇÇà