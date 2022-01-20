package CodingTest;

import java.util.ArrayList;
import java.util.List;

public class No_functionDevelopment_YunMW {
	public static void main(String[] args) {
		int[] pro = {95, 90, 99, 99, 80, 99};
		int[] speed = {1, 1, 1, 1, 1, 1};

		int[] result = solution(pro, speed);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	public static int[] solution(int[] progresses, int[] speeds) {
        
        int[] days = new int[progresses.length];
        List<Integer> delay = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++) {
        	int num = (100 - progresses[i]) / speeds[i];
        	if ((100 - progresses[i]) % speeds[i] != 0) {num += 1;}
        	
        	days[i] = num;
        }
        int max = days[0];
        int cnt = 1;
        for(int i = 1; i < days.length; i++) {
        	if(max >= days[i]) {
        		cnt += 1;
        	}else {
        		delay.add(cnt);
        		max = days[i];
        		cnt = 1;
        	}
        	if(i == days.length - 1) {
        		delay.add(cnt);
        	}
        }
        
        int[] answer = new int[delay.size()];
        for(int i = 0; i < delay.size(); i++) {
        	answer[i] = delay.get(i);
        }
        return answer;
    }
}
