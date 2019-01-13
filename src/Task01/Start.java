package Task01;

import java.util.Scanner;

public class Start {

    public  void StartTask() {

        int countPerson = countPerson();// количество персонала
        Person [] person= new Person [countPerson];// таблица для объектов класса Person
        Zarplata zarplata = new Zarplata(200, 20, 5500);// объект класса Zarplata


        for (int i=0; i<countPerson;i++){ // заполняем таблицу объектами класса Person (персоналом)
            person [i] = readPerson();// // заполняем таблицу объектами класса Person (персоналом)

        }

        double itogSumma=0;
        for (Person persona:person){// для каждого человека

            printTab(persona,zarplata.getSumma( persona));// начисляем зарплату
            itogSumma=itogSumma+zarplata.getSumma( persona);
        }

        System.out.println ("Итого"+ "                 "+itogSumma);

    }



    public static int countPerson() {
        System.out.println ("Введите количество персонала");
        int count=Integer.valueOf(getString());
        return count;
    }
    public static  Person  readPerson () {

        System.out.println ("Введите фамилию сотрудника");
        String fistName= getString();

        System.out.println ("Введите форму оgлаты сотрудника");
        System.out.println();
        String formaOplaty =getString();

        int countDni=0;
        int countChasy=0;

        if (formaOplaty.equals("ставка") ) {
            System.out.println ("Введите количество дней");
            countDni = Integer.valueOf(getString());}

        if (formaOplaty.equals("почасовая") ) {

            System.out.println ("Введите количество часов");

            countChasy =Integer.valueOf(getString());}


        return new Person (fistName,formaOplaty,countDni,countChasy);// возвращаем объект класса Person
    }

    public static String getString(){
        return new Scanner(System.in).nextLine();
    }

    public static void printTab(Person p,  double summa) { // печать результата

        String sum = Double.toString(summa);
        System.out.print(p.getfistName() +"  " +p.getFormaOplaty() +"   " + sum);
        System.out.println();
    }

}


