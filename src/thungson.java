import java.util.Arrays;
import java.util.Scanner;

public class thungson {

    public static void thungson(String hinhdang) {
        Scanner sc = new Scanner(System.in);
        int dientich = 0;
        if (hinhdang.equals("L")) {
            System.out.println("Nhập thông số HCN lớn: ");
            int dlon = sc.nextInt();
            int rlon = sc.nextInt();
            System.out.println("Nhập thông số HCN khuyết: ");
            int dkhuyet = sc.nextInt();
            int rkhuyet = sc.nextInt();
            dientich = dlon * rlon - dkhuyet * rkhuyet;
        } else if (hinhdang.equals("HCN")) {
            System.out.println("nhập thông số HCN là:");
            int dai = sc.nextInt();
            int rong = sc.nextInt();
            dientich = dai * rong;
        }
        if ((dientich) % 350 == 0) {
            System.out.println("số thùng sơn cần dùng là: " + (dientich) / 350);
        } else {
            System.out.println("số thùng sơn cần dùng là: " + ((int) ((dientich) / 350) + 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập hình dạng căn phòng  cần sơn: ");
        String hinhdang=sc.next();
        thungson(hinhdang);


    }
}