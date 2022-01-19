package CodingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class No7728_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		List<Integer> total = new ArrayList<>(T);
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String num = sc.next();
			String[] numArr = new String[num.length()];
			HashMap<String,Integer> map = new HashMap<>();
			for(int i = 0; i < num.length(); i++) {
				numArr[i] = num.substring(i, i+1);
			}
			
			for(int i = 0; i < num.length(); i++) {
				if(map.containsKey(numArr[i])) {}
				else {
					map.put(numArr[i], 1);
				}
			}
			total.add(map.size());

		}
		for(int i = 0; i < T; i++) {
			System.out.println("#" + (i + 1) + " " + total.get(i));
		}
	}
}