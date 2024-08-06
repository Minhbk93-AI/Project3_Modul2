package Exercise9;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 15, 15, 4};
        System.out.println(Arrays.toString(arr));
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        if (max2 != arr[0]) {
            System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
        } else {
            System.out.println("Không tìm thấy phần tử lớn thứ hai trong mảng.");
        }
    }
}


