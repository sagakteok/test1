import java.util.Scanner;
public class year {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϸ� ���� ���並 �Ǵ��� �ݴϴ�.");
		System.out.print("�⵵ �Է� >> ");
		int year = sc.nextInt();
		
		System.out.println(year+"���� "+((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "����":"���") + "�Դϴ�.");
	}	
}
