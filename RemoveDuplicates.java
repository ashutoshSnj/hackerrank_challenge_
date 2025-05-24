package com.Array;

public class RemoveDuplicates {
	 public static void main(String[] args) {
	        int[] arr = new int[]{87, 741, 852, 96, 96, 54, 1};
	        int[] tempArr = new int[arr.length];
	        int index = 0;

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            // check if arr[i] already exists in tempArr
	            for (int j = 0; j < index; j++) {
	                if (arr[i] == tempArr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // if not duplicate, add to tempArr
	            if (!isDuplicate) {
	                tempArr[index] = arr[i];
	                index++;
	            }
	        }

	        // print unique elements
	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(tempArr[i] + " ");
	        }
	    }
}
