package Task03;



import Task02.Person2;

public class Person3 extends Person2 {


    private String deti;


    public Person3(String firstName, String formaOplaty, int countDni, int countChasy, String deti) {

        super(firstName, formaOplaty,countDni,countChasy);
        this.deti = deti;

    }

    public String getDeti() {

        return deti;


    }



}

