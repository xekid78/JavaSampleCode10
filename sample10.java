/**
 *
 * @author xekid78
 *
 */
import java.util.Scanner;

public class sample10 {

	public static void main(String[] args) {
		System.out.println("数値の入力をお願いします。");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + "と入力しました。");
		scan.close();

	}

}
