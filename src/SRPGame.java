import java.util.Scanner;
public class SRPGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임 시작! 가위 바위 보 중에서 입력하세요.");
		
		System.out.print("철수>> ");
		String cheol = sc.next(); // 문자열을 받는다 (int가 아니고 String)
		
		System.out.print("영희>> ");
		String young = sc.next(); // nextInt가 아니다!! next다!
		
		if (cheol.equals("가위")){
			if (young.equals("가위"))
				System.out.println("비겼습니다.");
			else if(young.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		else if(cheol.equals("바위")) {
			if (young.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if (young.equals("바위"))
				System.out.println("비겼습니다.");
			else
				System.out.println("영희가 이겼습니다.");
		}
		else {
			if (young.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else if (young.equals("바위"))
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
		sc.close();
	}
}
