package d01prc;

public class Variable02 {
    public static void main(String[] args) {

//ornek 2 : Tamsayı(int) data tıpınde ismi age olan bır varıable oluşturunuzve içine 15 yukleyıp
        //consol'a yazdırınız İki sayının toplamını (toplamasını), çarpmasını, çıkarmasını, bölmesini ve kalanını yazdıran

        int age = 15;
        System.out.println("age = " + age);//15
        //örnek : // ornek 1: byte data tipinde ogrencı yası ıcın bır variable olusturun ve deger atayın

        byte tubanınYası = 13;
        System.out.println("tubanınYası = " + tubanınYası);

        // örnek : Site nufusu icin bir varıable olusturun ve deger atayın

        short SezgiSitesı = 2300;
        System.out.println("SezgiSitesı = " + SezgiSitesı);//2300


        // örnek4://ornek : Bir String ve iki int variable olusturun. string degeri ile int'lerin toplamini
        //        console'a yazdiriniz.

        String d = "MUZ";
        int v = 30;
        int y = 40;

        System.out.println(d + (v + y));

        //Not: Long olusturuken eger deger. int'in maksimum degerinden buyuk ise
        //sonuna "L" koymak zorundasiniz, yoksa "Integer number too large" hatasini alirsiniz


        //Ornek 1 : Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz


        long hucreSayısı = 12345678912L;
        System.out.println(hucreSayısı);

        //Ornek 2: Iki tane long variable olusturun ve toplamlarini bir etiketle console'a yazdirin

        long n = 12, m = 18;
        System.out.println("Toplam : " + (n + m));

        //Ornek 2: Iki tane long variable olusturun ve toplamlarini bir etiketle console'a yazdirin

        long k = 20, t = 10;
        System.out.println("toplam = " + (k + t));//30

        //---------------------------
        //5- float data type :
        //Decimal Numbers - Ondalikli sayilar icin kullanilir
        //Ozellikle fiyat degerleri icin kullanilir.

        //Not: Java ondalikli sayilari otomatik olarak double kabul eder.
        //float istiyorsaniz sonuna "F" veya "f" yazmalisiniz

        //Ornek 1: 2 tane float data tipinde variable olusturunuz ve bunlarin toplamini bir etiketle
        //console'a yazdiriniz.


        float ayakkabıFıyatı = 289.99f, çorapFiyatı = 100.99f;
        System.out.println("Toplam  fiyat :" + ayakkabıFıyatı + çorapFiyatı);//289.99100.99


        //2.yol:(2 ayyakkabı ve 3 corap fıyatı olursa nasıl ışlem yaparız

        float ayyakkabıFiyati2 = 12.45f, çopapFiyati2 = 23.99f;
        System.out.println("Toplam Fıyat:" + (2 * ayyakkabıFiyati2 + 3 * çopapFiyati2));//Toplam Fıyat:96.87

        //7- char data type:
        //2 byte'dir. Tek karakterler icin kullanilir. Sayi, sembol, harf farketmez.
        //veri tek tirnak icerisine yazilir.

        //Ornek : char data tipinde ismi isminIlkHarfi olan bir variable olusturunuz ve
        //icine tek bir karakter yukleyiniz

        char ısmınılkHarfi = 'A';
        System.out.println(ısmınılkHarfi);// "A"

        /// Aşağıdaki modeli görüntüleyen bir Java programı yazın.

        //       Örnek Desen:

        // avva
        //Jaavvaa
        //J aaa VV aaa
        //J aa Vaa

        String hrf = "J avva";
        System.out.println(hrf);
        String hrf1 = "aa vv aa";
        System.out.println(hrf1);
        String hrf2 = "J aaaVV  aaa ";
        System.out.println(hrf2);
        String hrf3 = "J aaVaa";
        System.out.println(hrf3);
        System.out.println("toplam :" + hrf + hrf1 + hrf2 + hrf3);


        //J avva
       // System.out.println(str + " " +str2 + str3 + str3 + str4 );

        // Jaavvaa
      // System.out.println(" " + str + str2 + str2 + str3 + str3 + str2 + str2);// Jaavvaa

        //JJ aaa VV aaa
      // String kelime = "" + str + str + " " + str2 + str2 + str2 + " " + str3.toUpperCase() + str3.toUpperCase() + " "
       //         + str2 + str2 + str2 ;//  JJ aaa VV aaa
       //System.out.println(kelime);
        //JJ aa Vaa
       //String kelime2 = "" + str + str + " " + str2 + str2 + " " + str3.toUpperCase() + str2 + str2;//JJ aa Vaa
        //  System.out.println(kelime2);//JJ aa Vaa

        //Alttaki 2 örenği  "kelime" diye bir string ifadesi açarak yaptım. Farklı bir yol

        //yani  System.out.println() içine yazmak yerine yukarıda yazdım



    }
}
