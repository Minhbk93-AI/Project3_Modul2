package Execise2;

import java.util.Arrays;
import java.util.Scanner;

public class Execise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrays= {10,4,6,7,8,9,13,12,6,8};
        int N= arrays.length;
        System.out.println("Mảng ban đầu là");
        for (int i=0; i<N; i++){
            System.out.print( arrays[i] + " ");
        }
        System.out.println();

        System.out.println("Nhập số cần chèn vào: ");
        int X= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí cần chèn vào mảng");
        int indexInsert = sc.nextInt();
     if (indexInsert<=-1 || indexInsert >=(N-1)){
         System.out.println("Không chèn được phần tử vào mảng");

     }else {
         int[] arrays1 = new int[N+1];
         for (int i=0; i< arrays1.length; i++) {
             if (i == indexInsert){
                 arrays1[indexInsert] = X;
             }
             else if (i>indexInsert) {
                 arrays1[i] = arrays[i-1];

             }
             else {
                 arrays1[i]=arrays[i];
             }
         }
         System.out.println(Arrays.toString(arrays1));
         }
sc.close();
     }

    }

