import java.util.Scanner;

public class Doitien {
    public static void doitien(String a, String b) {
        Scanner sc = new Scanner(System.in);
        final double Euro = 1;
        final double USD = 1.19;
        final double YenNhat = 130.12;
        final double BangAnh = 0.86;
        final double UC = 1.54;
        final double VND = 27483.84;
        double x = 1, y = 1;
        double vao, ra;

        switch (a) {
            case "Euro":
                x = 1;
                break;
            case "YenNhat":
                x = 130.12;
                break;
            case "BangAnh":
                x = 0.86;
                break;
            case "USD":
                x = 1.19;
                break;
            case "UC":
                x = 1.54;
                break;
            case "VND":
                x = 27483.84;
                break;
            default:
                x = 1;
        }
        switch (b) {
            case "Euro":
                y = 1;
                break;
            case "YenNhat":
                y = 130.12;
                break;
            case "BangAnh":
                y = 0.86;
                break;
            case "USD":
                y = 1.19;
                break;
            case "UC":
                y = 1.54;
                break;
            case "VND":
                y = 27483.84;
                break;
            default:
                y = 0;
        }


        System.out.print("nhập số tiền theo " + a + ":");
        vao = sc.nextDouble();
        ra = (vao / x) * y;
        System.out.println("");
        if (b.equals("VND"))
            System.out.print("số tiền sau khi quy đổi ra " + b + ": " + (int) ra);
        else {
            System.out.print("số tiền sau khi quy đổi ra " + b + ": " + (double) Math.round(ra * 100) / 100);

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập loại tiền muốn quy đổi: ");
        String tienvao = sc.next();
        System.out.println();
        System.out.print("nhập loại tiền muốn quy đổi: ");
        String tienra = sc.next();
        doitien(tienvao, tienra);
    }
}
