package com.zohosets.set02;

//Alternate sorting: Given an array of integers, 
//rearrange the array in such a way that the first element is first maximum and second element is first minimum.
//
//Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
//     Output : {7, 1, 6, 2, 5, 3, 4} 

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingSort {

	public static void main(String[] args) {
		new AlternatingSort().getInput();
	}
	private void getInput() {
		int[] array = { 7, 1, 2, 3, 4, 5,6 };
		System.out.println(Arrays.toString(alternateSortBasic(array,7)));
	}
	ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        int start=0,last=N-1;
        ArrayList<Long> list = new ArrayList<>();
        Arrays.sort(arr);
        while(start<last){
            list.add(arr[last]);
            list.add(arr[start]);
            start++;last--;
        }
        return list;
    }
	
    private int[] alternateSortBasic(int arr[] ,int N)
    {
        int min,max,temp;
        for(int i=0;i<N;i++){
            max=i;
            min=i;
            if(i%2==0){
                for(int j=i+1;j<N;j++){
                    if(arr[max]<arr[j]){
                        max=j;
                    }
                }
                if(max!=i){
                    temp = arr[i];
                    arr[i] = arr[max];
                    arr[max]=temp;
                }
            }else{
                for(int j=i+1;j<N;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                }
                if(min!=i){
                    temp = arr[i];
                    arr[i] = arr[min];
                    arr[min]=temp;
                }
            }
        }
        return arr;
    }


}
