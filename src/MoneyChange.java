import java.util.Scanner;
public class MoneyChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = sc.nextInt();
		
		int won50000 = money/50000;
		money = money%50000;
		int won10000 = money/10000;
		money = money%10000;
		int won5000 = money/5000;
		money = money%5000;
		int won1000 = money/1000;
		money = money%1000;
		int won500 = money/500;
		money = money%500;
		int won100 = money/100;
		int won10 = money%100;
		
		System.out.println("������ " + won50000 + "��");
		System.out.println("���� "+won10000+"��");
		System.out.println("��õ�� "+won5000+"��");
		System.out.println("õ�� "+won1000+"��");
		System.out.println("����� "+won500+"��");
		System.out.println("��� "+won100+"��");
		System.out.println("�ʿ� "+won10+"��");
		
		sc.close();
		
	}
}
