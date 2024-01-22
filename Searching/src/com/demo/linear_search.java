package com.demo;

import java.util.Scanner;

public class linear_search
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=scanner.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the element of the array:");
		for(int i=0; i<size;i++)
		{
			System.out.println("Enter element"+(i + 1) + ": ");
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter the value to be searched: ");
		int searchValue = scanner.nextInt();
		
		// Perform Linear search
		int index = linear_Search(arr, searchValue);
		
		//display the result
		if(index != -1)
		{
			System.out.println("Element"+ searchValue + " Found at index"+ index);
		}
		else
		{
			System.out.println("Element"+ searchValue + "not Found in array ");
		}
	}
	
	static int linear_Search(int[] arr, int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

}
