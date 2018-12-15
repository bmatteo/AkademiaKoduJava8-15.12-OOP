package zadanie2;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

    private int sortType = 1;

    public EmployeeAgeComparator(boolean sortType) {
        if(sortType)
            this.sortType = this.sortType*(-1);
    }

    @Override
    public int compare(Employee employee, Employee t1) {
        return (employee.getAge() - t1.getAge())*this.sortType;
    }
}
