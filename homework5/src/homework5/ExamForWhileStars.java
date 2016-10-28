package homework5;
import java.util.*;
public class ExamForWhileStars {
 
	public static void main(String[] args) {
		int num;
		do{
		Scanner s = new Scanner(System.in);
		System.out.println("1.정사각형 별찍기");
		System.out.println("2.직각삼각 별찍기");
		System.out.println("3.이등변삼각형 별찍기");
		System.out.println("4.다이아몬드 별찍기");
		System.out.println("5.종료하기");
		System.out.println("원하는 메뉴는 >> ");
		num = s.nextInt();
		if(num == 1)
			new RectangleStars().init();
		else if(num == 2)
			new TriangleStars().init();
		else if(num == 3)
			new IsoscelesTriangleStars().init();
		else if(num == 4)
			new DiamondStars().init();
	} while (num != 5);
	System.out.println("프로그램 종료!");
	}
}