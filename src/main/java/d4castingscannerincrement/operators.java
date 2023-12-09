package d4castingscannerincrement;

public class operators{
    public static void main(String[] args) {

        //Logical operators(lojik operatorler)

        //AND- VE (&&) İşleminden true alabılmek için her sey true olmalıdır.(çarpma)
        //OR-VEYA (||)İŞLEMİNDE bır tane TRUE sonucu TRUE yapmaya yeterlidir.
        //NOT-DEĞİL(!)işleminde TRUE olanı FALSE,false olanı TRUE yapar.

           //!true = false
           //!false =true
           //!!true =true(tersın tersı kendine eşittir)


        //comparision (karşılastırma ) operators
        //< ,> ,<=,>= ,==, !=
        //karsılastırma operatorlerl kullandıgınızda sonuç kesınlıkle BOOLEAN ( true-false )alırsınız.


        boolean a=3<5; //true
        boolean b=2+3 != 5;//false
        boolean c=2+3*5>=19;//false
        System.out.println(a&&b);//false
        System.out.println(a|| b||c);//true



    }
}
