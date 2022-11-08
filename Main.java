import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int mat, fiz, turk, kim, muz,dSayisi=0;
        double top=0;

        System.out.println("Notları giriniz 1-100");
        System.out.print("Matematik notunuz: ");
        mat= inp.nextInt();
        if (mat>=0 && mat<=100)
        {
            top+=mat;
            dSayisi++;
        }

        System.out.print("Fizik notunuz: ");
        fiz= inp.nextInt();
        if (fiz>=0 && fiz<=100)
        {
            top+=fiz;
            dSayisi++;
        }

        System.out.print("Türkçe notunuz: ");
        turk= inp.nextInt();
        if (turk>=0 && turk<=100)
        {
            top+=turk;
            dSayisi++;
        }

        System.out.print("Kimya notunuz: ");
        kim= inp.nextInt();
        if (kim>=0 && kim<=100)
        {
            top+=kim;
            dSayisi++;
        }

        System.out.print("Müzik notunuz: ");
        muz= inp.nextInt();
        if (muz>=0 && muz<=100)
        {
            top+=muz;
            dSayisi++;
        }

        if (dSayisi>0)
        {
            top=top/dSayisi;
            if (top<55){
                System.out.println("Not ortalamanız: "+ new DecimalFormat("#.##").format(top));//virgülden sonrası için format
                System.out.println("Sınıfta kaldınız..!!");
            }
            else
            {
                System.out.println("Not ortalamanız: "+ new DecimalFormat("#.##").format(top));
                System.out.println("Sınıfı geçtiniz. Tebrikler..!!");
            }

        }else
            System.out.println("Notları 0-100 arasında giriniz. Bunun dışındaki notlar ortalamaya dahil edilmeyecektir.");


    }
}