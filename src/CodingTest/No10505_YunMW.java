package CodingTest;

import java.util.Scanner;

public class No10505_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int people;
		
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int total = 0;
			int sum = 0;
			people = sc.nextInt();
			int[] income = new int[people];
			for(int i = 0; i < people; i++) {
				income[i] = sc.nextInt();
				sum += income[i];
			}
			total = sum / people;
			
			int cnt = 0;
			for(int j = 0; j < people; j++) {
				if(income[j] <= total) {
					cnt += 1;
				}
			}
			
			
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}
