/*
 * No.388 階段 (1)
 * https://yukicoder.me/problems/961
 */
package answer;

import java.util.Scanner;

public class No_388 {

	public static void main(String[] args) {

		// 入力値
		Scanner input = new Scanner(System.in);
		int step = input.nextInt();
		int floor = input.nextInt();

		int ans = ((step / floor) +1);

		System.out.println(ans);



	}

}
