import java.util.Scanner;
public class twenties {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오: "); // 줄 바꿈 안함
		int age = sc.nextInt();
		if ((age >= 20) && (age <= 30)) {
			System.out.println("20대입니다."); // 줄 바꿈
			System.out.println("20대라서 행복합니다!!");
		}
		else
			System.out.println("20대가 아닙니다...");
		
		sc.close(); // sc라는 스캐너 종료
	}
}
