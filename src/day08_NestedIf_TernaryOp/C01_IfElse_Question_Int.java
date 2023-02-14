package day08_NestedIf_TernaryOp;

import java.util.Scanner;

public class C01_IfElse_Question_Int {
    public static void main(String[] args) {
        /*
        Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece
        400’un kati olan yillar artik yildir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil= scan.nextInt();

        if (yil%4 != 0) System.out.println("artik yil degil");
        else if (yil%100 != 0) System.out.println("artik yil");
        else if (yil%400 == 0) System.out.println("artik yil");
        else System.out.println("artik yil degil");
    }
}
