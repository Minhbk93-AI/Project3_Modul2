package Exercise7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng 2 chiều");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột của mảng 2 chiều bằng với số hàng");
        int cols = sc.nextInt();
        if (rows != cols) {
            System.out.println("Mời bạn nhập lại số hàng và số cột bằng nhau");
        }

        System.out.println("Nhập các phân tử của mảng");
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Ma trận vừa nhập là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //  Tính tổng các số ở đường chéo chính và đường chéo phụ
        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int i = 0; i < rows; i++) {
            sumMainDiagonal += arr[i][i];
            sumSecondaryDiagonal += arr[i][rows - 1 - i];
        }


        System.out.println("Tổng các số ở đường chéo chính: " + sumMainDiagonal);
        System.out.println("Tổng các số ở đường chéo phụ: " + sumSecondaryDiagonal);

      sc.close();
    }
}