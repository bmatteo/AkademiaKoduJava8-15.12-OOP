package zadanie2;

import java.util.Comparator;

public class EmployeeSurnameComparator implements Comparator<Employee> {
    private int sortType = 1;

    public EmployeeSurnameComparator(boolean sortType) {
        if(sortType)
            this.sortType = this.sortType*(-1);
    }
    @Override
    public int compare(Employee employee, Employee t1) {
        return (employee.getSurname().compareTo(t1.getSurname()))*this.sortType;
    }
}
