package com.vineet.arraypairsum;

import java.util.HashMap;
import java.util.Map;


public class ArrayPairSumUsingMap {
	
public void checkSum(int arr[],int target){
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		if(arr.length<2){
			System.out.println("No sufficient elements");
		}
		
		for(int i=0;i<arr.length;i++){
			
			int sum= target - arr[i];
			if(map.containsKey(sum)){
				System.out.println("Pair is "+sum+","+arr[i]);
				System.out.println("Indices are "+map.get(sum)+","+i);
			}
			map.put(arr[i], i);
		}
	}

	public static void main(String[] args) {
		
		
		 int arr[] = {1,4,45,6,10,8};
		 int target = 16;
		
	ArrayPairSumUsingMap sumMap= new ArrayPairSumUsingMap();
		
	sumMap.checkSum(arr, target);

	}

}
