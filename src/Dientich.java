import java.util.Scanner;

public class Dientich {

    public static void dientich(double a, double b, String donvi) {


        final double e = 0.09290304;
        if (donvi.equals("meters")) {
            System.out.println("diện tích căn phòng là: ");
            System.out.println((double)Math.round((a * b /e)*1000)/1000 + " feet vuông");
            System.out.println((double)Math.round((a * b )*1000)/1000 + " meters vuông");
        } else if (donvi.equals("feet")) {
            System.out.println("diện tích căn phòng là: ");
            System.out.println((double)Math.round((a * b )*1000)/1000 + " feet vuông");
            System.out.println((double)Math.round((a * b*e )*1000)/1000 + " meters vuông");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chọn đơn vị(meters/feet): ");
        String donvi = sc.next();
        System.out.println("chiều dài căn phòng theo đơn vị " + donvi + "?");
        double dai = sc.nextDouble();
        System.out.println("chiều rộng căn phòng theo đơn vị " + donvi + "?");
        double rong = sc.nextDouble();
        dientich(dai,rong,donvi);

    }

}
