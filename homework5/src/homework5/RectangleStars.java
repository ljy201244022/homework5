package homework5;
import java.util.*;
public class RectagleStars {
	int exit;
	int num;
	void init(){
	do { 
		if((this.exit = this.input()) == 0)	
 			this.print(); 
 } while(this.exit == 0); 
	 System.out.println("\n ���α׷� ����! \n");
	 
	 
}
	int input() { 
		  
		 Scanner s = new Scanner(System.in);
		 System.out.print("���簢�� ũ���Է� : ");
		  
		if(s.hasNextInt()) 
		  	this.num = s.nextInt(); 
		  else if(s.next().equals("Q")) 
		  	return 1; 
		  		 
		  return 0; 
	 }
	void print(){
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}