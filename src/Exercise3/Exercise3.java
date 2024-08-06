package Exercise3;


import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số lượng phần tử của mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];


        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.printf("Nhập phần tử thứ ", i + 1);
            array1[i] = scanner.nextInt();
        }


        System.out.print("Nhập số lượng phần tử của mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];


        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.printf("Nhập phần tử thứ ", i + 1);
            array2[i] = scanner.nextInt();
        }

        // Tạo mảng thứ 3 có kích thước là tổng của kích thước 2 mảng
        int size3 = size1 + size2;
        int[] array3 = new int[size3];


        int index = 0;
        for (int i = 0; i < size1; i++) {
            array3[index] = array1[i];
            index++;
        }
        for (int i = 0; i < size2; i++) {
            array3[index] = array2[i];
            index++;
        }

        // In ra mảng thứ 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
    }
}

