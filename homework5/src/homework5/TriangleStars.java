package homework5;
import java.util.*;
public class TriangleStars {
	int num, exit;
	void init(){
	do{
		if((this.exit = this.input()) == 0)	
 			this.print(); 
       } while(this.exit == 0);  
 		 
        System.out.println("\n���α׷� ����!\n");
      }
	int input() { 
		  Scanner s = new Scanner(System.in); 
		  System.out.print("�����ﰢ���� ���ʿ���� �����Է� : "); 
		  		 
		  if(s.hasNextInt()) 
		  	this.num = s.nextInt(); 
		  else if(s.next().equals("Q")) 
		  	return 1; 
		  		 
		  return 0; 
	 }
	void print()
	{
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
	}
	}
}