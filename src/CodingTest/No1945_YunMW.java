package CodingTest;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class No1945_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[][] result = new int[T][5];
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int number = sc.nextInt();

			//2,3,5,7,11
			LinkedHashMap<Integer, Integer> mapNum = new LinkedHashMap<Integer, Integer>() {{
				put(2, 0);
				put(3, 0);
				put(5, 0);
				put(7, 0);
				put(11, 0);
			}};
			
			while(number != 1) {
				for(Entry<Integer, Integer> entryList : mapNum.entrySet()) {
					if(number % entryList.getKey() == 0) {
						number = number / entryList.getKey();
						mapNum.replace(entryList.getKey(), entryList.getValue() + 1);
					}
				}
			}
			
			int cnt = 0;
			for(Entry<Integer, Integer> entryList : mapNum.entrySet()) {
				result[test_case-1][cnt] = entryList.getValue();
				cnt += 1;
			}
		}
		for(int i = 0; i < T; i++) {
			System.out.print("#" + (i+1) + " ");
			for(int j = 0; j < 5; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}