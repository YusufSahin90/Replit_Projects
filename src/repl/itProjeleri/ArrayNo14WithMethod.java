package repl.itProjeleri;

import java.util.Arrays;

public class ArrayNo14WithMethod {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {2,3,4};

        System.out.println(Arrays.toString(arr1) + " : " + varMi14(arr1));
        System.out.println(Arrays.toString(arr1) + " : " + varMi14(arr2));
        System.out.println(Arrays.toString(arr1) + " : " + varMi14(arr3));


    }
    public static boolean varMi14(int[] arr){

        boolean var1 = false;
        boolean var4 = false;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 1) var1 = true;
            if(arr[i] == 4) var4 = true;
        }
        if (var1 == true && var4 == true)
            return false;
        else
            return true;
    }
}
