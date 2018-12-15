package zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Jan", "Kowalski", 25));
        list.add(new Employee("Andrzej", "Malinowski", 23));
        list.add(new Employee("Karol", "Bereda", 55));
        list.add(new Employee("Piotr", "Wiśniewski", 43));
        list.add(new Employee("Mateusz", "Cruise", 70));
        list.add(new Employee("Ania", "Deep", 11));

        System.out.println(list);

        Employee e1 = new Employee("Jan", "Kowalski", 25);
        Employee e2 = new Employee("Jan", "Kowalski", 25);

        //System.out.println(e1.compareTo(e2));

        Collections.sort(list, new EmployeeSurnameComparator(true));

        System.out.println(list);
    }
}
