import java.util.*;

public class Gravitacija {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesi nadmorsko višino v metrih: ");
        int v = sc.nextInt();
        double rez = (6.674 * Math.pow(10, -11) * 5.972 * Math.pow(10, 24)) / Math.pow(6.371 * Math.pow(10, 6) + (double)v, 2);
        System.out.println("Gravitacijski pospešek je: " + rez);

        System.out.println("OIS je zakon!");
    }
}
