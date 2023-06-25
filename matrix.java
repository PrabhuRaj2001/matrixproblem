package sample;
import java.util.*;
public class prabhu {
	
	static int a=12;

	public static void main(String[] args) throws Exception {
		int c=65,d=1;
		
		for(int i=1;i<=10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j%2==0)
				{
					
					System.out.print((char)c +" ");
					c=c+1;
				}
				else
				{
					
					System.out.print(d+" ");
					d=d+2;
				}
			}
			c=65;
			d=1;
			
			System.out.println();
		}
		
	}
	
	
}
