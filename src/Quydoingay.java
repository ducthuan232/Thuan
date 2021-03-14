import java.util.Scanner;

public class Quydoingay {
    public static void ngaytrongtuan(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;System.out.println(y0);
        int x = y0 +y0/4-y0/100+y0/400;System.out.println(x);
        int        m0 = m + 12 * ((14 - m) / 12) - 2;System.out.println(m0);
        int d0 = (d + x + 31 * m0 / 12) % 7;System.out.println(d0);
        String ngay = "";
        switch (d0) {
            case 0:
                ngay = "chủ nhật";
                break;
            case 1:
                ngay = "thứ 2";
                break;
            case 2:
                ngay = "thứ 3";
                break;
            case 3:
                ngay = "thứ 4";
                break;
            case 4:
                ngay = "thứ 5";
                break;
            case 5:
                ngay = "thứ 6";
                break;
            case 6:
                ngay = "thứ 7";
                break;
        }

        System.out.println("Ngày " + d + " tháng " + m + " năm " + y + " là ngày " + ngay);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int m = sc.nextInt();
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.print("Nhập ngày: ");
            int d = sc.nextInt();
            if (d >= 1 && d <= 31) {
                System.out.print("Nhập năm: ");
                int y = sc.nextInt();
                ngaytrongtuan(m, d, y);
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.print("Nhập ngày: ");
            int d = sc.nextInt();
            if (d >= 1 && d <= 30) {
                System.out.print("Nhập năm: ");
                int y = sc.nextInt();
                ngaytrongtuan(m, d, y);
            }
        } else if (m == 2) {
            System.out.print("Nhập năm: ");
            int y = sc.nextInt();
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                System.out.print("Nhập ngày: ");
                int d = sc.nextInt();
                if (d >= 1 && d <= 29) {
                    ngaytrongtuan(m, d, y);
                }
            } else {
                System.out.print("Nhập ngày: ");
                int d = sc.nextInt();
                if (d >= 1 && d <= 28) {
                    ngaytrongtuan(m, d, y);
                }

            }


        }
    }


}




