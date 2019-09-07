package com.nt.array;

public class Example {
	public static void main(String[] args) {
		/*int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i:arr) {
			System.out.println(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.println(i);
		}*/
		
		/*int[] arr=new int[] {10,20,30,40,50};
		int[] brr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
		for(int p:brr) {
			System.out.println(p);
		}*/
		
	/*	int[] arr= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.println(sum);

		}*/
		
		/*int[] arr= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}*/
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		for(int i=1;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}
}
