import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi,toplam=0;
        do {
            System.out.println("Sayı Giriniz ");
            sayi = giris.nextInt();
            if(sayi % 4 == 0){
                toplam = toplam + sayi;
            }

        }while(sayi % 2 == 0);

        System.out.println("Girilen çift sayılardan 4 e bölünebilenlerin toplamı= "+toplam);

    }
}
