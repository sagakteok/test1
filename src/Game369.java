import java.util.Scanner;
public class Game369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� 99������ ������ �Է��ϼ��� >> ");
		int num = sc.nextInt();
		
		int num10 = num/10;
		int num1 = num/1;
		
		if (num10%3==0 && num1%3==0)
			System.out.println("�ڼ�¦¦!");
		else if ((num10%3==0 && num1%3!=0) || (num10%3!=0 && num1%3==0))
			System.out.println("�ڼ� ¦!");
		else
			System.out.println("¦�� ����...");
		
		sc.close();
	}
}
