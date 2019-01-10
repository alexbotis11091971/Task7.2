
package Task02;

import Task01.Person;
import Task01.Zarplata;

public class Nalogi extends Zarplata {
// наследование от Zarplata

    private  double nalogStavka;
    private double  nalogPoczasow;
    private double  nalogSdelka;

    public Nalogi (double stavka,double pochasov,double sdelka,double nalogStavka,double nalogPoczasow,double  nalogSdelka){


        super ( stavka, pochasov, sdelka);// конструктор суперкласса

        this.nalogStavka= nalogStavka;
        this.nalogPoczasow= nalogPoczasow;
        this.nalogSdelka= nalogSdelka;


    }

    public double  getNalogStavka (){

        return nalogStavka ;
    }

    public double  getNalogPoczasow ( ){

        return nalogPoczasow ;
    }
    public double  getNalogSdelka (){

        return nalogSdelka ;
    }




    // перегрузка методов суперкласса
    public double  getStawka ( int countDni ){
        double s= super.getStawka( countDni )*(1-nalogStavka/100);
        return s ;
    }

    public double  getPoczasow ( int countChasy ){
        double s= super.getPoczasow( countChasy)*(1- nalogPoczasow/100);
        return s ;
    }
    public double  getSdelka (){
        double s= super.getSdelka()*(1-nalogSdelka/100);
        return s ;
    }



    public double getSummaNalogi (Person2 person2) {// начисление зарплаты С НАЛОГАМИ

        Person p;
        p = person2;

       return super.getSumma(p);

    }




    public double getNalogi (Person2 person2) {// начисление налогов

        Person p;
        p = person2;
        double nalogi = 0;
        String formaOplaty= p.getFormaOplaty();

        if (formaOplaty.equals("ставка") ) {// если форма оплаты ставка


            nalogi = getNalogStavka ();// то зарплату начисляем по ставке

        } else if ((p.getFormaOplaty()).equals("почасовая")  ) {


            nalogi =  getNalogPoczasow ( );

        } else if ((p.getFormaOplaty()).equals("сдельная") ) {

            nalogi  =  getNalogSdelka ();

        }
        return nalogi;

    }






    public void printTab(Person2 person2, double Summa) { // печать результата

         Person p; // заводим ссылку на объект суперкласса
        p = person2;

        //String sum = Double.toString(summa);
        System.out.print(p.getfistName() +"  " + getNalogi ( person2) +"   " +Summa +"    " + getSummaNalogi ( person2) );

        System.out.println();
    }


}



