package CodingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class No1970_LimYJ {

	public static void main(String[] args) {
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
			int atai = sc.nextInt();
			// 해쉬맵 선언
			HashMap<Integer, Integer> money = new HashMap<Integer, Integer>();
			money.put(50000, 0);
			money.put(10000, 0);
			money.put(5000, 0);
			money.put(1000, 0);
			money.put(500, 0);
			money.put(100, 0);
			money.put(50, 0);
			money.put(10, 0);

			List<Integer> keyLst = new ArrayList<Integer>();
			keyLst.add(50000);
			keyLst.add(10000);
			keyLst.add(5000);
			keyLst.add(1000);
			keyLst.add(500);
			keyLst.add(100);
			keyLst.add(50);
			keyLst.add(10);
			
			int count = 0;
			while (atai > 9) {
				if (atai >= keyLst.get(count)) {
					money.replace(keyLst.get(count), atai / keyLst.get(count));
					atai = atai % keyLst.get(count);
				} else if (count < keyLst.size() - 1) {
					count++;
				}

			}
			System.out.println("#"+test_case);
			for (int i = 0; i < keyLst.size(); i++) {
				System.out.print(money.get(keyLst.get(i)));
				if(i==keyLst.size()-1) {
					System.out.println();
				}
				else {
					System.out.print(" ");
				}
				
			}
			

		}

	}

}
