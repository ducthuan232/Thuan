import java.util.Scanner;
public class TinhLai {
    public static void Tinhlai(String tiente ,double tiengui,double laisuat,int nam){
        double ls=laisuat/100,tien;
        for(int i=1; i<= nam;i++ ){
            tien=tiengui*(1+ls*i);
            switch (tiente) {
                case "VND":
                    System.out.println("số tiền sau " + i + " năm là: " + (int) tien + " " + tiente); break;
                default:     System.out.println("số tiền sau " + i + " năm là: " + (double)Math.round(tien*100)/100  + " " + tiente);
            }
            tien=0;
        }
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
    System.out.print("nhập loại tiền tệ: ");
    String tiente=sc.next();
    System.out.println();
System.out.println("nhập số tiền muốn gửi: ");
double tiengui= sc.nextDouble(); System.out.println(tiente);
    System.out.println("nhập lãi suất/năm: ");
double laisuat= sc.nextDouble();
    System.out.println("nhập số năm: ");
int nam= sc.nextInt();


Tinhlai(tiente,tiengui,laisuat,nam);

}
}
