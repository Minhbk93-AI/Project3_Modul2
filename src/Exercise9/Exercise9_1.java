package Exercise9;

import java.util.Arrays;

public class Exercise9_1 {
        public static void main(String[] args) {
            int[] arr = {5, 8, 2, 10, 15, 15, 4};
            System.out.println(Arrays.toString(arr));

            int firstMax = arr[0];
            int secondMax = arr[0];

            // Duyệt mảng một lần để tìm phần tử lớn nhất và lớn thứ hai
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = arr[i];
                } else if (arr[i] > secondMax && arr[i] != firstMax) {
                    secondMax = arr[i];
                }
            }
                System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondMax);
        }
    }


