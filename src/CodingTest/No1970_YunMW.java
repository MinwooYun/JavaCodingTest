package CodingTest;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class No1970_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[][] total = new int[T][8];
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int money = sc.nextInt();
			LinkedHashMap<Integer, Integer> cnt = new LinkedHashMap<Integer, Integer>(){{
				put(50000, 0);
				put(10000, 0);
				put(5000, 0);
				put(1000, 0);
				put(500, 0);
				put(100, 0);
				put(50, 0);
				put(10, 0);
			}};
			
			for(Entry<Integer, Integer> count : cnt.entrySet()) {
				if(money >= count.getKey()) {
					cnt.replace(count.getKey(), money / count.getKey());
					money = money % count.getKey();
				}
			}
			
			int numCnt = 0;
			for(Entry<Integer, Integer> count : cnt.entrySet()) {
				total[test_case-1][numCnt] = count.getValue();
				numCnt += 1;
			}
		}
		for(int i = 0; i < T; i++) {
			System.out.println("#" + (i+1));
			for(int j = 0; j < 8; j++) {
				System.out.print(total[i][j] + " ");
			}
			System.out.println();
		}
	}
}