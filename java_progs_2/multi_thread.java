import java.util.*;
import java.lang.*;

class average implements Runnable
{
	int array[],length;
	average(int arr[])
	{
		int len = arr.length;
		length=arr.length;
		array=new int[len];
		array=arr;
	}
	public void run() 
	{
		int avg=0;
		for(int i=0;i<array.length;i++)
		{
			avg+=array[i];
			System.out.println("Thread 1");
		}
		int val=avg/length;
		System.out.println("Average : "+val);
		
	}
	
}

class maxarr implements Runnable
{
	
	int array2[],length2;
	maxarr(int arr[])
	{
		int len = arr.length;
		length2=arr.length;
		array2=new int[len];
		array2=arr;
	}
	public void run() {
		// TODO Auto-generated method stub
		int max=0;
		for(int j=0;j<array2.length;j++)
		{
			System.out.println("Thread 2");

			if(max<array2[j])
			{
				max=array2[j];
			}
		}
		System.out.println("Max : "+max);
	}
	
	
}

class minarr implements Runnable
{
	int array3[],lenght3;
	minarr(int arr[])
	{
		int len = arr.length;
		lenght3=arr.length;
		array3=new int[len];
		array3=arr;
		//array[0]++;
	}
	public void run() {
		// TODO Auto-generated method stub
		int min=array3[0];
		for(int k=0;k<array3.length;k++)
		{
			System.out.println("Thread 3");

			if(min>array3[k])
			{
				min=array3[k];
			}
		}
		System.out.println("Min : "+min);
		
	}
	
}

class MULTITHREADS_DIFFERENT_OPERATIONS {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		average th1 = new average(arr);
		maxarr  th2 = new maxarr(arr);
		minarr  th3 = new minarr(arr);
 		Thread t1 = new Thread(th1);
 		Thread t2 = new Thread(th2);
 		Thread t3 = new Thread(th3);
 		
 		t1.start();
 		t2.start();
 		t3.start();
 		
		

	}

}