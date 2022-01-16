package CodingTest;
import java.util.Arrays;
import java.util.Scanner;

public class No2056_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T;
		T=sc.nextInt();
		int[] zero = {4,6,9,11};
		int[] one = {1,3,5,7,8,10,12};

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String result = "";
			
			String text = sc.next();
			if (text.length() == 8) {
				String year = text.substring(0,4);
				String month = text.substring(4, 6);
				String day = text.substring(6,8);
				int intMonth = Integer.valueOf(month);
				int intDay = Integer.valueOf(day);
				if(intMonth < 1 || intMonth > 12) {
					result = "-1";
				}
				if(Arrays.asList(zero).contains(intMonth)) {
					if(intDay < 1 || intDay > 30) {
						result = "-1";
					}
				}
				if(Arrays.asList(one).contains(intMonth)) {
					if(intDay < 1 || intDay > 31) {
						result = "-1";
					}
				}
				if("02".equals(month)) {
					if(intDay < 1 || intDay > 28) {
						result = "-1";
					}
				}
				if(result != "-1") {
					System.out.println("#" + test_case + " " + year + "/" + month + "/" + day);
				}
				
			}else {
				result = "-1";
			}
			
			if("-1".equals(result)) {
				System.out.println("#" + test_case + " -1");
			}
		
			
		}
	}
}
