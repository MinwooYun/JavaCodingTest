package CodingTest;

import java.util.Scanner;

public class No1974_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T;
		T=sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String result = "1";
			int[][] arr = new int[9][9];
			for(int i = 0; i < 9; i++) {
				String num = sc.nextLine();
				String[] numSplit = num.split(" ");
				
				for(int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(numSplit[j]); 
				}
			}//end for 스도쿠 추가
			int sum = 0;
			
			for(int i = 0; i < 9; i += 3) {
				sum = 0;
				for(int a = 0; a < 3; a++) {
					for(int b = i; b < i + 3; b++) {
						sum += arr[a][b];
					}
				}
				if(sum != 45) result = "0";
				
				sum = 0;
				for(int a = 3; a < 6; a++) {
					for(int b = i; b < i + 3; b++) {
						sum += arr[a][b];
					}
				}
				if(sum != 45) result = "0";
				
				sum = 0;
				for(int a = 6; a < 9; a++) {
					for(int b = i; b < i + 3; b++) {
						sum += arr[a][b];
					}
				}
				if(sum != 45) result = "0";
				
			}//end for (9 x 9)
			// sum = 행, sum1 = 열
			int sum1 = 0;
			
			for(int a = 0; a < 9; a++) {
				sum = 0;
				sum1 = 0;
				for(int b = 0; b < 9; b++) {
					sum += arr[a][b];
					sum1 += arr[b][a];
				}
				if(sum != 45 || sum1 != 45) result = "0";
			}
			System.out.println("#" + test_case + " " + result);
		}
	}
}