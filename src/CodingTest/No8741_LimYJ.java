package CodingTest;

import java.util.Scanner;

public class No8741_LimYJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			// 단어를 입력받음
			String[] word = new String[3];
			for(int i=0;i<3;i++) {
				String tmp=sc.next();
				tmp=tmp.toUpperCase();
				word[i]=tmp.substring(0, 1);
			}
			System.out.println("#"+test_case+" "+word[0]+word[1]+word[2]);
			
		}
	}

}
