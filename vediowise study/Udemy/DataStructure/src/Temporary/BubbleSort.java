/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

/**
 *
 * @author User
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        //outer loope
        for (int lastunsortedIndex =intArray.length-1 ; lastunsortedIndex > 0; lastunsortedIndex--) {
            //inner loop
            for (int i = 0; i < lastunsortedIndex; i++) {
                if(intArray[i]>intArray[i+1]){
                swap(intArray,i,i+1);
                }
            }
        }
        //printing the sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array,int i,int j){
    if(array[i]== array[j]){return;}
      int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
}
