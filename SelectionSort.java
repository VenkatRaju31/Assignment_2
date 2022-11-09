package Assignment2;

public class SelectionSort {
	public static void main(String[] args) {
		
		int a[] = {5,8,6,7,3,4,2};
		int i=0;
		int smallest=i;
		for(i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[smallest]>a[j]) 
				{
					smallest=j;
				}
			}
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
		}
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
	}

}
