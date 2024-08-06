package Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;
        int[] arr = new int[SIZE];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Nhập phần tử thứ: %d", i + 1);
            arr[i] = sc.nextInt();
        }

        // Tìm giá trị nhỏ nhất trong mảng
        int min = arr[0];

        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // In ra giá trị nhỏ nhất trong mảng
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

        sc.close();
    }
}

