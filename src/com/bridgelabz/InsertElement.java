package com.bridgelabz;

import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size + 1];

		System.out.println("enter elements: ");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("enter position to insert element: ");
		int position = sc.nextInt();

		System.out.println("Enter element to be added: ");
		int newElement = sc.nextInt();

		for(int i=size;i> position;i--){
			arr[i] = arr[i-1];
		}

		arr[position] = newElement;

		for(int i=0;i< arr.length;i++){
			System.out.println(arr[i]);
		}

}
}
