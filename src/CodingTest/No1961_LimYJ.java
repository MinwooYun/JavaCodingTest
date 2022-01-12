package CodingTest;

import java.util.Scanner;
import java.io.FileInputStream;

public class No1961_LimYJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다. 여러분이 작성한 코드를
		 * 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후, 이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때
		 * 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다. 따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		 * 단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		// System.setIn(new FileInputStream("res/input.txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			int n= sc.nextInt();
			int[][] lst = new int[n][n];
			// 숫자를 저장
			for(int x=0;x<lst.length;x++) {
				for(int y=0;y<lst[0].length;y++) {
					lst[x][y]=sc.nextInt();
				}
			}
			// 90도인 경우
			int[][] no90 = new int[n][n];
			int a=n-1;
			int b=0;
			for(int x=0;x<n;x++) {
				a=n-1;
				for(int y=0;y<n;y++) {
					no90[x][y]=lst[a][b];
					a--;
				}
				b++;
			}
			// 180도인 경우
			int[][] no180 = new int[n][n];
			a=n-1;
			for(int x=0;x<n;x++) {
				b=n-1;
				for(int y=0;y<n;y++) {
					no180[x][y]=lst[a][b];
					b--;
				}
				a--;
			}
			// 270도인 경우
			int[][] no270 = new int[n][n];
			b=n-1;
			for(int x=0;x<n;x++) {
				a=0;
				for(int y=0;y<n;y++) {
					no270[x][y]=lst[a][b];
					a++;
				}
				b--;
			}
			System.out.println("#" + test_case );
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(no90[i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) {
					System.out.print(no180[i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) {
					System.out.print(no270[i][j]);
				}
				System.out.println();
			}

		}
	}

}
