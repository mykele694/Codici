import java.util.Scanner;

public class Labirinto {
    public static void main(String[] args) {
        char[][] lab={
                {'-','-','W','W','-'},
                {'-','W','-','W','-'},
                {'P','W','-','W','W'},
                {'-','-','W','-','E'},
                {'W','-','-','-','W'}};
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char movement=input.toLowerCase().charAt(0);

    }

}
