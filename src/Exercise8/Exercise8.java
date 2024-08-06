package Exercise8;

import java.util.Scanner;

public class Exercise8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Nhập chuỗi: ");
            String inputString = sc.nextLine();

            System.out.print("Nhập ký tự cần đếm: ");
            char character = sc.next().charAt(0); // Đọc ký tự nhập từ bàn phím


            int count = 0;

            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == character) {
                    count++;
                }
            }

            //In ra số lần xuất hiện của ký tự
            System.out.println("Số lần xuất hiện của ký tự '" + character + "' trong chuỗi là: " + count);

            sc.close();
        }
    }


