package Task06;

import Task01.Person;
import Task01.Zarplata;

public class Premiya extends Zarplata {

    private double premija;// премия при условии работы сотрудника более 200ч


    public Premiya(double stavka, double pochasov, double sdelka, double premija) {

        super(stavka, pochasov, sdelka);
        this.premija = premija;
    }

    public double getPremija() { // возвращаем премию

        return premija;
    }


    public double getStawka(int dney) {
        double s = super.getStawka(dney) + getPremija();// берем результат из родительского класса и прибавляем премию
        return s;
    }

    public double getPoczasow(int chasy) {

        double s = super.getPoczasow(chasy) + getPremija();
        return s;
    }


    public double getSdelka() {
        double s = super.getSdelka() + getPremija();
        return s;
    }

    public double getSumma(Person6 person6) {// начисление зарплаты c учетом премии

        Person p;
        p = person6;
        return super.getSumma(p);

    }

}






