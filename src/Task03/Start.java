package Task03;

import Task01.Person;
import Task01.Zarplata;
import Task02.Nalogi;
import Task02.Person2;

import java.util.Scanner;

public class Start {

    public  void StartTask() {

        int countPerson = countPerson();// количество персонала
        Person3[] person= new Person3 [countPerson];// таблица для объектов класса Person

        Zarplata zarplata = new Zarplata(200, 20, 5500);// объект класса Zarplata

        NalDeti nalDeti= new NalDeti (200,20,5500,20,20,15,5);


        for (int i=0; i<countPerson;i++){ // заполняем таблицу объектами класса Person (персоналом)
            person [i] = readPerson();// // заполняем таблицу объектами класса Person (персоналом)

        }

        for (Person3 persona:person){// для каждого человека

            Person p;
            p = persona;

            double Summa=zarplata .getSumma(p);// сумма без учета налогов



            printTab( persona,nalDeti.getNalogi(persona), Summa,nalDeti.getSummaNalogi(persona) );

                 //фамилия    налоги с учетом детей,      сумма, зарплата с учетом налогов на детей
        }

    }



    public static int countPerson() {
        System.out.println ("Введите количество персонала");
        int count=Integer.valueOf(getString());
        return count;
    }
    public static  Person3  readPerson () {

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

        System.out.println ("Дети у  сотрудника есть");
        String deti= getString();

        return new Person3 (fistName,formaOplaty,countDni,countChasy,deti);// возвращаем объект класса Person
    }

    public static String getString(){
        return new Scanner(System.in).nextLine();
    }


    public static void printTab(Person3 person3,double Nalogi,double Summa,double SummaNalogi ) { // печать результата

        Person p; // заводим ссылку на объект суперкласса
        p = person3;

        System.out.print(p.getfistName() +"  " + Nalogi  +"   " +Summa +"    " + SummaNalogi );

        System.out.println();
    }


}
