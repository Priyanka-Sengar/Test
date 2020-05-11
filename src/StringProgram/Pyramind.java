package StringProgram;

import java.util.Scanner;

public class Pyramind {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in); 
		int count=0;

		// Read the next integer from the screen 
		int  num = s.nextInt(); 
		
		for(int i=0;i<num;i++)
		{

			for(int j=num;j>i;j--)
			{
				System.out.print(j);
			}
			System.out.println();	
		}


	}

}
