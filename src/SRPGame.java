import java.util.Scanner;
public class SRPGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �� ���� ����! ���� ���� �� �߿��� �Է��ϼ���.");
		
		System.out.print("ö��>> ");
		String cheol = sc.next(); // ���ڿ��� �޴´� (int�� �ƴϰ� String)
		
		System.out.print("����>> ");
		String young = sc.next(); // nextInt�� �ƴϴ�!! next��!
		
		if (cheol.equals("����")){
			if (young.equals("����"))
				System.out.println("�����ϴ�.");
			else if(young.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		else if(cheol.equals("����")) {
			if (young.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if (young.equals("����"))
				System.out.println("�����ϴ�.");
			else
				System.out.println("���� �̰���ϴ�.");
		}
		else {
			if (young.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if (young.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
		sc.close();
	}
}
