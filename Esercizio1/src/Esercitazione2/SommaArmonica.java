package Esercitazione2;

public class SommaArmonica {
    public static void main(String[] args) {
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3./2));
        System.out.println(harmonicSum(20) == (55835135./15519504));
    }

    private static double harmonicSum(int n) {
        //inserite qui il vostro codice
        double result=0.0;
        for (int i=1;i<=n;i++)
            result+=1./i;
        return result;
    }
}
