package com.gl.paymentTransaction;

import java.util.Scanner;

public class paymentTransaction {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("enter the size of transaction array ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the values of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNumber = in.nextInt();
		while (targetNumber-- != 0) {
			int flag = 0;
			long targetValue;
			long sum = 0;
			System.out.println("enter the value of target");
			targetValue = in.nextLong();
			for (int i = 0; i < size; i++) {
				sum = sum + arr[i];
				if (sum >= targetValue) {
					System.out.println("Target value achieved after " + (i + 1) + "transaction.. ");
					flag = 1;
					break;

				}

			}
			if (flag == 0) {
				System.out.println("Given target not achieved");
			}

		}
	}
}
