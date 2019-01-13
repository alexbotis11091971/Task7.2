package Task05;


import Task02.Nalogi;
import Task03.NalDeti;
import Task03.Person3;
import Task04.Person4;
import Task04.Valuta;

public class Ofshor extends Valuta {


    public Ofshor(double stavka, double pochasov, double sdelka, double nalogStavka, double nalogPoczasow, double nalogSdelka, double nalogDeti, double kurs) {

        super(stavka, pochasov, sdelka, 0, 0, 0, 0, kurs);

    }

    public double getPoczasow(Person5 person5, Nalogi nalogi, int countChasy) {

        Person4 person4;
        person4 = person5;
        return super.getPoczasow(person5, nalogi, countChasy);

    }


    public double getTugric(Person5 person5, Nalogi nalogi, int countChasy) {

        Person4 person4;
        person4 = person5;
        return super.getTugric(person5, nalogi, countChasy);
    }

    public double getNalogi (Person5 person5){

        Person4 person4;
        person4=person5;
        return super.getNalogi ( person4);
    }

    public double getSummaNalogi (Person5 person5){
        Person4 person4;
        person4=person5;
        return  super.getSummaNalogi(person4) ;

    }


}







