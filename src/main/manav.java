package main;

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut=2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00;
        double a , e , d , m , p , toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        a = inp.nextDouble();
        System.out.print("Elma kaç kilo : ");
        e = inp.nextDouble();
        System.out.print("Domates kaç kilo : ");
        d = inp.nextDouble();
        System.out.print("Muz kaç kilo : ");
        m = inp.nextDouble();
        System.out.print("Patlican kaç kilo : ");
        p = inp.nextDouble();
        toplam = (armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);

        System.out.println("Toplam Fiyat : " +toplam);




    }

}
