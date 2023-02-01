package Esercitazione2;

public class Palindromi {
    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    private static boolean isPalindrome(String s) {
        //inserite qui il vostro codice
    for (int i=0;i<s.length()/2;i++)
        if (s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
    return true;
        //System.out.println(sb);

        /*String sc2= "";
        for (int i=(s.length()-1);i>=0;i--)
            sc2 = sc2+s.charAt(i);
        System.out.println(sc2);
       return  (s.equals(sb)) ? true:false; */

        /*        StringBuilder sb= new StringBuilder();
        sb.append(s);
        sb=sb.reverse();
        return  (s.equals(sb)) ? true:false;
         */

    }

}
