import java.util.Scanner;
public class twenties {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ�: "); // �� �ٲ� ����
		int age = sc.nextInt();
		if ((age >= 20) && (age <= 30)) {
			System.out.println("20���Դϴ�."); // �� �ٲ�
			System.out.println("20��� �ູ�մϴ�!!");
		}
		else
			System.out.println("20�밡 �ƴմϴ�...");
		
		sc.close(); // sc��� ��ĳ�� ����
	}
}
