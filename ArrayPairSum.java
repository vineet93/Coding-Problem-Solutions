package com.vineet.arraypairsum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayPairSum {
	
	
	public void checkSum(int arr[],int target){
		
		//Using Set
		Set<Integer> set1= new HashSet<Integer>();
		
		if(arr.length < 2){
			System.out.println("Not Sufficent elements");
		}
		
		for(int i=0;i<arr.length;i++){
			
			int temp = target - arr[i];
			if(set1.contains(temp)){
				System.out.println("Pair is "+"("+temp+","+arr[i]+")" );
			}
				set1.add(arr[i]);
			
		}
	}

	public static void main(String[] args) {
		
		 int arr[] = {1,4,2,3,0};
		 int target = 4;
		
		ArrayPairSum sum = new ArrayPairSum();
		
		sum.checkSum(arr, target);
		

	}

}
