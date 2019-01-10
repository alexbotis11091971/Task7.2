package Task03;

import Task01.Person;
import Task02.Nalogi;
import Task02.Person2;

public class NalDeti extends Nalogi {

    private double nalogDeti;

    public NalDeti(double stavka, double pochasov, double sdelka, double nalogStavka, double nalogPoczasow, double nalogSdelka, double nalogDeti) {

        super(stavka, pochasov, sdelka, nalogStavka, nalogPoczasow, nalogSdelka);


        this.nalogDeti = nalogDeti;

    }
    public double  getNalogDeti (){

        return nalogDeti ;
    }
    // переопределяем методы с учетом  НАЛОГОВ НА ДЕТЕЙ nalogDeti

    public   double  getStawka ( int countDni ){
        double s= super.getStawka(countDni)*(1- getNalogDeti()/(100-super.getNalogStavka()));
        return s ;
    }

    public double  getPoczasow (int countChasy  ){
        double s= super.getPoczasow (countChasy )*(1- getNalogDeti()/(100-super.getNalogPoczasow()));
        return s ;
    }
    public double  getSdelka (){
        double s= super.getSdelka()*(1-getNalogDeti()/(100-super.getNalogSdelka()));
        return s ;
    }


    public double getSummaNalogi (Person3 person3) {// начисление зарплаты С НАЛОГАМИ

        Person p;
        p = person3;
        double summa=0;

        String formaOplaty= p.getFormaOplaty();
        String deti= person3.getDeti();

        if (formaOplaty.equals("ставка") ) {// если форма оплаты ставка
            if (deti.equals("нет")){ // и детей нет

             summa= getStawka ( p.getCountDni());// начисление по ставке с учетом налогов на детей


            }

           else
               summa = super. getStawka ( p.getCountDni());// то зарплату начисляем по ставке

        } else if ((formaOplaty).equals("почасовая")  ) {

            if (deti.equals("нет")){

                summa= getPoczasow(p.getCountChasy());// начисление почасовой с учетом налогов на детей
            }

            else
                summa = super.getPoczasow(p.getCountChasy());

        } else if ((formaOplaty).equals("сдельная") ) {

            if (deti.equals("нет")){

                summa= getSdelka(); // начисления по сделке с учетом налогов на детей
            }

            else

            summa = super.getSdelka();

        }
        return summa;

    }

    public double getNalogi (Person3 person3) {// начисление налогов

        Person p;
        p = person3;
        double nalogi = 0;

        String formaOplaty= p.getFormaOplaty();
        String deti= person3.getDeti();

        if (formaOplaty.equals("ставка") ) {// если форма оплаты ставка

            if (deti.equals("нет")){

                nalogi =super. getNalogStavka ()+getNalogDeti () ; // налоги по ставке с учетом налогов на  дети

            }

            else


            nalogi = super. getNalogStavka ();// налоги  по ставке


        } else if ((formaOplaty).equals("почасовая")  ) {

            if (deti.equals("нет")){

                nalogi =super.getNalogPoczasow() + getNalogDeti() ;
            }

            else


            nalogi = super. getNalogPoczasow ( );

        } else if ((formaOplaty).equals("сделка") ) {

            if (deti.equals("нет")){

                nalogi =super.getNalogSdelka ()+ getNalogDeti() ;
            }

            else
            nalogi  =  super.getNalogSdelka ();

        }
        return nalogi;

    }








}

