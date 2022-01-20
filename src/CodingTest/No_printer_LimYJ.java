package CodingTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class No_printer_LimYJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prioriteis[] = {1,1,9,1,1,1};//1,1,9,1,8,1
		int location = 0;
		System.out.println(solution(prioriteis,location));
	}

	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Map<Integer, Integer> printList = new HashMap<Integer, Integer>();
        // 아직 우선도가 오지 않은 값을 저장
        ArrayList<Integer> in = new ArrayList<Integer>();
        // 우선도에 따라 출력된 순번 저장
        ArrayList<Integer> out = new ArrayList<Integer>();
        // 해쉬에 (순서, 우선도)로 값을 저장
        for(int i =0; i<priorities.length;i++) {
        	printList.put(i, priorities[i]);
        	in.add(i);
        }        
        // 변수선언
        int max; // 해쉬에서 우선도 최고값저장
        int count; // 남은 출력물 리스트 확인
        
        while(printList.size()!=0) {
        	max=Collections.max(printList.values());
        	count = in.size();
        	//System.out.println(max+","+count);
        	for(int i =0; i<count;i++) {
        		int key=in.get(0);
            	// 우선순위 최고인 경우 out에 저장
        		if(printList.get(key)==max) {
        			out.add(key);
            		printList.remove(key);
            		in.remove(0);
            		break;
            	// 우선순위 최고가 아닌 경우 in에 저장
        		} else {
        			in.add(key);
        			//System.out.println(in);
        			in.remove(0);
            	}
            }
        }
        	//System.out.println(printList);
        	//System.out.println(out);
        	//System.out.println(in);
        //출력값 설정
        answer=out.indexOf(location)+1;
        return answer;
    }
}
