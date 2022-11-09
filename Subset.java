package Assignment2;

//WAP to check whether an array is a subset of another array.
public class Subset {

	public static void main(String[] args) {
		
		int a[] = {1,2,6,7,8};
		int b[] = {2,6,7,8,1,9};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
		}
		if(count==a.length)
		{
			System.out.println("a is subset of b ");
		}
		else
		{
			System.out.println("a is not subset of b");
		}

	}

}
