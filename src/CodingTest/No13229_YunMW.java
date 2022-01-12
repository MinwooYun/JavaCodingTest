package CodingTest;
import java.util.HashMap;
import java.util.Scanner;

public class No13229_YunMW {
	public static void main(String[] args) {
		HashMap<String, Integer> week = new HashMap<>();
		week.put("MON", 1);
		week.put("TUE", 2);
		week.put("WED", 3);
		week.put("THU", 4);
		week.put("FRI", 5);
		week.put("SAT", 6);
		week.put("SUN", 7);
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.next();
			
			int result = week.get("SUN") - week.get(str);
			if(result == 0) {
				result = 7;
			}
			
			System.out.println("#" + test_case + " " + result);
		}
		
	}
}
