package ver1;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of variables: ");
        int var = sc.nextInt();

        int[] arr = new int[var];
        System.out.println("Enter constant of each variables:");
        for(int i = 0; i < arr.length; i++) {
            int constants = sc.nextInt();
            arr[i] = constants;
        }

        System.out.print("Enter how many x: ");
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++) {
            System.out.println("f(" + (i) + ") = " + countFunction(arr, i));
        }

        sc.close();
    }

    //f(x) = res
    public static int countFunction(int[] function, int x) {
        int res = 0;
        for(int i = 0; i < function.length; i++) {
            res += function[i] * Math.pow(x,i);
        }
        return res;
    }

}
