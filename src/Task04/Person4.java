package Task04;

import Task03.Person3;

public class Person4 extends Person3 {


    // String formaOplaty;


  public Person4(String firstName, String formaOplaty, int countDni, int countChasy, String deti){

      super(firstName, formaOplaty,countDni,countChasy,deti);

    }

   public String getFormaOplaty() {

        return super.getFormaOplaty();


    }

    public String getDeti() {

        return super.getDeti();
    }


}

