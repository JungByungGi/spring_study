package decorator;

public class Test {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
    }
}
