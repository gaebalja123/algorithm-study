import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =1; i <= 10;i++) {
			Queue<Integer> og = new LinkedList<>();
			int T = sc.nextInt();
			for(int j =1; j <= 8;j++) {
			og.add(sc.nextInt());
			}
			
			int cnt = 0;
			while(true) {
				int a = og.poll() - (++cnt);
				if(a <= 0) {
					og.add(0);
					break;
				}
				og.add(a);
				cnt %= 5;
			}
			System.out.print("#"+i+" ");
			while(!og.isEmpty()) {
				System.out.print(og.poll()+" ");
			}
			System.out.println();
		}
	}
}