package wyjatki;

import zadanie3.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        Person p = null;

        try {
            list.get(0);
            p.getAge();
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Inny błąd !!");
        } finally {

        }*/
        /*try {
            System.out.println(Calculator.divide(1,0));
        } catch (ArithmeticException e) {
            System.out.println("Wyjątek oddelegowany !!");
        }*/

        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        try {
            validateLogin(login);
            System.out.println("Udało się !!");
        } catch (LoginValidationException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            Main.main(args);
        }

    }

    public static void validateLogin(String login) throws LoginValidationException{
        if(login.length() < 6) {
            throw new LoginValidationException();
        }
    }
}
