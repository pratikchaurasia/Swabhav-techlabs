package com.techlabs.binarysearch;

import java.util.ArrayList;

public class MergeSort implements ISortable{

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> list) {		
		divide(0, list.size()-1,list);
		return list;
	}
	public void divide(int startIndex,int endIndex,ArrayList<Integer> list){
        
       
        if(startIndex<endIndex && (endIndex-startIndex)>=1){
            int mid = (endIndex + startIndex)/2;
            divide(startIndex, mid,list);
            divide(mid+1, endIndex,list);        
             
            merger(startIndex,mid,endIndex,list);            
        }  
        
    }  
	public void merger(int startIndex,int midIndex,int endIndex,ArrayList<Integer> list){
        
        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();
         
        int leftIndex = startIndex;
        int rightIndex = midIndex+1;
         
        while(leftIndex<=midIndex && rightIndex<=endIndex){
            if(list.get(leftIndex)<=list.get(rightIndex)){
                mergedSortedArray.add(list.get(leftIndex));
                leftIndex++;
            }else{
                mergedSortedArray.add(list.get(rightIndex));
                rightIndex++;
            }
        }       
         
        while(leftIndex<=midIndex){
            mergedSortedArray.add(list.get(leftIndex));
            leftIndex++;
        }
         
        while(rightIndex<=endIndex){
            mergedSortedArray.add(list.get(rightIndex));
            rightIndex++;
        }
         
        int i = 0;
        int j = startIndex;
        
        while(i<mergedSortedArray.size()){
            list.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }

}
