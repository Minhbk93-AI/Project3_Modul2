package Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng");
        int rows = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng");
        int cols = sc.nextInt();

        double[][] arr = new double[rows][cols];
        System.out.println("Nhập các phần tử của mảng:");
        double sum = 0;
        System.out.println("Nhập cột cần tính tổng");
        int numberCols = sc.nextInt();
        //
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextDouble();
                System.out.println();

                if (numberCols > cols || numberCols < 0) {
                    System.out.println("Số cột tính tổng nhập vào phải nhỏ hơn hoặc bằng số cột của mảng");
                }

                if (j == numberCols-1) {
                    sum = sum + arr[i][j];
                }
            }

        }
        System.out.println("Ma trận vừa nhập là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            System.out.println("Tổng là: "+sum);
        }
sc.close();
    }
}