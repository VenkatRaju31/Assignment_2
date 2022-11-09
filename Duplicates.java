package Assignment2;
import java.util.Scanner;

//WAP to find the duplicates present in an array.

public class Duplicates {

	public static void main(String[] args) {
		
		int a[] = {5,9,6,7,6,10,5,4};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("The Duplicate value " +a[j]+ " is present in index "+i+" and "+j);
					count++;
				}
			}
		}
		
		if(count==0)
		{
			System.out.println("the array does not have duplicates");
			
		}
	}

}
