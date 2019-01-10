import Task06.Start;

import java.util.Scanner;
import static java.lang.System.*;
public class Main {

    public static void main(String[] args) {

        String userChoice = "";
        Scanner scan = new Scanner(in);

        while (!userChoice.toLowerCase().equals("exit")) {

            out.println();
            out.println("Введите номер задания от 1 до 6. Введите 'exit' для того, чтобы выйти.");

            userChoice = scan.nextLine();

            switch (userChoice.toLowerCase()) {
                case "1":
                    out.println("Выполняется код задания №1...");
                    Task01.Start startTask1 = new Task01.Start();
                   startTask1.StartTask();
                    out.println("Выполнение завершено.");
                    break;
                case "2":
                    out.println("Выполняется код задания №2...");
                    Task02.Start startTask2 = new Task02.Start();
                    startTask2.StartTask();
                    out.println("Выполнение завершено.");
                    break;
                case "3":
                    out.println("Выполняется код задания №3...");
                    Task03.Start startTask3 = new Task03.Start();
                    startTask3.StartTask();
                    out.println("Выполнение завершено.");
                    break;
                case "4":
                    out.println("Выполняется код задания №4...");
                   Task04. Start startTask4 = new Task04.Start();
                    startTask4.StartTask();
                    out.println("Выполнение завершено.");
                    break;
                case "5":
                    out.println("Выполняется код задания №5...");
                   Task05.Start startTask5 = new Task05.Start();
                    startTask5.StartTask();
                    out.println("Выполнение завершено.");
                    break;
                case "6":
                    out.println("Выполняется код задания №6...");

                   Task06.Start startTask6 = new  Task06.Start();
                    startTask6.StartTask();
                    out.println("Выполнение завершено.");
                    break;
                case "exit":
                    out.println("Завершение работы...");
                    out.println("Выход.");
                    break;
                default:
                    out.println("Команда не распознана. Повторите ввод.");
                    break;
            }


        }



    }

}










