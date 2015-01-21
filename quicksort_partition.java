import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
              
             int pivot=ar[0];
              int pIndex=ar.length-1;
              int temp=0;
              
              for(int i=ar.length-1;i>0;i--)
                  {
                 // System.out.print(i);
                  if(ar[i]>=pivot)
                      {
                      temp=ar[i];
                      ar[i]=ar[pIndex];
                      ar[pIndex]=temp;
                      
                      pIndex--;
                    //  System.out.println(pIndex);
                      
                  }
              }
              
              //swapping first value with pIndex
            int val=ar[pIndex];
              ar[pIndex]=ar[0];
              ar[0]=val;
              
              for(int i=0;i<ar.length;i++)
          {
                  System.out.print(ar[i]+" ");
              }
              
             // System.out.print("pIndex value"+ar[pIndex]);
       }
    
    
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
