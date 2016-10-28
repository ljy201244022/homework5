package homework5;
import java.util.*;
public class DiamondStars {
	int num, exit;
	void init(){
			do { 
			if((this.exit = this.input()) == 0)	 
	 			this.print(); 
			} while(this.exit == 0);  
	 System.out.println("\n 프로그램 종료! \n");
	}
	int input(){
		Scanner s = new Scanner(System.in);
		System.out.print("다이아몬드 크기입력 : ");
		if(s.hasNextInt()) 
		  	this.num = s.nextInt(); 
		  else if(s.next().equals("Q")) 
		  	return 1; 
		  		 
		  return 0; 
	}
	void print(){
		for(int i = 0; i <= num; i++){
			if(i <= 5)
			{
				for(int j = 0; j < 5-i; j++)
				{
					System.out.print(" ");
				}
				for(int j = 0; j < i; j++){
					System.out.print("*");
				}
				if(i >= 2){
					for(int j = 0; j < i-1; j++){
						System.out.print("*");
					}
				}
				System.out.println("");
			} else if(i > 5){
				for(int j = 0; j < i - 5; j++){
					System.out.print(" ");
				}
				for(int j = 0; j < 10 - i; j++){
					System.out.print("*");
				}
				if(i>=6){
					for(int j = 0; j < 9-i; j++){
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
	}
}