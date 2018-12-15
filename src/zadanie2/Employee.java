package zadanie2;

public class Employee extends Person /*implements Comparable*/ {

    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        /*return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';*/
        return this.surname + "";
    }

    /*@Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        //return this.name.compareTo(e.name) * (-1);

        return -(e.age - this.age);
    }*/
}
