import java.util.Scanner;
public class MoneyChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
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
		
		System.out.println("오만원 " + won50000 + "개");
		System.out.println("만원 "+won10000+"개");
		System.out.println("오천원 "+won5000+"개");
		System.out.println("천원 "+won1000+"개");
		System.out.println("오백원 "+won500+"개");
		System.out.println("백원 "+won100+"개");
		System.out.println("십원 "+won10+"개");
		
		sc.close();
		
	}
}
