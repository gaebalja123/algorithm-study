import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str);
		int[] arr = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - 64;
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}