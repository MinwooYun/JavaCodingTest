package CodingTest;

import java.util.Scanner;
import java.io.FileInputStream;

public class No1974_LimYJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			int answer = 1;// 이상한값이 없음
			int[][] sudoku = new int[9][9];
			// 스도쿠 값을 입력받음
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			// 가로 확인
			for (int i = 0; i < 9; i++) {
				int[] check = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };// 겹치는 숫자가 없음
				for (int x = 0; x < 9; x++) {
					check[sudoku[i][x] - 1] = 1;
				}
				for(int x=0;x<9;x++) {
					if (check[x] == 0) {
						answer = 0;
						break;
					}
				}
				
			}

			// 세로 확인
			for (int i = 0; i < 9; i++) {
				int[] check = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };// 겹치는 숫자가 없음
				for (int y = 0; y < 9; y++) {
					check[sudoku[y][i] - 1] = 1;
				}
				for(int y=0;y<9;y++) {
					if (check[y] == 0) {
						answer = 0;
						break;
					}
				}
			}
			// 9칸 확인
			int countX=0;
			int countY=0;
			for(int i=1;i<4;i++) {
				countX=0;
				for(int j=1;j<4;j++) {
					int[] check = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };// 겹치는 숫자가 없음
					for(int x=countX;x<3*j;x++) {
						for(int y=countY;y<3*i;y++) {
							check[sudoku[x][y] - 1] = 1;
						}
					}
					countX=countX+3;
					for(int t=0; t<9;t++) {
						if (check[t] == 0) {
							answer = 0;
							break;
						}
					}
				}
				countY=countY+3;
			}	
			
			System.out.println("#" + test_case + " " + answer);
		}
	}

}
