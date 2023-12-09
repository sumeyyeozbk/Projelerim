package d01prc;

import java.text.StringCharacterIterator;

public class Varıables01 {
    public static void main(String[] args) {

        // kısa  kenarı 5 uzun kenarı 12 olan dikdortgenın alanını ve cevresını yazdırın

        int kİsaKenar = 5;
        int uzunKenar = 12;
        System.out.println("cevre" + (kİsaKenar + uzunKenar) * 2);

        System.out.println("alan" + kİsaKenar * uzunKenar);

        // consola "Merhaba" sumeyye yazdırın

        String adi = "Sumeyye";

        System.out.println(adi);


        String selam = "Merhaba";

        System.out.println(selam);



        // örnek :İki sayının toplamını yazdıran bir Java programı yazınız.
        //Test Verileri:Beklenen Çıktı :
        //110
        //74 + 36

        int a =74;
        int b=36;
        System.out.println(a + b);//110

        //. İki sayıyı bölen ve bunları ekrana yazdıran bir Java programı yazın.
        //Test Verisi :
        //50/3
        //Beklenen Çıktı :
        //16

        int c = 50;
        int d = 3;
        System.out.println((c/d));// 16

        int rsult = 50/3 ;
        System.out.println( rsult);//16

        // Aşağıdaki işlemlerin sonuçlarını yazdıracak bir Java programı yazınız.
       // Test Verileri:
        //a. -5 + 8*6b
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //gün. 5 + 15 / 3 * 2 - 8 % 3
        //Beklenen Çıktı :
        //43
        //1
        //19
        //13


        int x =(-5+8*6);
        System.out.println(x);//43
        int y = (55+9)/9;
        System.out.println(y);//7
        int z =20 +(-3*5)/8;
        System.out.println(z);//19
        int t =(5+15/3*2-8/3);//13
        System.out.println(t);


        // örnek:Girdi olarak iki sayıyı alan ve iki sayının çarpımını görüntüleyen bir Java programı yazınız.
        //Test Verileri:
        //Birinci numarayı girin: 25
        //İkinci numarayı girin: 5
        //Beklenen Çıkış :
        //25 x 5 = 125

       int carpım =25*5;
        System.out.println(carpım);//125

        //örnek : İki sayının toplamını (toplamasını), çarpmasını, çıkarmasını, bölmesini ve kalanını yazdıran bir Java programı yazın.
        //Test Verileri:
        //Birinci numarayı girin: 125
        //İkinci numarayı girin: 24
        //Beklenen Çıkış :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5
          int sayı1 =125;
        int sayı2 =24;
        System.out.println(sayı1+sayı2);//149
        System.out.println(sayı1-sayı2);//101
        System.out.println(sayı1*sayı2);//3000
        System.out.println(sayı1/sayı2);//5


    }


}
