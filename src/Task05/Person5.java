package Task05;

import Task03.Person3;
import Task04.Person4;


public class Person5 extends Person4 {

    private String ofshor;

    public Person5(String firstName,String formaOplaty, int countDni, int countChasy, String deti, String ofszor) {

        super(firstName,formaOplaty, countDni, countChasy, deti);
        this.ofshor= ofszor;


    }

    public String getOfshor() {

        return ofshor;


    }

}

