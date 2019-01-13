package Task06;

import Task01.Person;
import Task01.Zarplata;
import Task02.Nalogi;
import Task02.Person2;
import Task03.NalDeti;
import Task03.Person3;
import Task04.Person4;
import Task04.Valuta;
import Task05.Ofshor;
import Task05.Person5;

import java.util.Scanner;

public class Start {

    public  void StartTask() {

        int countPerson = countPerson();// количество персонала
        Person6[] person = new Person6[countPerson];// таблица для объектов класса Person

        Zarplata zarplata = new Zarplata(200, 20, 5500);// объект класса Zarplata
        Nalogi nalogi = new Nalogi(200, 20, 5500, 20, 20, 15);
        // NalDeti nalDeti = new NalDeti(200, 20, 5500, 20, 20, 15, 5);

        Valuta valuta = new Valuta(200, 20, 5500, 20, 20, 15, 5, 0.125);
        Ofshor ofshor = new Ofshor(200, 20, 5500, 0, 0, 0, 0, 0.125);
        Premiya premiya = new Premiya(200, 20, 5500, 100);


        for (int i = 0; i < countPerson; i++) {
            person[i] = readPerson();// // заполняем таблицу объектами класса Person (персоналом)

        }

        for (Person6 persona : person) {// для каждого человека

            Person p; // присваиваем ссылку суперкласса
            p = persona;// нашей ссылке на  объукт
            double Summa = 0;

            if (persona.getTimeWork() > 200 && persona.getOfshor().equals("нет")) {

                Summa = premiya.getSumma(persona);// начисляем сумму с учетом премии


            } else

                Summa = zarplata.getSumma(p);// сумма без учета премии

            if (persona.getOfshor().equals("да")) { // если в офшоре

                if (persona.getFormaOplaty().equals("почасовая")) {//  и если форма оплаты почасовая

                   double oplata = ofshor.getPoczasow(persona, nalogi, p.getCountChasy());//должен быть вызван метод getPoczasow из Ofshor
                    double tugric = ofshor.getTugric(persona, nalogi, p.getCountChasy());// иполовина суммы из valuta.getTugric   из Ofshor
                    printTab(persona, ofshor.getNalogi(persona), Summa, oplata, tugric);

                } else {


                    printTab(persona, ofshor.getNalogi(persona), Summa, Summa);// иначе  налогов не платим

                }


            } else {// если не офшоре
                if (persona.getFormaOplaty().equals("почасовая")) {// и форма оплаты почасовая

                    double oplata = valuta.getPoczasow(persona, nalogi, p.getCountChasy());//должен быть вызван метод getPoczasow из Valuta
                    double tugric = valuta.getTugric(persona, nalogi, p.getCountChasy());// иполовина суммы из valuta.getTugric
                    printTab(persona, valuta.getNalogi(persona), Summa, oplata, tugric);


                } else {

                    printTab(persona, valuta.getNalogi(persona), Summa, valuta.getSummaNalogi(persona));
                    //фамилия    налоги с учетом детей,      сумма, зарплата с учетом налогов на детей

                }


            }

        }
    }



    public static int countPerson () {
        System.out.println("Введите количество персонала");
        int count = Integer.valueOf(getString());
        return count;
    }
    public static Person6 readPerson () {

        System.out.println("Введите фамилию сотрудника");
        String fistName = getString();

        System.out.println("Введите форму оgлаты сотрудника");
        System.out.println();
        String formaOplaty = getString();

        int countDni = 0;
        int countChasy = 0;

        if (formaOplaty.equals("ставка")) {
            System.out.println("Введите количество дней");
            countDni = Integer.valueOf(getString());
        }

        if (formaOplaty.equals("почасовая")) {

            System.out.println("Введите количество часов");

            countChasy = Integer.valueOf(getString());
        }

        System.out.println("Дети у  сотрудника есть");
        String deti = getString();

        System.out.println("Сотрудник в офшоре");
        String ofshor = getString();

        System.out.println("Введите количecтво отработанных часов");
        int timeWork = Integer.valueOf(getString());




        //new Person (fistName,formaOplaty,countDni,countChasy)- возвращаем объект класса Person
        return new Person6(fistName, formaOplaty, countDni, countChasy, deti, ofshor,timeWork);
    }

    public static String getString () {
        return new Scanner(System.in).nextLine();
    }



    public static void printTab (Person6 person6,double Nalogi, double Summa, double SummaNalogi )
    { // печать результата

        Person p; // заводим ссылку на объект суперкласса
        p = person6;

        //String sum = Double.toString(summa);
        System.out.print(p.getfistName() + "  " + Nalogi + "   " + Summa + "    " + SummaNalogi);

        System.out.println();
    }

    public static void printTab (Person6 person6,double Nalogi, double Summa, double SummaNalogi,double tugric )
    { // печать результата

        Person p; // заводим ссылку на объект суперкласса
        p = person6;


        System.out.print(p.getfistName() + "  " + Nalogi + "   " + Summa + "    " + SummaNalogi +"  / "+ tugric);

        System.out.println();
    }
}

