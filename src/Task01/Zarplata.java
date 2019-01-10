package Task01;

import java.util.Scanner;

public class Zarplata {

    private double stavka;
    private double pochasov;
    private double sdelka;

    public Zarplata(double stavka, double pochasov, double sdelka) {// конструктор

        this.stavka = stavka;
        this.pochasov = pochasov;
        this.sdelka = sdelka;


    }

    public double getStawka(int countDni ) {// начисление по ставке
        double s = stavka *countDni ;
        return s;
    }

    public double getPoczasow(int countChasy) {// начисление по почасовой
        double s = pochasov * countChasy;
        return s;
    }

    public double getSdelka() {// начисление по сделке
        double s = sdelka;
        return s;
    }

    public double getSumma (Person p) {// начисление зарплаты

        double sum = 0;
        String formaOplaty= p.getFormaOplaty();

        if (formaOplaty.equals("ставка") ) {// если форма оплаты ставка


            sum = getStawka(p.getCountDni ());// то зарплату начисляем по ставке

        } else if ((p.getFormaOplaty()).equals("почасовая")  ) {


            sum = getPoczasow(p.getCountChasy());

        } else if ((p.getFormaOplaty()).equals("сдельная") ) {

            sum = getSdelka();

        }
        return sum;

    }



}
