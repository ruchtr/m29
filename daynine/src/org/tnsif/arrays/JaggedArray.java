package org.tnsif.arrays;

public class JaggedArray {
	public static void main(String[] args)
	{	//declare 2-D array with 2 rows
		int arr[][] = new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
				System.out.println("Cntent of 2D Jagged Array");
			}
			for(int i1=0;i1<arr.length;i1++)
			{
				for(int j=0;j<arr[i1].length;j++)
				{
					
				}
			}
		}
	}
}
