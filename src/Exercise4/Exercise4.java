package Exercise4;

import java.util.Scanner;

public class Exercise4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Nhập số dòng của mảng: ");
            int rows = sc.nextInt();
            System.out.print("Nhập số cột của mảng: ");
            int cols = sc.nextInt();


            double[][] arr = new double[rows][cols];
            System.out.println("Nhập các phần tử của mảng:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("Nhập phần tử arr[%d][%d]: ", i, j);
                    arr[i][j] = sc.nextDouble();
                }
            }

            // Tìm phần tử lớn nhất trong mảng 2 chiều
            double max = arr[0][0];
            int maxRow = 0;
            int maxCol = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }

            // In ra giá trị lớn nhất và vị trí của nó
            System.out.println("Phần tử lớn nhất trong mảng là: " + max);
            System.out.println("Vị trí của phần tử lớn nhất là: [" + maxRow + "][" + maxCol + "]");

            sc.close();
        }
    }


