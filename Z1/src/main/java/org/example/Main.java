package org.example;
import java.util.Scanner;
import static java.lang.Math.sin;

public class Main {
    public static void main(String[] args) {
        int n;
        int fakt=1;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        n = ulaz.nextInt();
        for(int i=1;i<=n;i++){
            fakt=fakt*i;
        }
        double sinus = sin(n);
        System.out.println("Faktorijel unesenog broja je: "+fakt);
        System.out.println("Sinus unesenog broja je: "+sinus);
    }
}