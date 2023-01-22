public class Adidas extends Shoes{
    Adidas(String madeof, int year) {
        super(madeof, year);
    }

    @Override
    void history() {
        System.out.println("stolen history from super class");
        super.history();
    }

    @Override
    void form() {
        System.out.println("my form is best for runners you can ask them");
    }
}
