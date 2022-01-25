package CodingTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class No_printer_YunMW {
	public static void main(String[] args) {
		int[] pri = {1,2,2,4,3,2,1,2};
		int index = 2;
		
		int result = solution(pri, index);
//		System.out.println(result);
	}
	
	public static int solution(int[] priorities, int location) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//		hashmap 값 입력
		for(int i = 0; i < priorities.length; i++) {
			map.put(i, priorities[i]);
		}
		
//		
//		int[][] max = {{-1}, {-1}};
//		while(mapIter.hasNext()) {
//			int compare = mapIter.next();
//			if(map.get(mapIter.next()) > max[1][0]) {
//				System.out.println(mapIter.);
//			}
//		}
		for(int i = 0; i < map.size(); i = i) {
			System.out.println(map.size());
			int maxKey = findMax(map);
			int cnt = findOtherMax(map, maxKey);
//			System.out.println(maxKey);
			map.remove(maxKey);
		}
		
		
//		for(int i = maxKey; i < map.size(); i++) {
//			
//		}
		
        int answer = 0;
        return answer;
    }
	
	static int findMax(HashMap<Integer, Integer> map) {
		int maxValue = Collections.max(map.values());
		int maxKey = -1;
		for(Entry<Integer, Integer> mapEntry : map.entrySet()) {
			if(maxValue == mapEntry.getValue()) {
				maxKey = mapEntry.getKey();
				break;
			}
		}
		return maxKey;
	}
	static int findOtherMax(HashMap<Integer, Integer> map, int maxKey) {
		
		return 0;
	}
}
