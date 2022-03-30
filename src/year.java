import java.util.Scanner;
public class year {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하면 윤년 여뷰를 판단해 줍니다.");
		System.out.print("년도 입력 >> ");
		int year = sc.nextInt();
		
		System.out.println(year+"년은 "+((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "윤년":"평년") + "입니다.");
	}	
}
