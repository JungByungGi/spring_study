package adapter;

public class Test {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter1 = new Adapter(cleaner); // 220v -> 110v
        connect(adapter1);

        Aircon aircon = new Aircon();
        Electronic110V adapter2 = new Adapter(aircon); // 220v -> 110v
        connect(adapter2);
    }

    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
