import java.util.LinkedList;
import java.util.List;

public class No_StockPrice_YunMW {
	public static void main(String[] args) {
		int[] prices = {2,3,5,2,3,1};
		int[] result = solution(prices);
		for(int i : result) {
			System.out.println(i);
		}
	}
	public static int[] solution(int[] prices) {
		List<Integer> result = new LinkedList<Integer>();
		int[] answer = new int[prices.length];
		
		for (int i = 0; i < prices.length - 1; i++) {
			int cnt = 0;
			for (int j = i + 1; j < prices.length; j++) {
				cnt += 1;
				if(prices[i] > prices[j]) {
					break;
				}
			}
			answer[i] = cnt;
		}
		answer[prices.length - 1] = 0;
		
        return answer;
    }
}