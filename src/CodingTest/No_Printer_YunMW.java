
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_Printer_YunMW {
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 2};
		int location = 2;
		System.out.println(solution(arr, location));
		
	}
	public static int solution(int[] priorities, int location) {
		Queue<Integer> priList = new LinkedList<>();
		Queue<Integer> priIndex = new LinkedList<>();
		List<Integer> answerList = new LinkedList<>();
		List<Integer> answerIndex = new LinkedList<>();
		
		//배열 값 입력
		for(int i = 0; i < priorities.length; i++) {
			priList.add(priorities[i]);
			priIndex.add(i);
		}
		
		while(priList.size() != 0) {
			//최대값일 경우 새로운 리스트에 저장
			if(priList.peek() == Collections.max(priList)){
				answerList.add(priList.poll());
				answerIndex.add(priIndex.poll());
			}else {
				priList.add(priList.poll());
				priIndex.add(priIndex.poll());
			}
		}
		int answer = 0;
		for(int i = 0; i < answerIndex.size(); i++) {
			if(answerIndex.get(i) == location) {
				answer = i + 1;
				break;
			}
		}	
		return answer;
	}
}
