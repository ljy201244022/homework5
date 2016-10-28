package homework5;
import java.util.*;
public class IsoscelesTriangleStars {
	int num;
	int exit;
	void init(){
		do { 
			if((this.exit = this.input()) == 0)	//in case of loop 
	 			this.print(); 
			} while(this.exit == 0); //loop if not in exit state 
	 		 
		System.out.println("\n 프로그램 종료! \n");
}
	int input(){
		Scanner s = new Scanner(System.in);
		System.out.print("이등변삼각형 높이입력 : ");
		if(s.hasNextInt()) 
		  	this.num = s.nextInt(); 
		  else if(s.next().equals("Q")) 
		  	return 1; 
		  		 
		  return 0; 
	}
	void print(){
		for(int i = 0; i < num; i++){
			for(int j = 1; j < num - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k < i * 2 + 1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}