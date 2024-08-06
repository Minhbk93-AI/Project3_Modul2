package Exercise1;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arrays ={1,5,3,8,9,6,10,15};
        int N=arrays.length;
        System.out.println("Mảng ban đầu là: ");
        for (int i = 0; i < N; i++) {
            System.out.print( arrays[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập giá trị cần xóa ");
        int X= Integer.parseInt(sc.nextLine());
        int indexDelete=-1;
        for (int i=0; i<N; i++){
            if (arrays[i]==X){
                indexDelete=i;
                break;
            }

        }
        if (indexDelete!=-1){
            for (int i=indexDelete; i<N-1; i++){
                arrays[i]= arrays[i+1];
            }
            N--;

            int[] arrays1= new int[N];
            for (int i = 0; i < N; i++) {
                arrays1[i] = arrays[i];


            }
            System.out.println();
            System.out.println(Arrays.toString(arrays1));
        }
        sc.close();
        }


    }
