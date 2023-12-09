package c02denemestrınglerinOzellıkleri;

public class StringOzellikleri {
    public static void main(String[] args) {

        // Stringlerde özel karakterler nasıl yazdırılır ?
        // \'     tek tırnak bastırır
        // \"     çift tırnak bastırır
        // \\      \    bastırır
        // \t     genellikle bir tab boşluğu kadar (tek boşluk) boşluk bırakır
        // \n     yeni satıra geçmek için kullanılır

        String s1 = "Ahmet\'in yazısında ters slaş işareti yani \\ sembolü eksik\tolduğu\tiçin sorun yaşadı." +
                "\nCoğrafya dersinde "
                + "\"Fön Rüzgarları\" başlıklı konuyu anlatmıştı.";
        System.out.println(s1);


        // Stringlerde + operatörü, kelime gruplarını birbirine ekler

        String x = "10", y = "11", z = "Plüton";
        System.out.println(x + y);    // String + String = Ekleme  -->  1011
        System.out.println(z + x);    // String + String = Ekleme  --> Plüton10

        int a = 40, b = 45;
        System.out.println(a + b);    // int + int = Matematikteki Toplama  --> 85
        System.out.println(a + x);    // int + String = Ekleme   --> 4010
        System.out.println(a + b + z);    // int + int + String = önce topla sonra ekle   --> 85Plüton
        System.out.println(y + a + b);    //  + intString + int = önce ekle (sonuç String olacağı için) sonra yine ekle
        // --> 114045
        // .concat()  metodu kelime gruplarını birbirine ekler
        String yeni = x.concat(y);  // --> 1011
        System.out.println(yeni);

        String yeni2 = z.concat(" bir gezegen değildir.");
        System.out.println(yeni2);

        // .charAt(int i) metodu = i. indeksteki karakteri verir. Bu yüzden sonuç bir char değerine atanır
        char ilkHarf = yeni2.charAt(0);  //char ilkHarf = P
        System.out.println(ilkHarf);

        // .contains() metodu boolean değer döndürür. Yani sonuç true ya da false olur.içerir mi
        // Bu yüzden sonuç bir boolean değere atanır
        boolean varMi = yeni2.contains("g");  // --> boolean varMi = true
        boolean varMi2 = yeni2.contains("bir"); // --> true
        System.out.println("varMi: " + varMi + "  ve  varMi2: " + varMi2);

        // .toUpperCase() ve .toLowerCase() metotları sırasıyla büyükharflere ve küçük harflere döndürür
        System.out.println(yeni2.toUpperCase());
        System.out.println(yeni2.toLowerCase());

        // .replace("ilk kısım","ikinci kısım") metodu ilk kısım yerine ikinci kısım'ı koyar
        String s3 = "Bu metot, orijinal dizeyi değiştirmez, sadece değiştirilmiş bir kopyasını döndürür.";
        s3 = s3.replace("orijinal", "ilk");
        System.out.println(s3);

        String tv = "$456.99";
        String yeniTv = tv.replace("$", "");    // yeniTv="456.99"
        Double d = Double.valueOf(yeniTv); // d = 456,99
        System.out.println(d);

        // .trim() metodu, bir Stringdeki en baş ve en sondaki boşlukları siler.
        String bosluk = "    Aradaki boşlukları silmez.    ";
        String s11 = bosluk.trim();    // s11 = "Aradaki boşlukları silmez."


        // .substring(int i) = i. karakterden (i. karakteri de gösterir) sonrasını döndürür
        System.out.println(s3.substring(3));

        // .substring(int i, int j) = i. karakterden j'den hemen önceki karaktere kadar olanları döndürür
        String s5 = "String Builder";
        System.out.println(s5.substring(3, 8));      // 3,4,5, 6 ve 7. karakterler gelir

        // .startsWith(String s) = s ile başlıyorsa true, başlamıyorsa false döndürür
        System.out.println(s5.startsWith("S"));  // void
        boolean bool = s5.startsWith("S");       // boolean,int,String
        System.out.println(s5.startsWith("s"));

        // .endsWith(String s) = s ,le biterse true, bitmezse false döndürür
        System.out.println(s5.endsWith("T"));

        // .indexOf(String s) = s'nin indeksini verir
        String s77 = "String Builder";
        System.out.println(s77.indexOf("B"));  // 7


        // .lastIndexof(String s) = s'nin en son görüldüğü indeksi verir
        System.out.println(s5.lastIndexOf("i"));  // 9

        // .split() metodu:
        String ilkKisim = s5.split(" ")[0];
        String sonkisim = s5.split(" ")[1];
        System.out.println("ilkKisim = " + ilkKisim);
        System.out.println("sonkisim = " + sonkisim);

        String s6 = "abc@gmail.com";
        String s7 = s6.split("\\.")[0].split("@")[1];
        System.out.println("s7 = " + s7);
        String s10 = "abc     @    gmail  .com";
        String yeni10 = s10.replaceAll("\\s+", " ");   // Birden çok boşluğu tek boşluğa dönüştürme
        System.out.println(yeni10);

        String s8 = "yeni bir nesne oluşturmak yerine mevcut bir nesneyi değiştirirsiniz.";
        String[] bolumler = s8.split(" ", 3);  // boşluklara göre 3 parçaya böl
        System.out.println(bolumler[0]);
        System.out.println(bolumler[1]);
        System.out.println(bolumler[2]);


        // .compaeTo() = iki Stringi alfabetik sıraya göre karşılaştırır. int değer döndürür
        // değer 0 isekelimeler eşit, değer - ise ilk kelime, ikinciden önce gelir,  değer + ise ikinci kelime önce gelir.
        String ilk = "Kalem";
        String ikinci = "KALEM";
        System.out.println(ilk.compareTo(ikinci));    //  K'lar aynı ikinci harfe bakar ve arada ne kadar fark olduğunu söyler.

        // .compaeToIgnoreCase() = iki Stringi büyük-küçük harf duyarlılığı olmaksızın alfabetik sıraya göre karşılaştırır
        // . int değer döndürür. değer 0 isekelimeler eşit, değer - ise ilk kelime
        // , ikinciden önce gelir,  değer + ise ikinci kelime önce gelir.

        // Regular Expressions = Regex'ler
        String s9 = "Marie Curie 1911 yılında radyum ve polonyumun keşfi ve araştırılmasındaki" +
                " rolünden ötürü Nobel Kimya Ödülü'ne layık görüldü. Böylece tarihte 2 Nobel Ödülüne sahip ilk kişi oldu.";

        String rakamlariYildizYap = s9.replaceAll("[0-9]", "*");
        String harflerHaricSil = s9.replaceAll("[^a-zA-Z]", "");
        String kucukHarfleriYuzdeYap = s9.replaceAll("[a-z]", "%");
        String buyukHarfleriBoslukYap = s9.replaceAll("[A-Z]", " ");
        String spaceHaricSil = s9.replaceAll("[^ ]", "");
        String sadeceabcSil = s9.replaceAll("[abc]", "");
        String turkceKarakterleriSil = s9.replaceAll("[ıİöÖüÜçÇşŞ]", "");

        System.out.println("yıldızKoy = " + rakamlariYildizYap);
        System.out.println("harflerHaricSil = " + harflerHaricSil);
        System.out.println("kucukHarfleriYuzdeYap = " + kucukHarfleriYuzdeYap);
        System.out.println("buyukHarfleriBoslukYap = " + buyukHarfleriBoslukYap);
        System.out.println("spaceHaricSil = " + spaceHaricSil);
        System.out.println("sadeceabcSil = " + sadeceabcSil);
        System.out.println("turkceKarakterleriSil = " + turkceKarakterleriSil);

    }
}
