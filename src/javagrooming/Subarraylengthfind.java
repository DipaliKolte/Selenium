package javagrooming;

public class Subarraylengthfind {
public static void main(String[] args) {
	int arr[]= {1,2,1,2,3,4,1};
	int max=1;
	int count=1;
	
	for(int i=1;i<arr.length;i++)
	if(arr[i]>arr[i-1])
	{
		count++;
	}
	else {
		if(max<count)
		{
			max=count;
			count=1;
		}
		
	}
System.out.println("   "+max);
}
}
