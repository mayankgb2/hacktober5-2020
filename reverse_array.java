#https://www.facebook.com/shruti.buchha.7/posts/3341900509242443
#subscribed by shruti buchha

import java.util.Scanner;

public class ReverseArray{
	public static void swap(int arr[],int i,int j){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	public static void main(String args[]){
		System.out.println("Enter number of elements");
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("Enter "+n+" values");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		for(int i=0;i<(n/2);i++){
			swap(arr,i,n-1-i);
		}
		System.out.println("Array after reversing");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
