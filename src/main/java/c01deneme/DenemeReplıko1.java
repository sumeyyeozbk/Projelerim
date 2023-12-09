package c01deneme;

import java.util.Scanner;

public class DenemeReplıko1 {
    public static void main(String[] args) {

       // Kullanıcıdan dikdörtgenin kenar uzunluklarını
        // alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen kisa kenarı girin");
        int kisaKenar= scan.nextInt();
        System.out.println("lütfen uzun kenarı girin");
        int UzunKenar=scan.nextInt();
        System.out.println("dikdörtkenın alanı = " + UzunKenar*kisaKenar);//30
        System.out.println("dikdörtgenın cevresı="+2*(UzunKenar+kisaKenar));//22



    }

}
