package interfejsy;

public class Kot implements Pet {
    @Override
    public void dajGłos() {
        System.out.println("Miau miau");
    }

    @Override
    public void idz(int odleglosc) {
        System.out.println("ide " + odleglosc + " metrow");
    }

    @Override
    public void jedz() {
        System.out.println("Wybrzydzam !!");
    }
}
