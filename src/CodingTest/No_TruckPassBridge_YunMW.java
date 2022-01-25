package CodingTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_TruckPassBridge_YunMW {
	public static void main(String[] args) {
		int[] truck = {10,10,10,10,10,10,10,10,10,10};
		int result = solution(100,100,truck);
		System.out.println(result);
	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> truck = new LinkedList<Integer>();
		List<Integer> bridge = new LinkedList<Integer>();
		List<Integer> length = new LinkedList<Integer>();
		int answer = 1;
		
		for(int i : truck_weights) {
			truck.add(i);
		}
		
		while(true) {
			//다리에 여유가 있으면 차량 추가
			int sum = bridge.stream().mapToInt(Integer::intValue).sum();
			if(!truck.isEmpty()) {
				if(sum + truck.peek() <= weight) {
					bridge.add(truck.poll());
					length.add(0);
				}
			}
			
			//1m 전진
			for(int i = 0; i < length.size(); i++) {
				length.set(i, length.get(i) + 1);
				
			}
			
			answer += 1;
			
			//차량이 도착하면 제거
			if(length.get(0) == bridge_length) {
				bridge.remove(0);
				length.remove(0);
			}
							
			if(truck.isEmpty() == true && bridge.size() == 0) {
				break;
			}
		}		
        return answer;
    }
}