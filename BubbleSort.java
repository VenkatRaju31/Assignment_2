package Assignment2;

public class BubbleSort {
	public static void main(String[] args) {
		int [] a= {1,2,9,8,7,4,3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}

	}
}
