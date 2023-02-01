package Esercitazione2;

public class Fattoriale {
    public static void main(String[] args) {
        System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
    }

    private static double factorial(int n) {
        //inserite il vostro codice qui
        double result=1;
        if (n==0)
            return result;
        else
        {
            for (int i=1;i<=n;i++)
                result*=i;
            return result;
        }
    }
}
