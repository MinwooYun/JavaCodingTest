package CodingTest;

import java.util.Scanner;
import java.io.FileInputStream;

public class No2056_LimYJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
 		for(int test_case = 1; test_case <= T; test_case++)
		{
 			int[] last = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			String input= sc.next();
			String year= input.substring(0, 4);
			String month= input.substring(4, 6);
			String day= input.substring(6, 8);
			if((Integer.parseInt(day)<1||Integer.parseInt(day)>last[Integer.parseInt(month)])||(Integer.parseInt(month)<1||Integer.parseInt(month)>12)) {
				System.out.println("#"+test_case+" "+"-1");
			} else {
				System.out.println("#"+test_case+" "+year+"/"+month+"/"+day);
			}

		}
		
	}

}
