package practice_basic_day06;

import static practice_basic_day04.Q04_Arrays.tpMethod;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {

        int [] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        tpMethod (arr,istenenToplam);


    }

   public static void  tpMethod(int[]arr, int istenenToplam){
        for (int i=0; i < arr.length; i++){
            for (int j=i+1; j < arr.length;j++){
                if (arr[i] +arr[j] == istenenToplam){

                }
            }
        }

   }


}
