import java.util.Scanner;
public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (1 ~ 12)�� �Է��Ͻÿ�: ");
		int month = sc.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		sc.close();
	}
}
