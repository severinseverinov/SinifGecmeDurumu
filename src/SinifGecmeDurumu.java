import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat=input.nextInt();
        mat=(mat>=0 && mat<=100)?mat:0;
        System.out.print("Fizik notunuz : ");
        fizik=input.nextInt();
        mat = (mat>=0 && mat<=100) ? mat : 0;
        System.out.print("Türkçe notunuz : ");
        turkce=input.nextInt();
        turkce = (turkce>=0 && turkce<=100) ? turkce : 0;
        System.out.print("Kimya notunuz : ");
        kimya=input.nextInt();
        kimya = (kimya>=0 && kimya<=100) ? kimya : 0;
        System.out.print("Müzik notunuz : ");
        muzik=input.nextInt();
        muzik = (muzik>=0 && muzik<=100) ? muzik : 0;

        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        if(avarage<=55){
            System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere.");

        }else{
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : "+avarage);

    }
}
