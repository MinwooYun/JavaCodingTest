package CodingTest;

import java.util.Scanner;

public class No1961_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			sc.nextLine();
			int[][] arr = new int[N][N];
			
//			행, 열 2차원 배열 생성
			for(int i = 0; i < N; i++) {
				String row = sc.nextLine();
				String[] rowSplit = row.split(" ");
				
				for(int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(rowSplit[j]);
				}
			}
			
			int[][] arr90 = new int[N][N];
			if(N%2 == 1) {
				arr90[N/2][N/2] = arr[N/2][N/2];
			}
			
			int[][] arr180 = new int[N][N];
			if(N%2 == 1) {
				arr180[N/2][N/2] = arr[N/2][N/2];
			}
			
			int[][] arr270 = new int[N][N];
			if(N%2 == 1) {
				arr270[N/2][N/2] = arr[N/2][N/2];
			}
			
			int newN = N - 1;
			
			for(int i = 0; i < N/2; i++) {
				for(int j = i; j < N - i; j++) {
					//90도
					arr90[i][j] = arr[newN-j][i];
					arr90[j][newN-i] = arr[i][j];
					arr90[newN-i][newN-j] = arr[j][newN-i];
					arr90[newN-j][i] = arr[newN-i][newN-j];
					
					//180도
					arr180[i][j] = arr[newN-i][newN-j];
					arr180[j][newN-i] = arr[newN-j][i];
					arr180[newN-i][newN-j] = arr[i][j];
					arr180[newN-j][i] = arr[j][newN-i];
					
					//270도
					arr270[newN-j][i] = arr[i][j];
					arr270[i][j] = arr[j][newN-i];
					arr270[j][newN-i] = arr[newN-i][newN-j];
					arr270[newN-i][newN-j] = arr[newN-j][i];
				}
			}
			
			System.out.println("#" + test_case);
			
			for(int a = 0; a < N; a++) {
				for(int b = 0; b < N; b++) {
					System.out.print(arr90[a][b]);
				}
				System.out.print(" ");
				for(int b = 0; b < N; b++) {
					System.out.print(arr180[a][b]);
				}
				System.out.print(" ");
				for(int b = 0; b < N; b++) {
					System.out.print(arr270[a][b]);
				}
				System.out.println();
			}
		}
	}
}
