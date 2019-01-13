package Task01;

public class Person {
    private  String firstName;
      private String formaOplaty;
    private int countDni;
    private int countChasy;

    public Person(String firstName, String formaOplaty,int countDni,int countChasy ){

        this.firstName= firstName;
        this.formaOplaty=formaOplaty;
        this.countDni= countDni;
        this.countChasy=countChasy;

    }

    public String getfistName (){

        return firstName;
    }

    public String getFormaOplaty (){

        return formaOplaty;
    }
    public int getCountDni (){

        return countDni;
    }
    public int getCountChasy (){

        return countChasy;
    }


}
