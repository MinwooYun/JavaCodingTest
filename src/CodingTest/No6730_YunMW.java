package CodingTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class No6730_YunMW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		T=sc.nextInt();
		
		int[] max_De = new int[T];
		int[] max_In = new int[T];

		for(int test_case = 1; test_case <= T; test_case++)
		{
			//장애물의 수
			int cnt = sc.nextInt();
			sc.nextLine();
			ArrayList<Integer> list = new ArrayList<Integer>(cnt);
			
			//한줄 내용 입력
			String str = sc.nextLine();
			String[] strList = str.split(" ");
			
			//입력값을 숫자로 변환
			for(String a : strList) {
				list.add(Integer.parseInt(a));
			}
			
			Iterator<Integer> iterList = list.iterator();
			
			int val = iterList.next();
			

			while(iterList.hasNext()) {	
				int val_next = iterList.next();
				if(val < val_next) {
					if(max_In[test_case - 1] < val_next - val) {
						max_In[test_case - 1] = val_next - val;
					}

				}else if(val_next < val) {
					if(max_De[test_case - 1] < val - val_next) {
						max_De[test_case - 1] = val - val_next;
					}
				}
				val = val_next;			
			}
			
		}
		for(int i = 0; i < T; i++) {
			System.out.println("#" + (i + 1) + " " + max_In[i] + " " + max_De[i]);
		}
	}
}