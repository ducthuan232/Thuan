import java.util.Scanner;
public class Sucgio {
    public static void Sucgio(double t,double v ){
        /* t là độ F
           v là vận tốc gió
         */

        if(t<=50 &&v<=130 && v>=3){
            double w=35.74 + 0.6215*t +(0.4275*t-35.75)*Math.pow(v,0.16);
            System.out.print("Giá trị sức gió: "+(double)Math.round(w*100000)/100000);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập vào nhiệt độ và tốc độ gió: ");
        double t=sc.nextDouble();
        double v=sc.nextDouble();
        Sucgio(t,v);


    }
}
