package interfejsy;

public interface Pet {
    void dajGłos();
    void idz(int odleglosc);

    default void jedz() {
        System.out.println("Jem !!");
    }
}
