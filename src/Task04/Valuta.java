package Task04;

import Task01.Zarplata;
import Task02.Nalogi;
import Task02.Person2;
import Task03.NalDeti;
import Task03.Person3;

public class Valuta extends NalDeti {

    private double kurs;

    public Valuta (double stavka, double pochasov, double sdelka, double nalogStavka, double nalogPoczasow, double nalogSdelka, double nalogDeti,double kurs) {

        super(stavka, pochasov, sdelka, nalogStavka, nalogPoczasow, nalogSdelka,nalogDeti);


        this.kurs =kurs ;

    }

   // public double  getPoczasow ( int countChasy ){
        // переопределяем  метод по часовой оплаты getPoczasow  из родительского класса class NalDeti extends Nalogi
        // те рассматриваем случай когда дети есть


       // double s= super.getPoczasow(  countChasy   ); //  возвращаем результат из родительского метода super.getPoczasow(  pochasov, chasy, nalogPoczasow, nalogDeti)
       // s= s*0.5;// делим на половину
       // return s;
   // }

    public double getKurs (){

       return kurs;

    }

    public double  getPoczasow (Person4 person4,Nalogi nalogi, int countChasy ) {
        // переопределяем  метод по часовой оплаты getPoczasow  из родительского класса class NalDeti extends Nalogi
        // те рассматриваем случай когда дети есть
        double s=0;
         if (person4.getDeti().equals("нет")) {

             s = super.getPoczasow(countChasy); //  возвращаем результат из родительского метода super.getPoczasow(  pochasov, chasy, nalogPoczasow, nalogDeti)
            s = s * 0.5;// делим на половину

        } else {

       s= nalogi.getPoczasow(countChasy);
            s = s * 0.5;
        }
        return s;

    }


    public double  getTugric (Person4 person4,Nalogi nalogi, int countChasy ){ // заводим метод для подсчета в тугриках в случае когда дети есть

        double s= getPoczasow( person4, nalogi, countChasy   );// берем результат нашего метода getPoczasow

        s= s*kurs;// высчитываем сумму в тугриках по курсу
        return s ;// и возвращаем ее


    }

    public double  getTugric ( double summa){ // перегружаем метод для подсчета в тугриках когда детей нет



        summa= (summa*kurs);// высчитываем сумму в тугриках по курсу
        return summa ;// и возвращаем ее


    }
    public double getSummaNalogi (Person4 person4){
       Person3 person3;
       person3=person4;
       return  getSummaNalogi(person3) ;

    }
    public double getNalogi (Person4 person4){

        Person3 person3;
        person3=person4;
        return getNalogi ( person3);
    }

}

