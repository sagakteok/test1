import java.util.Scanner;
public class Nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� (0 ~ 100): ");
		int score = sc.nextInt();
		
		System.out.print("�г��� �Է��ϼ��� (1 ~ 4): ");
		int grade = sc.nextInt();
		
		if (score >= 60) {
			if (grade != 4)
				System.out.println("�հ�!");
			else if (score >= 70)
				System.out.println("�հ�!");
		}
		else
			System.out.println("���հ�...");
		
		sc.close();
	}
}
