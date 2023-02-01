package Esercitazione2;
import java.util.Scanner;

public class InvertiStringhe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        //inserite qui il vostro codice
        /*String sc2= "";
        for (int i=(s.length()-1);i>=0;i--)
            sc2 = sc2+s.charAt(i);
        System.out.println(sc2);*/
        StringBuilder sb= new StringBuilder();
        sb.append(s);
        sb=sb.reverse();
        System.out.println(sb);
    }
}