/*
 * No.46 はじめのn歩
 * https://yukicoder.me/problems/43
 */
package answer;

import java.util.Scanner;

public class No_46 {

	public static void main(String[] args) {

		// 入力値定義
		Scanner input = new Scanner(System.in);
		int step = input.nextInt();
		int distance = input.nextInt();

		// 処理部
		int cal = (distance / step );

		if((cal * step) < distance){
			cal = (cal + 1);
		}

		System.out.println(cal);

	}

}
