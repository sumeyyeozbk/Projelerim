package d05scanner;

import java.util.Scanner;

public class C01deneme {
    public static void main(String[] args) {
        //// Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
        //Scanner scan = new Scanner(System.in);
        //System.out.println("lutfen bir sayi giriniz");
        //int sayi=scan.nextInt();
        //int kupHesapla=(sayi*sayi*sayi)/2;
        //System.out.println(kupHesapla);

       // Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

               Scanner input=new Scanner(System.in);
        System.out.println("Lutfen karenın kenar uzunlugunu giriniz");
        int kenaruzunlugu= input.nextInt();
        int alan=kenaruzunlugu*kenaruzunlugu;
        int cevre=4 *kenaruzunlugu;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
        System.out.println("kenar uzunlugu = " + kenaruzunlugu);



       // Alan: 9;


       // Cevre: 12;



    }
}
