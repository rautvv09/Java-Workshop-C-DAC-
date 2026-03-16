package com.dkte;

public class program01{
	public static void main(String args[]) {
		int[][] arr=new int[2][];
		
		arr[0]=new int[3];
		arr[1]=new int[5];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		arr[1][3]=70;
		arr[1][4]=80;
		
		System.out.println("\nUsing For Loop:\n");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Elements ->"+arr[i][j]);
			}
		}
		
		System.out.println("\nUsing For Each Loop:\n");
		for(int[] s:arr) {
			for(int ele:s) {
				System.out.println("Elements ->"+ele);
			}
		}
	}
}
