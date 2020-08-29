package repl.itProjeleri;

import java.util.Arrays;

public class arraysecondmax {
    public static void main(String[] args) {

    int[] arr = {15,25,22,18,30};

        System.out.println(max2Eleman(arr));



    }
    public static int max2Eleman(int[]arr){
        Arrays.sort(arr);

        return arr[arr.length -2];
    }
}
