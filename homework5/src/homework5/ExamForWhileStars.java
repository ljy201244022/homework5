package homework5;
import java.util.*;
public class ExamForWhileStars {
 
	public static void main(String[] args) {
		int num;
		do{
		Scanner s = new Scanner(System.in);
		System.out.println("1.���簢�� �����");
		System.out.println("2.�����ﰢ �����");
		System.out.println("3.�̵�ﰢ�� �����");
		System.out.println("4.���̾Ƹ�� �����");
		System.out.println("5.�����ϱ�");
		System.out.println("���ϴ� �޴��� >> ");
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
	System.out.println("���α׷� ����!");
	}
}