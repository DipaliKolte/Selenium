package javagrooming;

public class array1 {
public static void main(String[] args) {
	int arr[]= {1,2,3,6,-1,-2,7,8,9};
	int add=8;
	for(int i=0;i<=arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==add)
		{
			System.out.println("{"+arr[i]+" "+arr[j]+"}");
		}
		}
	}
}
}
