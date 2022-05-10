import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(lastIndex(arr, 0, x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(arr.length == idx){
            return -1;
        }
        int lma = lastIndex(arr, idx + 1, x);
        if(lma == -1){
            if(x == arr[idx]){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lma;
        }
    }

}