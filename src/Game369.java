import java.util.Scanner;
public class Game369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 99사이의 정수를 입력하세요 >> ");
		int num = sc.nextInt();
		
		int num10 = num/10;
		int num1 = num/1;
		
		if (num10%3==0 && num1%3==0)
			System.out.println("박수짝짝!");
		else if ((num10%3==0 && num1%3!=0) || (num10%3!=0 && num1%3==0))
			System.out.println("박수 짝!");
		else
			System.out.println("짝수 없음...");
		
		sc.close();
	}
}
