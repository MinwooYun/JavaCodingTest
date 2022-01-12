package CodingTest;
import java.util.Scanner;
import java.io.FileInputStream;

public class No10505_LimYJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int memory = sc.nextInt();
			int[] list = new int[memory];
			int sum=0;
			int count=0;
			for(int i=0; i<memory; i++) {
				list[i]=sc.nextInt();
				sum=sum+list[i];
			}
			int avg= sum/memory;
			for(int i=0; i<memory; i++) {
				if(list[i]<=avg) count++;
			}
			System.out.println("#" + test_case + " " + count);
		}
	}

}
