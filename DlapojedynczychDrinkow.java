package com.company;

import java.util.Scanner;

public class DlapojedynczychDrinkow {

    public static void main(String[] args) {


        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj swoją wagę [kg]");
        int weight = skaner.nextInt();
        System.out.println("Podaj swój wzrost [cm]");
        int height = skaner.nextInt();
        System.out.println("Podaj swój wiek");
        int age = skaner.nextInt();
        System.out.println("podaj swoją płeć Men/Women");
        String sex = skaner.next();


        System.out.println("Wprowadz ilosc wypitego alkoholu [ml]");
        int iloscWypitegoalkoholu = skaner.nextInt();
        System.out.println("Wprowadz moc alkoholu");
        double mocAlkoholu= skaner.nextDouble();

        int iloscWypitegoCzystegoAlkoholu = (int) (iloscWypitegoalkoholu*(mocAlkoholu*0.01)*0.79);
        System.out.println(iloscWypitegoCzystegoAlkoholu+"g");


        int UWRM = (int) 0.7;
        int UWRW = (int) 0.6;

        int TBWM = (int) ((int) 2.447 - (0.09156*age)+(0.1074*height)+(0.3362*weight));
        int TBWW = (int) (2.097+(0.1069*height)+(0.2466*weight));
        System.out.println("Podaj ilosc godzin picia alkoholu");
        int time = skaner.nextInt();

        if (sex.equalsIgnoreCase("MEN")) {
            System.out.println("zawartosc alkoholu we krwi w promilach to "
                    +((iloscWypitegoCzystegoAlkoholu / TBWM) * 0.8 - (time * 0.15))+"‰");
        }else {
            System.out.println("zawartosc alkoholu we krwi w promilach to "
                    +((iloscWypitegoCzystegoAlkoholu / TBWW) * 0.8 - (time * 0.15))+"‰");
        }
        System.out.println("Kalkulator pokazuje zawartość alkoholu we krwi po upływie czasu picia");

            System.out.println("ciekawe czy to sie wyswietli w kodzie ? "); 





    }
}
