package interfejsy;

public class Dog implements Pet {
    @Override
    public void dajGłos() {
        System.out.println("Hau hau !!");
    }

    @Override
    public void idz(int odleglosc) {
        System.out.println("biegne " + odleglosc+1 + " metrow !!");
    }
}
