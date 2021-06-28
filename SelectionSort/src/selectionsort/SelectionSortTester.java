/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Random;

/**
 *
 * @author baileyluu
 */

public class SelectionSortTester {

    public static void main(String[] args) {
       int [] myArray = new int[50];
        Random rnd=new Random();
       for(int i=0;i<myArray.length;i++){
           
           myArray[i]=rnd.nextInt(100-1)+1; //Generate random numbers
          
       }

        SelectionSort algo = new SelectionSort(myArray);  
        long t=System.nanoTime();
        int[] sortedArray= algo.selection(myArray); //Sorting out the random numbers in the array by using selection sort
        long t2=System.nanoTime();
        System.out.println("");
        System.out.print("Sorted array size of 50: ");
        for(int i=0;i<myArray.length;i++){
           
            System.out.print(sortedArray[i]+"  ");    //Print out the sorted number in an array
       }
        System.out.println("");
        System.out.println("Execution time in selection sort = "+ (t2-t));    //Time for computer to finish sorting
        
        long t3=System.nanoTime();
        int[]sortedArray1=algo.selection(sortedArray);
        long t4=System.nanoTime();
        System.out.println("Best\n" + (t4-t3)); //Best case scenario
        
        for(int i = 0; i <sortedArray.length/2;i++){
            int temp=sortedArray[i];
            sortedArray[i]=sortedArray[sortedArray.length-1-i];
            sortedArray[sortedArray.length-1-i]=temp;
        }

        long t5=System.nanoTime();
        int []sortedArray2= algo.selection(sortedArray);
        long t6=System.nanoTime();
        System.out.println("Worst\n"+(t6-t5));  //Worst case scenario
        
        
        
        
        
        
        int [] myArray1= new int[500];
        for(int i=0;i<myArray1.length;i++){
           
           myArray1[i]=rnd.nextInt(100-1)+1; //Generate random numbers
          
       }
        SelectionSort algo1 = new SelectionSort(myArray1);  
        long t7=System.nanoTime();
        int[] sortedArray3= algo1.selection(myArray1); //Sorting out the random numbers in the array by using selection sort
        long t8=System.nanoTime();
        System.out.println("");
        System.out.print("Sorted array size of 500: ");
        for(int i=0;i<myArray1.length;i++){
           
              System.out.print(sortedArray3[i]+"  ");    //Print out the sorted number in an array
       }
        System.out.println("");
        System.out.println("Execution time in selection sort \t = "+ (t8-t7));    //Time for computer to finish sorting
        
        long t9=System.nanoTime();
        int []sortedArray4 = algo1.selection(sortedArray3);  //Sorting out the random numbers in the array by using selection sort
        long t10=System.nanoTime();
        System.out.println("Best\n"+ (t10-t9));
        
        for(int i = 0; i <sortedArray3.length/2;i++){
            int temp= sortedArray3[i];
            sortedArray3[i]=sortedArray3[sortedArray3.length-1-i];
            sortedArray3[sortedArray3.length-1-i]=temp;
        }
        long t11=System.nanoTime();
        int []sortedArray5 = algo1.selection(sortedArray4);  //Sorting out the random numbers in the array by using selection sort
        long t12=System.nanoTime();
        System.out.println("Worst\n"+ (t12-t11));
        
        
        
        
        int [] myArray3= new int[20000];
        
        for(int i=0;i<myArray3.length;i++){
           
           myArray3[i]=rnd.nextInt(100-1)+1; //Generate random numbers
          
       }
        SelectionSort algo3 = new SelectionSort(myArray3);  
        long t19=System.nanoTime();
        int[]sortedArray9= algo3.selection(myArray3); //Sorting out the random numbers in the array by using selection sort
        long t20=System.nanoTime();
        System.out.println("");
        System.out.print("Sorted array size of 20000: ");
        for(int i=0;i<myArray3.length;i++){
           
              System.out.print(sortedArray9[i]+"  ");    //Print out the sorted number in an array
       }
        System.out.println("\nExecution time in selection sort = "+ (t20-t19));    //Time for computer to finish sorting
        
        long t21=System.nanoTime();
        int []sortedArray10 = algo3.selection(myArray3);  //Sorting out the random numbers in the array by using selection sort
        long t22=System.nanoTime();
        System.out.println("Best\n"+ (t22-t21));
        
        for(int i = 0; i <sortedArray9.length/2;i++){
            int temp= sortedArray9[i];
            sortedArray9[i]=sortedArray9[sortedArray9.length-1-i];
            sortedArray9[sortedArray9.length-1-i]=temp;
        }
        long t23=System.nanoTime();
        int []sortedArray11 = algo3.selection(sortedArray9);  //Sorting out the random numbers in the array by using selection sort
        long t24=System.nanoTime();
        System.out.println("Worst\n"+ (t24-t23));
         
    }
    
}