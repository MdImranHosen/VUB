/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selecttionsort;

/**
 *
 * @author Md. Imran Hosen
 */
public class SelecttionSort {

     public static void selectionSort(int[] arr1){
      for(int i = 0; i<arr1.length - 1; i++){
        int index = i;
        for(int j = i+1; j<arr1.length; j++){
            if(arr1[j] < arr1[index]){
               index = j;
            }
          
        }
        
        int samevalue = arr1[index];
        arr1[index] = arr1[i];
        arr1[i] = samevalue;
      }
      
    }
    
    public static void main(String[] args) {
      int[] arr1 = {9,12,8,34,67,89,14};
      
      System.out.println("Before Selection sort ");
      
      for(int i:arr1){
      System.out.print(i+" ");
      }
      System.out.println();
      
      selectionSort(arr1);
      
      for(int i:arr1){
       System.out.print(i+" ");
      }
      
      
    }
    
}
