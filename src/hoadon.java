import java.util.Scanner;
public class hoadon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int tong=0;
        String cauhoi;
        int a,b;
        do {
            System.out.print("Giá sản phẩm " + i+" :$");
             a = sc.nextInt();
            System.out.println();
            System.out.print("số lượng sản phẩm: ");
             b = sc.nextInt();
             tong = tong + a * b;
            System.out.println();
            System.out.print("mua tiếp không?(c/k) " );
             cauhoi =sc.next();
             i++;

        }

        while(cauhoi.equals("c"));
    System.out.println("Tổng hóa đơn trước thuế:$"+tong);
        System.out.println("Thuế:$"+(double)Math.round((tong*5.5/100)*100)/100);
        System.out.println("Tổng hóa đơn sau thuế:$"+(double)Math.round((tong*1.055)*100)/100);
    }

}
