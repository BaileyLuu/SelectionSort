/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author baileyluu
 */
public class SelectionSort {

    private int [] intArray;
    /**
     * @param args the command line arguments
     */
 
    public SelectionSort(int []array){
      this.intArray=array;
    }
    public int[] getArray(){
        return this.intArray;
    }
    public int[]selection(int[]array2){
        intArray = array2;
        int iPos;
        int iMin;
        for(iPos = 0;iPos < intArray.length;iPos++){
            iMin = iPos;
            for(int i=iPos+1;i<intArray.length;i++){
                if(intArray[i] < intArray[iMin]){
                    iMin = i;
                }
            }if(iMin!=iPos){
                int temp = intArray[iPos];
                intArray[iPos] = intArray[iMin];
                intArray[iMin] = temp;
            }
        }
        return intArray;
    }
}
