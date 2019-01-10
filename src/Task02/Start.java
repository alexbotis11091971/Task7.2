package Task02;

import Task01.Person;
import Task01.Zarplata;

import java.util.Scanner;

public class Start {

    public  void StartTask() {

        int countPerson = countPerson();// количество персонала
        Person2[] person= new Person2 [countPerson];// таблица для объектов класса Person

        Zarplata zarplata = new Zarplata(200, 20, 5500);// объект класса Zarplata
        Nalogi nalogi= new  Nalogi ( 200,20,5500,20,20,15);


        for (int i=0; i<countPerson;i++){ // заполняем таблицу объектами класса Person (персоналом)
            person [i] = readPerson();// // заполняем таблицу объектами класса Person (персоналом)

        }

        double itogSumma=0;// переменная для итоговой суммы
        for (Person2 persona:person){// для каждого человека

            Person p;
            p = persona;// ссылка суперкласса для применения метода getSumma(p)

            double Summa=zarplata .getSumma(p);// начисляем зарплату без налогов
            itogSumma=itogSumma+nalogi.getSummaNalogi( persona);// суммируем зарплату с налогами

            nalogi.printTab(persona,Summa);// печать таблицы


        }
        System.out.println ("Итого"+ "                 "+itogSumma);// печать итоговой суммы

    }



    public static int countPerson() {
        System.out.println ("Введите количество персонала");
        int count=Integer.valueOf(getString());
        return count;
    }
    public static  Person2  readPerson () {

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


        return new Person2 (fistName,formaOplaty,countDni,countChasy);
    }

    public static String getString(){
        return new Scanner(System.in).nextLine();
    }


}

