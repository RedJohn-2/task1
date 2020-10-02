package denis.korchagin;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        double r1 = inputRadius1();
        double r2 = inputRadius2();
        outputShadedArea(r1,r2);
    }

    static double inputRadius1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input small radius = ");
        return scanner.nextDouble();
    }

    static double inputRadius2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input big radius = ");
        return scanner.nextDouble();
    }

    static double findAreaCircle1(double r1) {
        return Math.PI * r1 * r1;
    }

    static double findAreaCircle2(double r2) {
        return Math.PI * r2 * r2;
    }

    static double findAreaSquare(double r2) {
        return 4 * r2 * r2;
    }

    static double findAreaBetweenCircle2AndCircle1(double r1, double r2) {
        return findAreaCircle2(r2) - findAreaCircle1(r1);
    }

    static double findAreaBetweenCircle2AndSquare(double r2) {
        return findAreaSquare(r2) - findAreaCircle2(r2);
    }

    static double findAreaA(double r1) {
        return 0.5 * findAreaCircle1(r1);
    }

    static double findAreaB(double r1, double r2) {
        return 0.375 * findAreaBetweenCircle2AndCircle1(r1, r2);
    }

    static double findAreaC(double r2) {
        return 0.25 * findAreaBetweenCircle2AndSquare(r2);
    }

    static double findShadedArea(double r1, double r2) {
        return findAreaA(r1) + findAreaB(r1, r2) + findAreaC(r2);
    }

    static void outputShadedArea(double r1, double r2) {
        System.out.println(findShadedArea(r1, r2));
    }

}
