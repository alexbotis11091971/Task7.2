package Task06;


import Task03.Person3;
import Task04.Person4;
import Task05.Person5;


public class Person6 extends Person5 {

    private int timeWork;


     public Person6 (String firstName,String formaOplaty, int countDni, int countChasy, String deti, String ofszor,int timeWork){
        super(firstName,formaOplaty,countDni,countChasy, deti,ofszor);

        this.timeWork = timeWork;

    }
    public double  getTimeWork (){

        return timeWork ;

    }


}

